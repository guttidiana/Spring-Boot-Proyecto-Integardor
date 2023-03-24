package com.generation.proyectoreddeapoyo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectoreddeapoyo.model.Publicacion;
import com.generation.proyectoreddeapoyo.service.PublicacionService;

@Controller
@CrossOrigin("*")
@RestController
public class PublicacionController {
    
    private PublicacionService publicacionService;

    public PublicacionController(@Autowired PublicacionService publicacionService){
        this.publicacionService = publicacionService;
    }

    @PutMapping("/publicacion/Update")
    public void editarPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.updatePublicacion(publicacion);
    }

    @PutMapping("/publicacion/Save")
    public void guardarPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.savePublicacion(publicacion);
    }

    @DeleteMapping("/publicacion/Delete/{id}")
    public void eliminarEstudiante(@PathVariable Integer id){
        publicacionService.deletePublicacion(id);
    }

    @GetMapping("/publicacion/findAll")
    public List<Publicacion> obtenerDatos(){
        return publicacionService.findAll();

    }

}
