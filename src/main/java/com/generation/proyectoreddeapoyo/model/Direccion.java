package com.generation.proyectoreddeapoyo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "direccion")
public class Direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "calle")
    @Size(min = 0, message = "Ingrese su direccion")
    private String calle;

    @Column(name = "numDireccion")
    private Integer numDireccion;

    @Column(name = "casaDpto")
    @Size(min = 4, message = "Indique si es casa o departamento")
    private String casaDpto;

    @Column(name = "region")
    @Size(min = 4, message = "Indique la región")
    private String region;

    @Column(name = "comuna")
    @Size(min = 5, message = "Ingrese la comuna")
    private String comuna;


}
