package com.generation.proyectoreddeapoyo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectoreddeapoyo.model.Usuario;
import com.generation.proyectoreddeapoyo.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void saveUsuario(Usuario usuario){
        this.usuarioRepository.save(usuario);
    }

    public void updateUsaurio(Usuario usuario){
        this.usuarioRepository.save(usuario);
    }
    /* 
    public void deleteUsuario(Integer id){
        usuarioRepository.deleteById(id);
    }
    */
    
}
