package com.example.demo.builder;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.dto.PersonajeDto;
import com.example.demo.model.PeliculaOSerie;
import com.example.demo.model.Personaje;

public class PersonajeBuilder {

	private String imagen;
	
	private String nombre;
	
	private int edad;
	
	private float peso;
	
	private String historia;
	
	Set<PeliculaOSerie> pos = new HashSet<PeliculaOSerie>();
	
	public PersonajeBuilder withPersonajeDto(PersonajeDto personajeDto) {
		this.imagen = personajeDto.getImagen();
		this.nombre = personajeDto.getNombre();
		this.edad = personajeDto.getEdad();
		this.peso = personajeDto.getPeso();
		this.historia = personajeDto.getHistoria();
		if(personajeDto.getPeliculaOSerieAsoc() != null)
			for (Integer idPeliculaOSerie : personajeDto.getPeliculaOSerieAsoc()) {
				pos.add(new PeliculaOSerie(idPeliculaOSerie));
			}
		return this;
	}
	
	public Personaje build() {
		return new Personaje(this.imagen, this.nombre, this.edad, this.peso, this.historia, this.pos);
	}
}
