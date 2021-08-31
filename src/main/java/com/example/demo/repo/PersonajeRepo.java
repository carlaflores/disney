package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Personaje;

@Repository
public interface PersonajeRepo extends JpaRepository<Personaje, Integer>{

}
