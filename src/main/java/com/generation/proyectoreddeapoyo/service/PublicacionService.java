package com.generation.proyectoreddeapoyo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.proyectoreddeapoyo.model.Publicacion;
import com.generation.proyectoreddeapoyo.repository.PublicacionRepository;


@Service
@Transactional
public class PublicacionService {
    
    private PublicacionRepository publicacionRepository;

    public PublicacionService(Publicacion publicacion){
        this.publicacionRepository = publicacionRepository;

    }

    public void savePublicacion(Publicacion publicacion){
        this.publicacionRepository.save(publicacion);
    }

    public void updatePublicacion(Publicacion publicacion){
        this.publicacionRepository.save(publicacion);
    }

    public void deletePublicacion(Integer id){
        publicacionRepository.deleteById(id);
    }

    public List<Publicacion> findAll(){
        return publicacionRepository.findAll();
    }

    
}
