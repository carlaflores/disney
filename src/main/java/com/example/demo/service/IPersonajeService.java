package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PersonajeDto;
import com.example.demo.dto.PersonajeGetDto;
import com.example.demo.model.Personaje;


public interface IPersonajeService {

	List<Personaje> findAll();
	List<PersonajeGetDto> personajeGetDto();

	Personaje save(PersonajeDto personajeDto);
	Personaje update(Integer id, PersonajeDto personajeDto);
	void delete(Integer id);

	

}
