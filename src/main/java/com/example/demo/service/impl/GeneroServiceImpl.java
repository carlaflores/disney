package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Genero;
import com.example.demo.repo.GeneroRepo;
import com.example.demo.service.IGeneroService;

@Service
public class GeneroServiceImpl implements IGeneroService {
	@Autowired
	private GeneroRepo generoRepo;
	//@Override
	//public String get(int id) {
	//	Genero genero = generoRepo.findbyId(id);
	//	return genero.toString();
	//}


}
