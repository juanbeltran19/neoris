package com.neoris.repositorio;

import com.neoris.modelo.Cuenta;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositorioCuenta extends JpaRepository<Cuenta, Integer>{

}
