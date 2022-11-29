package com.oniris.modelo;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "movimientos")
public class Movimientos {

	@Id
	@Column(name="idmovimiento")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMovimiento;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="valor")
	private int valor;
	
	@Column(name="saldo")
	private int saldo;
	
	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}	
	
}
