package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/index.html")
	public String paginaInicio() {
		return "index.html";
	
	}
	
}
