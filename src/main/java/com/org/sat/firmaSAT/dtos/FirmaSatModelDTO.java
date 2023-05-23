package com.org.sat.firmaSAT.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class firmaSatModelDTO {
	private String byteKey;
	@JsonProperty("bytecer")
	private String bytecer;
	private String cadena;
	private String password;
	
	public firmaSatModelDTO() {}
	
	public firmaSatModelDTO(String byteKey, String bytecer, String cadena, String password) {
		this.byteKey = byteKey;
		this.bytecer = bytecer;
		this.cadena = cadena;
		this.password = password;
	}

	public String getByteKey() {
		return byteKey;
	}
	
	public void setByte(String key) {
		this.byteKey = key;
	}
	
	public String getByteCer() {
		return bytecer;
	}
	
	public void setByteCer(String certificate) {
		this.bytecer = certificate;
	}
	
	public String getCadena() {
		return cadena;
	}
	
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
