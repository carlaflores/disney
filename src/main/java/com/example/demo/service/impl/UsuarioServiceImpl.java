package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.builder.UsuarioBuilder;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.model.Usuario;
import com.example.demo.repo.UsuarioRepo;
import com.example.demo.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public Usuario findByUsername(String username) {
		Usuario usuario = usuarioRepo.findByUsername(username);
		return usuario;
	}

	@Override
	public Usuario save(UsuarioDto usuarioDto) {
		Usuario usuario = new UsuarioBuilder().withUsuarioDto(usuarioDto).build();
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		usuario = usuarioRepo.save(usuario);
		return usuario;
	}
}
