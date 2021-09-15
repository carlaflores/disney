package com.example.demo.service.impl;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.builder.PeliculaOSerieBuilder;
import com.example.demo.dto.PeliculaOSerieDto;
import com.example.demo.dto.PeliculaOSerieGetDto;
import com.example.demo.model.Genero;
import com.example.demo.model.PeliculaOSerie;
import com.example.demo.model.Personaje;
import com.example.demo.repo.GeneroRepo;
import com.example.demo.repo.PeliculaOSerieRepo;
import com.example.demo.repo.PersonajeRepo;
import com.example.demo.service.IPeliculaOSerieService;

@Service
public class PeliculaOSerieServiceImpl implements IPeliculaOSerieService{
	@Autowired
	private PeliculaOSerieRepo peliculaOSerieRepo;
	
	@Autowired
	private PersonajeRepo personajeRepo;
	
	@Autowired
	private GeneroRepo generoRepo;
	
	@Override
	public List<PeliculaOSerie> findAll(){
		List<PeliculaOSerie> peliculas = peliculaOSerieRepo.findAll();
		return peliculas;
	}
	
	@Override	public List<PeliculaOSerieGetDto> getPeliculaOSerieDto() {
		List<PeliculaOSerie> peliculaOSeries = peliculaOSerieRepo.findAll();
		List<PeliculaOSerieGetDto> peliculaOSeriesGet = new ArrayList<PeliculaOSerieGetDto>(); 
		for (PeliculaOSerie peliculaOSerie : peliculaOSeries) {

			peliculaOSeriesGet.add(new PeliculaOSerieGetDto(peliculaOSerie.getImagen(), peliculaOSerie.getTitulo(), peliculaOSerie.getFechaCreacion().toString()));
		}
		return peliculaOSeriesGet;
	}
	
	@Override
	public PeliculaOSerie save(PeliculaOSerieDto peliculaOSerieDto) {
		PeliculaOSerie peliculaOSerie = new PeliculaOSerieBuilder().withPeliculaOSerieDto(peliculaOSerieDto).build();
		peliculaOSerie = peliculaOSerieRepo.save(peliculaOSerie);
		return peliculaOSerie;
	}
	
	@Override
	public PeliculaOSerie update(Integer id, PeliculaOSerieDto peliculaOSerieDto) {
		PeliculaOSerie peliculaOSerie = peliculaOSerieRepo.findById(id).get();
		
		
		if(peliculaOSerieDto.getGeneroAsoc() != null) {
			Set<Genero> gen = new HashSet<Genero>();
			for (Integer idGenero : peliculaOSerieDto.getGeneroAsoc()) {
				gen.add(generoRepo.findById(idGenero).get());
			}
			peliculaOSerie.setGeneroAsoc(gen);
		}
		
		if(peliculaOSerieDto.getPersonajeAsoc() != null) {
			Set<Personaje> per = new HashSet<Personaje>();
			for(Integer idPersonaje : peliculaOSerieDto.getPersonajeAsoc()) {
				per.add(personajeRepo.findById(idPersonaje).get());
			}
			peliculaOSerie.setPersonajeAsoc(per);
		}
		if(peliculaOSerieDto.getCalificacion() != 0)		
			peliculaOSerie.setCalificacion(peliculaOSerieDto.getCalificacion());
		
		if(peliculaOSerieDto.getImagen() != null)
			peliculaOSerie.setImagen(peliculaOSerieDto.getImagen());
		
		if(peliculaOSerieDto.getTitulo() != null)
			peliculaOSerie.setTitulo(peliculaOSerieDto.getTitulo());
		
		if(peliculaOSerieDto.getFechaCreacion() != null)
			try {
				Date fecha = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(peliculaOSerieDto.getFechaCreacion());
				peliculaOSerie.setFechaCreacion(fecha);
				
			} catch (ParseException e) {
				// la cadena no se puede convertir a fecha
			}
		
		return peliculaOSerieRepo.save(peliculaOSerie);
	}
	
	@Override
	public void delete(Integer id) {
		peliculaOSerieRepo.deleteById(id);
	}

}
