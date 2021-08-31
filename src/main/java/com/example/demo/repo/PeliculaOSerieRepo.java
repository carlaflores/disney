package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PeliculaOSerie;

@Repository
public interface PeliculaOSerieRepo extends JpaRepository<PeliculaOSerie, Integer>{

}
