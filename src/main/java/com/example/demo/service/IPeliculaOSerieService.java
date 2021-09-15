package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PeliculaOSerieDto;
import com.example.demo.dto.PeliculaOSerieGetDto;
import com.example.demo.model.PeliculaOSerie;

public interface IPeliculaOSerieService {
	
	List<PeliculaOSerie> findAll();
	List<PeliculaOSerieGetDto> getPeliculaOSerieDto();
	
	PeliculaOSerie save(PeliculaOSerieDto peliculaOSerieDto);
	PeliculaOSerie update(Integer id, PeliculaOSerieDto peliculaOSerieDto);
	void delete(Integer id);

}
