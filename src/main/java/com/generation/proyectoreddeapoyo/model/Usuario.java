package com.generation.proyectoreddeapoyo.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "usuarios")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "nombre")
    @Size(min = 5, message = "Debe introducir mínimo 5 caracteres")
    private String username;

    @Column(name = "correo")
    @Email
    private String email;

    @Range(min = 6, message = "Debe ingresar mínimo 6 caracteres")
    private String password;

    private boolean accountNonLocked;
    
    @Override
    public Collection<? extends GrantedAuthority>(){
        return List.of(() -> "Read"); 
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public boolean getAccountNonLocked() {
        return accountNonLocked;

    }

    @Override
    public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    
}
