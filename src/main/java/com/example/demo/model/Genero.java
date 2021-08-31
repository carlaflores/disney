package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private int id;

@ManyToMany
private Set<PeliculaOSerie> PeliculaOSerieAsoc;

private String nombre;

private String imagen;



public int getId() {
	return id;
}

public void setId(int id) {
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

@Override
public String toString() {
	return "Genero [nombre=" + nombre + ", PeliculaOSerieAsoc=" + PeliculaOSerieAsoc + ", imagen=" + imagen + "]";
}



}
