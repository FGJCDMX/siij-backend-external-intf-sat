package com.org.sat.firmaSAT.models;

import javax.annotation.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="firma")
public class firmaSatModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	
	private String certificado;
	private String claveKey;
	private String password;
	private String valor;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	public void setClaveKey(String claveKey) {
		this.claveKey = claveKey;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}


}
