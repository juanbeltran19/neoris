package com.oniris.repositorio;

import com.oniris.modelo.Cuenta;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioCuenta extends JpaRepository<Cuenta, Integer>{

}
