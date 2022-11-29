package com.oniris.repositorio;

import com.oniris.modelo.Persona;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioPersona extends JpaRepository<Persona, Integer>{

}
