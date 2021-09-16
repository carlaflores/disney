package com.example.demo.dto;

public class UsuarioDto {
	private String name;
	private String lastName;
	private String mail;
	private String username;
	private String password;
	
	public UsuarioDto() {}
	
	public UsuarioDto(String name, String lastName, String mail, String username, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
