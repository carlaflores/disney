package com.example.demo.builder;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.dto.GeneroDto;
import com.example.demo.model.Genero;
import com.example.demo.model.PeliculaOSerie;

public class GeneroBuilder {
	
	private String nombre;

	private String imagen;

	Set<PeliculaOSerie> pos = new HashSet<PeliculaOSerie>();
	
	public GeneroBuilder withGeneroDto(GeneroDto generoDto) {
		this.nombre = generoDto.getNombre();
		this.imagen = generoDto.getImagen();
		
		if(generoDto.getPeliculaOSerieAsoc() != null) {
			for (Integer idPeliculaOSerie : generoDto.getPeliculaOSerieAsoc()){
				pos.add(new PeliculaOSerie(idPeliculaOSerie));
			}
		}
		return this;	
	}
	
	public Genero build() {
		return new Genero(this.nombre, this.imagen, this.pos);
	}
	

}
