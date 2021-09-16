package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{
	public Usuario findByUsername(String username);

}
