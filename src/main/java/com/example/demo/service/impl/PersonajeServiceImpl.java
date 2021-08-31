package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.PersonajeRepo;
import com.example.demo.service.IPersonajeService;

@Service
public class PersonajeServiceImpl implements IPersonajeService {
	@Autowired
	private PersonajeRepo personajeRepo;
	
}
