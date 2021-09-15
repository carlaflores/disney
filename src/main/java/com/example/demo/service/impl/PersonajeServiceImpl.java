package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.builder.PersonajeBuilder;
import com.example.demo.dto.PersonajeDto;
import com.example.demo.dto.PersonajeGetDto;
import com.example.demo.model.PeliculaOSerie;
import com.example.demo.model.Personaje;
import com.example.demo.repo.PeliculaOSerieRepo;
import com.example.demo.repo.PersonajeRepo;
import com.example.demo.service.IPersonajeService;

@Service
public class PersonajeServiceImpl implements IPersonajeService{
	@Autowired
	private PersonajeRepo personajeRepo;
	
	@Autowired
	private PeliculaOSerieRepo peliculaOSerieRepo;

	@Override
	public List<Personaje> findAll() {
		List<Personaje> personajes = personajeRepo.findAll();
		return personajes;
	}
	
	@Override
	public List<PersonajeGetDto> personajeGetDto() {
		List<Personaje> personajes = personajeRepo.findAll();
		List<PersonajeGetDto> personajesGet = new ArrayList<PersonajeGetDto>(); 
		for (Personaje personaje : personajes) {
			personajesGet.add(new PersonajeGetDto(personaje.getNombre(), personaje.getImagen()));
		}
		return personajesGet;
	}

	@Override
	public Personaje save(PersonajeDto personajeDto) {
		Personaje personaje = new PersonajeBuilder().withPersonajeDto(personajeDto).build();
		personaje = personajeRepo.save(personaje);
		return personaje;
	}
	
	@Override
	public Personaje update(Integer id, PersonajeDto personajeDto) {
		Personaje personaje = personajeRepo.findById(id).get();
		
		
		if(personajeDto.getPeliculaOSerieAsoc() != null) {
			Set<PeliculaOSerie> pos = new HashSet<PeliculaOSerie>();
			for (Integer idPeliculaOSerie : personajeDto.getPeliculaOSerieAsoc()) {
				pos.add(peliculaOSerieRepo.findById(idPeliculaOSerie).get());
			}
			personaje.setPeliculaOSerieAsoc(pos);
		}
			
		if(personajeDto.getNombre() != null)
			personaje.setNombre(personajeDto.getNombre());
		
		if(personajeDto.getImagen() != null)
			personaje.setImagen(personajeDto.getImagen());
		
		if(personajeDto.getHistoria() != null)
			personaje.setHistoria(personajeDto.getHistoria());
		
		if(personajeDto.getPeso() != 0)
			personaje.setPeso(personajeDto.getPeso());
		
		return personajeRepo.save(personaje);
	}
	
	@Override
	public void delete(Integer id) {
		personajeRepo.deleteById(id);
	}
	
}
