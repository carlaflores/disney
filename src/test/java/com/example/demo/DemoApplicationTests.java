package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.service.IUsuarioService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void crearUsuario() {
		usuarioService.save(new UsuarioDto("clara", "flores", "carla_sflores@outlook.com", "carla", "1234"));
	}

}
