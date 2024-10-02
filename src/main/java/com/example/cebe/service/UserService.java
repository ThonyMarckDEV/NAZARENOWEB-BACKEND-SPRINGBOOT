package com.example.cebe.service;

import com.example.cebe.model.Usuario;
import com.example.cebe.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Usuario authenticate(String username, String rawPassword) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByUsername(username);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            // Verifica si la contraseña en texto plano coincide con la hasheada
            if (passwordEncoder.matches(rawPassword, usuario.getPassword())) {
                return usuario; // Si la contraseña coincide
            }
        }
        return null; // Si la contraseña es incorrecta o el usuario no existe
    }
}
