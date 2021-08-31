package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Genero {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private String nombre;

@ManyToMany
private Set<PeliculaOSerie> PeliculaOSerieAsoc;

private String imagen;

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

@Override
public String toString() {
	return "Genero [nombre=" + nombre + ", PeliculaOSerieAsoc=" + PeliculaOSerieAsoc + ", imagen=" + imagen + "]";
}



}
