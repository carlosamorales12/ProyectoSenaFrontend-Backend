package com.proyecto.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.models.entity.Docente;
import com.proyecto.repository.DocenteRepository;

@Service
public class DocenteServiceImp implements DocenteService{
	
	@Autowired
	DocenteRepository docenteRopository;

	@Override
	public Optional<Docente> findById(Integer id) {
		// TODO Auto-generated method stub
		return docenteRopository.findById(id);
	}

	@Override
	public List<Docente> findAll() {
		// TODO Auto-generated method stub
		return docenteRopository.findAll();
	}

	@Override
	public Docente save(Docente d) {
		// TODO Auto-generated method stub
		return docenteRopository.save(d);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		docenteRopository.deleteById(id);
	}

}
