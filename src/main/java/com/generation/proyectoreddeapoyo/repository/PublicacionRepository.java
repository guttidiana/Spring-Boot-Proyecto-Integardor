package com.generation.proyectoreddeapoyo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generation.proyectoreddeapoyo.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{
    


}
