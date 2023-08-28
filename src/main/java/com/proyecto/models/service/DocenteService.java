package com.proyecto.models.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.models.entity.Docente;

public interface DocenteService {

	public Optional<Docente>findById(Integer id);
	public List<Docente>findAll();
	public Docente save(Docente d);
	public void deleteById (Integer id);
}
