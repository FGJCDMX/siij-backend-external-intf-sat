package com.org.sat.firmaSAT.dtos;

public class firmaSatResponseDTO {
	private int Code;
	private String Message;
	
	public firmaSatResponseDTO() {}
	
	public firmaSatResponseDTO(int code, String message) {
		super();
		Code = code;
		Message = message;
	}

	public int getCode() {
		return Code;
	}
	
	public void setCode(int code) {
		Code = code;
	}
	
	public String getMessage() {
		return Message;
	}
	
	public void setMessage(String message) {
		Message = message;
	}
	
	
}
