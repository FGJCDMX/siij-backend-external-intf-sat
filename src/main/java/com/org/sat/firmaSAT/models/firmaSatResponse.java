package com.org.sat.firmaSAT.models;

public class firmaSatResponse<T> {
	
	private Object response;

	public firmaSatResponse() { }

	public firmaSatResponse(Object response) {
		this.response = response;
	}
	
	public Object getResponse() {
		return response;
	}
	
	public void setResponse(Object response) {
		this.response = response;
	}
}
