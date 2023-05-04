package com.org.sat.firmaSAT.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class validaFirmaDataModel {
	@JsonProperty("sello")
	private String sello;
	@JsonProperty("fechaFirma")
	private String fecharFirma;
	@JsonProperty("folioCOnsulta")
	private String folioConsulta;
	@JsonProperty("nombreCompleto")
	private String nombreCompleto;
	
	public validaFirmaDataModel() {}
	
	public validaFirmaDataModel(String sello, String fecharFirma, String folioConsulta, String nombreCompleto) {
		this.sello = sello;
		this.fecharFirma = fecharFirma;
		this.folioConsulta = folioConsulta;
		this.nombreCompleto = nombreCompleto;
	}

	public String getSello() {
		return sello;
	}
	
	public void setSello(String sello) {
		this.sello = sello;
	}
	
	public String getFecharFirma() {
		return fecharFirma;
	}
	
	public void setFecharFirma(String fecharFirma) {
		this.fecharFirma = fecharFirma;
	}
	
	public String getFolioConsulta() {
		return folioConsulta;
	}
	
	public void setFolioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
}
