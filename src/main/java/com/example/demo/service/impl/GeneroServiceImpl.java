package com.example.demo.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.builder.GeneroBuilder;
import com.example.demo.dto.GeneroDto;
import com.example.demo.model.Genero;
import com.example.demo.repo.GeneroRepo;
import com.example.demo.repo.PeliculaOSerieRepo;
import com.example.demo.model.PeliculaOSerie;
import com.example.demo.service.IGeneroService;

@Service
public class GeneroServiceImpl implements IGeneroService {
	@Autowired
	private GeneroRepo generoRepo;
	
	@Autowired
	private PeliculaOSerieRepo peliculaOSerieRepo;
	
	@Override
	public List<Genero> findAll() {
		List<Genero> generos = generoRepo.findAll();
		return generos;
	}
	
	@Override
	public Genero save(GeneroDto generoDto) {
		Genero genero = new GeneroBuilder().withGeneroDto(generoDto).build();
		genero = generoRepo.save(genero);
		return genero;
	}
	
	@Override
	public Genero update(Integer id, GeneroDto generoDto) {
		Genero genero = generoRepo.findById(id).get();
		
		if(generoDto.getPeliculaOSerieAsoc() != null) {
			Set<PeliculaOSerie> pos = new HashSet<PeliculaOSerie>();
			for (Integer idPeliculaOSerie : generoDto.getPeliculaOSerieAsoc()) {
				pos.add(peliculaOSerieRepo.findById(idPeliculaOSerie).get());
			}
			genero.setPeliculaOSerieAsoc(pos);
		}
		
		if(generoDto.getImagen() != null) {
			genero.setImagen(generoDto.getImagen());
		}
		if(generoDto.getNombre() != null) {
			genero.setNombre(generoDto.getNombre());
		}
		
		return generoRepo.save(genero);
	}
	
	@Override
	public void delete(Integer id) {
		generoRepo.deleteById(id);
	}


}
