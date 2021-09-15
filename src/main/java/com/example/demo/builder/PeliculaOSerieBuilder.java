package com.example.demo.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.example.demo.dto.PeliculaOSerieDto;
import com.example.demo.model.Genero;
import com.example.demo.model.PeliculaOSerie;
import com.example.demo.model.Personaje;

public class PeliculaOSerieBuilder {
	
	private String imagen;

	private String titulo;

	private Date fechaCreacion;

	private int calificacion;
	
	Set<Personaje> per = new HashSet<Personaje>();
	Set<Genero> gen = new HashSet<Genero>();
	
	public PeliculaOSerieBuilder withPeliculaOSerieDto(PeliculaOSerieDto peliculaOSerieDto) {
		this.imagen = peliculaOSerieDto.getImagen();
		this.titulo = peliculaOSerieDto.getTitulo();
		try {
			this.fechaCreacion = new SimpleDateFormat("dd/MM/yyyy").parse(peliculaOSerieDto.getFechaCreacion());
		} catch (ParseException e) {
			// la cadena no se puede convertir a fecha
		}
		this.calificacion = peliculaOSerieDto.getCalificacion();
		
		
		if(peliculaOSerieDto.getPersonajeAsoc() != null) {
			for(Integer idPersonaje : peliculaOSerieDto.getPersonajeAsoc()) {
				per.add(new Personaje(idPersonaje));
			}
		}
		
		if(peliculaOSerieDto.getGeneroAsoc() != null) {
			for (Integer idGenero : peliculaOSerieDto.getGeneroAsoc()) {
				gen.add(new Genero(idGenero));
			}
		}
		return this;
	}
	
	public PeliculaOSerie build() {
		return new PeliculaOSerie(this.imagen, this.titulo, this.fechaCreacion, this.calificacion, this.per, this.gen);
	}
}
