package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.PeliculaOSerieRepo;
import com.example.demo.service.IPeliculaOSerieService;

@Service
public class PeliculaOSerieServiceImpl implements IPeliculaOSerieService{
	@Autowired
	private PeliculaOSerieRepo peliculaOSerieRepo;

}
