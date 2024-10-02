package com.example.cebe.controller;

import com.example.cebe.model.Usuario;
import com.example.cebe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Autentica al usuario
        Usuario usuario = userService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());

        if (usuario != null) {
            // Devuelve los datos solicitados
            UsuarioResponse response = new UsuarioResponse(
                usuario.getIdUsuario(),
                usuario.getUsername(),
                usuario.getRol(),
                usuario.getCorreo()
            );
            return ResponseEntity.ok(response);
        } else {
            // Si la autenticación falla, devuelve 401
            return ResponseEntity.status(401).body("Credenciales incorrectas");
        }
    }

    // Clase para recibir los datos del login
    public static class LoginRequest {
        private String username;
        private String password;

        // Getters y Setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    // Clase para devolver la respuesta con los datos del usuario
    public static class UsuarioResponse {
        private Long idUsuario;
        private String username;
        private String rol;
        private String correo;

        public UsuarioResponse(Long idUsuario, String username, String rol, String correo) {
            this.idUsuario = idUsuario;
            this.username = username;
            this.rol = rol;
            this.correo = correo;
        }

        // Getters y Setters
        public Long getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(Long idUsuario) {
            this.idUsuario = idUsuario;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getRol() {
            return rol;
        }

        public void setRol(String rol) {
            this.rol = rol;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
    }
}
