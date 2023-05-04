package com.org.sat.firmaSAT.models;

public class firmaSatRequest<T> {

	protected T data;
	
	public firmaSatRequest() { }

	public firmaSatRequest(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
