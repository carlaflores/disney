package com.example.demo.dto;

import java.util.Set;

import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PeliculaOSerieDto {
	
	//private Integer id;

	private String imagen;

	private String titulo;

	private String fechaCreacion;

	private int calificacion;

	@JsonIgnore
	@ManyToMany
	private Set<Integer> personajeAsoc;

	@JsonIgnore
	@ManyToMany
	private Set<Integer> generoAsoc;
	/*
	public Integer getId() {
		return id;
	}*/

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Set<Integer> getPersonajeAsoc() {
		return personajeAsoc;
	}

	public void setPersonajeAsoc(Set<Integer> personajeAsoc) {
		this.personajeAsoc = personajeAsoc;
	}

	public Set<Integer> getGeneroAsoc() {
		return generoAsoc;
	}

	public void setGeneroAsoc(Set<Integer> generoAsoc) {
		this.generoAsoc = generoAsoc;
	}
	
	
}
