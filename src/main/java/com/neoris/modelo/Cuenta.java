package com.neoris.modelo;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Cuenta {

	@Id
	@Column(name="numerocuenta")
	private int numeroCuenta;
	
	@Column(name="tipocuenta")
	private String tipoCuenta;
	
	@Column(name="saldoinicial")
	private int saldoInicial;
	
	@Column(name="estado")
	private boolean estado;
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public int getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}	
}
