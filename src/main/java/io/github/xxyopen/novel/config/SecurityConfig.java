package io.github.xxyopen.novel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().permitAll() // Allow all requests without authentication
                )
                .httpBasic(httpBasic -> httpBasic.disable()) // Disable HTTP Basic Authentication
                .formLogin(formLogin -> formLogin.disable()); // Disable form login

        return http.build();
    }
}
