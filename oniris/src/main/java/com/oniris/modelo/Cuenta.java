package com.oniris.modelo;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")
public class Cuenta {
	
	@Id
	@Column(name="numerocuenta")
	private int numeroCuenta;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="saldoinicial")
	private int saldoinicial;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="nombrecliente")
	private String nombrecliente;
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldoinicial() {
		return saldoinicial;
	}

	public void setSaldoinicial(int saldoinicial) {
		this.saldoinicial = saldoinicial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}	
}
