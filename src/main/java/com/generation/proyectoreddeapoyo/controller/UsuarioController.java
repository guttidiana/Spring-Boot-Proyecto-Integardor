package com.generation.proyectoreddeapoyo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectoreddeapoyo.model.Usuario;
import com.generation.proyectoreddeapoyo.service.UsuarioService;

@Controller
@CrossOrigin("*")
@RestController
public class UsuarioController {
    
    private UsuarioService usuarioService;

    public UsuarioController(@Autowired UsuarioService usuarioService){
        this.usuarioService = usuarioService;

    }

    @PostMapping("/usaurio/Save")
    public void guardarUsuario(@RequestBody Usuario usuario){
        usuarioService.saveUsuario(usuario);
    }


    //put editar datos en la base
    @PutMapping("/usaurio/Update")
    public void editarUsaurio(@RequestBody Usuario usuario){
        usuarioService.updateUsaurio(usuario);
    }


}
