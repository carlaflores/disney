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

import com.example.demo.dto.GeneroDto;
import com.example.demo.model.Genero;
import com.example.demo.service.IGeneroService;

@RestController
@RequestMapping("/genres")
public class GeneroController {
	
	@Autowired
	private IGeneroService generoService;
	
	@GetMapping("/")
	public ResponseEntity<?> obtenerGenero(){
		List<Genero> generos = generoService.findAll();
		return new ResponseEntity<>(generos,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> crearGenero(@RequestBody GeneroDto generoDto){
		Genero genero = generoService.save(generoDto);
		return new ResponseEntity<>(genero,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarGenero(@PathVariable(value = "id") Integer id, @RequestBody GeneroDto generoDto){
		return new ResponseEntity<>(generoService.update(id, generoDto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarGenero(@PathVariable(value = "id") Integer id){
		generoService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


	
}
