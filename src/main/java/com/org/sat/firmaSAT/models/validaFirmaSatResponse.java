package com.org.sat.firmaSAT.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class validaFirmaSatResponse {
	@JsonProperty("Error")
	private errorModel error;
	@JsonProperty("Data")
	private validaFirmaDataModel data;
	
	public validaFirmaSatResponse() {}
	
	public validaFirmaSatResponse(errorModel error, validaFirmaDataModel data) {
		this.error = error;
		this.data = data;
	}

	public errorModel getError() {
		return error;
	}
	
	public void setError(errorModel error) {
		this.error = error;
	}
	
	public validaFirmaDataModel getData() {
		return data;
	}
	
	public void setData(validaFirmaDataModel data) {
		this.data = data;
	}
}
