package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonajeDto;
import com.example.demo.dto.PersonajeGetDto;
import com.example.demo.model.Personaje;
import com.example.demo.service.IPersonajeService;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

	@Autowired
	private IPersonajeService personajeService;
	
	@GetMapping("/")
	public ResponseEntity<?> obtenerPersonajes(){
		
		List<Personaje> personajes = personajeService.findAll();
		
		return new ResponseEntity<>(personajes,HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity<?> obtenerPersonajesDto(){
		
		List<PersonajeGetDto> personajesDto = personajeService.personajeGetDto();
		
		return new ResponseEntity<>(personajesDto,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> crearPersonaje(@RequestBody PersonajeDto personajeDto){
		Personaje personaje = personajeService.save(personajeDto);
		return new ResponseEntity<>(personaje,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarPersonaje(@PathVariable(value = "id") Integer id, @RequestBody PersonajeDto personajeDto){
		return new ResponseEntity<>(personajeService.update(id, personajeDto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarPersonaje(@PathVariable(value = "id") Integer id){
		personajeService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
