package com.neoris.repositorio;

import com.neoris.modelo.Movimientos;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioMovimientos extends JpaRepository<Movimientos, Integer>{

}
