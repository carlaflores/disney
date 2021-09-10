package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Personaje;
import com.example.demo.repo.PersonajeRepo;
import com.example.demo.service.IPersonajeService;

@RestController
public class Controller {
	@Autowired
	private PersonajeRepo personajeService;
	
	@GetMapping("/ObtenerPersonajes")
	public List<Personaje> obtenerPersonajes() {
		List<Personaje> personajes = personajeService.findAll();
		return personajes;
	}
	
	@PostMapping("/CrearPersonaje")
	public Personaje crearPersonaje(@RequestBody Personaje personaje) {
		personajeService.save(personaje);
		return personaje;
	}
	
	@GetMapping("/index.html")
	public String paginaInicio() {
		return "index.html";
	
	}
	
}
