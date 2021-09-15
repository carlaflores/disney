package com.example.demo.dto;

import java.util.Set;

import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class GeneroDto {

	private String nombre;

	private String imagen;

	@JsonIgnore
	@ManyToMany
	private Set<Integer> PeliculaOSerieAsoc;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Set<Integer> getPeliculaOSerieAsoc() {
		return PeliculaOSerieAsoc;
	}

	public void setPeliculaOSerieAsoc(Set<Integer> peliculaOSerieAsoc) {
		PeliculaOSerieAsoc = peliculaOSerieAsoc;
	}

}
