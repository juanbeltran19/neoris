package com.oniris.repositorio;

import com.oniris.modelo.Movimientos;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioMovimientos extends JpaRepository<Movimientos, Integer>{

}
