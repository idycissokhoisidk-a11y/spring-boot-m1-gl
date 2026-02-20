package com.endtoend.demo.entity;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAuthorities_ShouldReturnUserRole() {
        User user = User.builder()
                .email("test@example.com")
                .password("password")
                .role(Role.USER)
                .build();

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();

        assertEquals(1, authorities.size());
        assertTrue(authorities.stream()
                .anyMatch(auth -> auth.getAuthority().equals("USER")));
    }

    @Test
    void getUsername_ShouldReturnEmail() {
        User user = User.builder()
                .email("test@example.com")
                .password("password")
                .build();

        assertEquals("test@example.com", user.getUsername());
    }

    @Test
    void accountFlags_ShouldAllBeTrue() {
        User user = User.builder()
                .email("test@example.com")
                .password("password")
                .build();

        assertTrue(user.isAccountNonExpired());
        assertTrue(user.isAccountNonLocked());
        assertTrue(user.isCredentialsNonExpired());
        assertTrue(user.isEnabled());
    }
}
