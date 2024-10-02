package com.example.cebe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())  // Nueva forma de deshabilitar CSRF en Spring Security 6.1
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/api/login").permitAll()  // Permitir acceso público a /api/login
                .anyRequest().permitAll()  // Requerir autenticación para cualquier otro endpoint
            );
        return http.build();
    }
}
