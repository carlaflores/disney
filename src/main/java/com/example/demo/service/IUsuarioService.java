package com.example.demo.service;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.model.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario save(UsuarioDto usuarioDto);
}
