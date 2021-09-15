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
@Table(name = "personaje")
public class Personaje {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

private String imagen;

private String nombre;

private int edad;

private float peso;

private String historia;

@JsonIgnore
@ManyToMany
private Set<PeliculaOSerie> PeliculaOSerieAsoc;


public Personaje(String imagen, String nombre, int edad, float peso, String historia,
		Set<PeliculaOSerie> peliculaOSerieAsoc) {
	super();
	this.imagen = imagen;
	this.nombre = nombre;
	this.edad = edad;
	this.peso = peso;
	this.historia = historia;
	PeliculaOSerieAsoc = peliculaOSerieAsoc;
}

public Personaje() {
	super();
}

public Personaje(Integer id) {
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

public Set<PeliculaOSerie> getPeliculaOSerieAsoc() {
	return PeliculaOSerieAsoc;
}

public void setPeliculaOSerieAsoc(Set<PeliculaOSerie> peliculaOSerieAsoc) {
	PeliculaOSerieAsoc = peliculaOSerieAsoc;
}

}
