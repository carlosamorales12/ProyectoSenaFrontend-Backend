package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.models.entity.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {

}
