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

import com.example.demo.dto.PeliculaOSerieDto;
import com.example.demo.dto.PeliculaOSerieGetDto;
import com.example.demo.model.PeliculaOSerie;
import com.example.demo.service.IPeliculaOSerieService;

@RestController
@RequestMapping("/movies")
public class PeliculaOSerieController {
	@Autowired
	private IPeliculaOSerieService peliculaOSerieService;
	
	@GetMapping("/")
	public ResponseEntity<?> obtenerPeliculasOSeries(){
		List<PeliculaOSerie> peliculasOSeries = peliculaOSerieService.findAll();
		return new ResponseEntity<>(peliculasOSeries,HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity<?> obtenerPeliculasOSeriesDto(){
		List<PeliculaOSerieGetDto> peliculasOSeriesDto = peliculaOSerieService.getPeliculaOSerieDto();
		return new ResponseEntity<>(peliculasOSeriesDto,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> crearPeliculaOSerie(@RequestBody PeliculaOSerieDto peliculaOSerieDto){
		PeliculaOSerie peliculaOSerie = peliculaOSerieService.save(peliculaOSerieDto);
		return new ResponseEntity<>(peliculaOSerie,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarPeliculaOSerie(@PathVariable(value = "id") Integer id, @RequestBody PeliculaOSerieDto peliculaOSerieDto){
		return new ResponseEntity<>(peliculaOSerieService.update(id, peliculaOSerieDto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarPeliculaOSerie(@PathVariable(value = "id") Integer id){
		peliculaOSerieService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
