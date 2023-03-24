package com.generation.proyectoreddeapoyo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.proyectoreddeapoyo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    //encontrar el usuario por el username
    Usuario findUserByUsername(String username);
}
