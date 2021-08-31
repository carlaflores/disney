package com.example.demo.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PeliculaOSerie {
@Id
private int id;

private String imagen;

private String titulo;

private Date fechaCreacion;

private int calificacion;

@ManyToMany
private Set<Personaje> personajeAsoc;

@ManyToMany
private Set<Genero> generoAsoc;

public int getId() {
	return id;
}

public void setId(int id) {
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
