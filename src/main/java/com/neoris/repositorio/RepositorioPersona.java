package com.neoris.repositorio;

import com.neoris.modelo.Persona;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioPersona extends JpaRepository<Persona, Integer>{

}
