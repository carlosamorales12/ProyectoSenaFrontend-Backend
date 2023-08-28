package com.proyecto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.models.entity.Docente;
import com.proyecto.models.service.DocenteService;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {

	@Autowired
	DocenteService docenteService;
	
	@GetMapping ("/{id}")
	public Optional<Docente> buscarPorId(@PathVariable Integer id){
		
		return docenteService.findById(id);
	}
	
	@GetMapping ("/listar")
	public List<Docente> listarTodos(){
		
		return docenteService.findAll();
	
	}
	
	@PostMapping
	public Docente guardar (@RequestBody Docente d) {
		
		return docenteService.save(d);
	}
	
	@DeleteMapping ("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		docenteService.deleteById(id);
	}
	
	public Docente actualizar(@RequestBody Docente d, @PathVariable Integer id) {
		
		Docente denBD = docenteService.findById(id).get();
		
		d.setCodigo(d.getCodigo());
		d.setCedula(d.getCedula());
		d.setNombre(d.getNombre());
		d.setApellido(d.getApellido());
		d.setTelefono(d.getTelefono());
		d.setEmail(d.getEmail());
		d.setGrado(d.getGrado());
		d.setGrupo(d.getGrupo());
		
		docenteService.save(denBD);
		
		return d;
	
	}
	
	
		
	
	
	
	}