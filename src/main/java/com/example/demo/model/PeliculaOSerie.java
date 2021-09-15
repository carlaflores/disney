package com.example.demo.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pelicula_o_serie")
public class PeliculaOSerie {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private Integer id;

private String imagen;

private String titulo;

private Date fechaCreacion;

private int calificacion;

@JsonIgnore
@ManyToMany
private Set<Personaje> personajeAsoc;

@JsonIgnore
@ManyToMany
private Set<Genero> generoAsoc;

public PeliculaOSerie(String imagen, String titulo, Date fechaCreacion, int calificacion, Set<Personaje> personajeAsoc,
		Set<Genero> generoAsoc) {
	super();
	this.imagen = imagen;
	this.titulo = titulo;
	this.fechaCreacion = fechaCreacion;
	this.calificacion = calificacion;
	this.personajeAsoc = personajeAsoc;
	this.generoAsoc = generoAsoc;
}

public PeliculaOSerie() {
	super();
}

public PeliculaOSerie(Integer id) {
	super();
	this.id = id;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

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

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public int getCalificacion() {
	return calificacion;
}

public void setCalificacion(int calificacion) {
	this.calificacion = calificacion;
}

public Set<Personaje> getPersonajeAsoc() {
	return personajeAsoc;
}

public void setPersonajeAsoc(Set<Personaje> personajeAsoc) {
	this.personajeAsoc = personajeAsoc;
}

public Set<Genero> getGeneroAsoc() {
	return generoAsoc;
}

public void setGeneroAsoc(Set<Genero> generoAsoc) {
	this.generoAsoc = generoAsoc;
}

}
