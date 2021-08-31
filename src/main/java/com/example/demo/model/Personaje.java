package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Personaje {
@Id	
private int id;

private String imagen;


private String nombre;


private int edad;


private float peso;


private String historia;

@ManyToMany
private Set<PeliculaOSerie> PeliculaOSerieAsoc;

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

}
