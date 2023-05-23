package com.org.sat.firmaSAT.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class errorModel {
	@JsonProperty("Code")
	private int code;
	@JsonProperty("Message")
	private String message;
	
	public errorModel() {}
	
	public errorModel(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
