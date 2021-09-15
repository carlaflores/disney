package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.GeneroDto;
import com.example.demo.model.Genero;

public interface IGeneroService {

	List<Genero> findAll();
	
	Genero save(GeneroDto generoDto);
	Genero update(Integer id,GeneroDto generoDto);
	void delete(Integer id);
}
