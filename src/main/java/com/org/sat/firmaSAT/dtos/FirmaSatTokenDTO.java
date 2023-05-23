package com.org.sat.firmaSAT.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class firmaSatTokenDTO {
	@JsonProperty("Code")
	private int code;
	@JsonProperty("Token")
	private String token;

	public firmaSatTokenDTO() {}
	
	public firmaSatTokenDTO(int code, String token) {
		this.code = code;
		this.token = token;
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
}
