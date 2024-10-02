package com.example.cebe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")  // Coincide con el nombre de la columna en la base de datos
    private Long idUsuario;

    @Column(name = "username")  // Coincide con el nombre de la columna en la base de datos
    private String username;

    @Column(name = "rol")  // Coincide con el nombre de la columna en la base de datos
    private String rol;

    @Column(name = "nombres")  // Coincide con el nombre de la columna en la base de datos
    private String nombres;

    @Column(name = "apellidos")  // Coincide con el nombre de la columna en la base de datos
    private String apellidos;

    @Column(name = "dni")  // Coincide con el nombre de la columna en la base de datos
    private String dni;

    @Column(name = "correo", nullable = true)  // Es opcional, puede ser nulo
    private String correo;

    @Column(name = "edad")
    private int edad;

    @Column(name = "nacimiento", nullable = true)  // Es opcional, puede ser nulo
    private String nacimiento;

    @Column(name = "sexo", nullable = true)  // Es opcional, puede ser nulo
    private String sexo;

    @Column(name = "direccion", nullable = true)  // Es opcional, puede ser nulo
    private String direccion;

    @Column(name = "telefono", nullable = true)  // Es opcional, puede ser nulo
    private String telefono;

    @Column(name = "departamento", nullable = true)  // Es opcional, puede ser nulo
    private String departamento;

    @Column(name = "password")  // Coincide con el nombre de la columna en la base de datos
    private String password;

    @Column(name = "status")  // Coincide con el nombre de la columna en la base de datos
    private String status;

    @Lob  // Indica que es un campo grande de datos binarios (blob)
    @Column(name = "perfil", nullable = true)  // Es opcional, puede ser nulo
    private byte[] perfil;

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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getPerfil() {
        return perfil;
    }

    public void setPerfil(byte[] perfil) {
        this.perfil = perfil;
    }
}
