package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "genero")
public class Genero {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private Integer id;

private String nombre;

private String imagen;

@JsonIgnore
@ManyToMany
private Set<PeliculaOSerie> PeliculaOSerieAsoc;

public Genero(String nombre, String imagen, Set<PeliculaOSerie> peliculaOSerieAsoc) {
	super();
	this.nombre = nombre;
	this.imagen = imagen;
	PeliculaOSerieAsoc = peliculaOSerieAsoc;
}


public Genero() {
	super();
}


public Genero(Integer id) {
	super();
	this.id = id;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

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

public Set<PeliculaOSerie> getPeliculaOSerieAsoc() {
	return PeliculaOSerieAsoc;
}

public void setPeliculaOSerieAsoc(Set<PeliculaOSerie> peliculaOSerieAsoc) {
	PeliculaOSerieAsoc = peliculaOSerieAsoc;
}

}
