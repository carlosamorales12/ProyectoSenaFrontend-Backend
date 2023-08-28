package com.proyecto.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="docentes")
public class Docente {

	@Id
	@Column (name="codigo")
	private int codigo;
	
	@Column (name="cedula")
	private String cedula;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="apellido")
	private String apellido;
	
	@Column (name="telefono")
	private String telefono;
	
	@Column (name="email")
	private String email;
	
	@Column (name="grado")
	private String grado;
	
	@Column (name="grupo")
	private String grupo;
	
	public Docente(int codigo, String cedula, String nombre, String apellido, String telefono, String email,
			String grado, String grupo) {
		
		this.codigo = codigo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.grado = grado;
		this.grupo = grupo;
	}
	public Docente() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	
	
		
}
