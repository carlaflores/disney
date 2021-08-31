package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Genero;

@Repository
public interface GeneroRepo extends JpaRepository<Genero, String> {
	@Query
	public Genero findbyId(String nombre);
}
