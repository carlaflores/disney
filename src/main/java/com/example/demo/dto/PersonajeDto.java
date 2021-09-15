package com.example.demo.dto;

import java.util.Set;

import javax.persistence.ManyToMany;

public class PersonajeDto {

	private String imagen;

	private String nombre;

	private int edad;

	private float peso;

	private String historia;

	@ManyToMany
	private Set<Integer> PeliculaOSerieAsoc;

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Set<Integer> getPeliculaOSerieAsoc() {
		return PeliculaOSerieAsoc;
	}

	public void setPeliculaOSerieAsoc(Set<Integer> peliculaOSerieAsoc) {
		PeliculaOSerieAsoc = peliculaOSerieAsoc;
	}


}
