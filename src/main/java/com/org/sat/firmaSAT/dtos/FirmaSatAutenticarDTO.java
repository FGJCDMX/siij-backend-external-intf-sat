package com.org.sat.firmaSAT.dtos;

public class firmaSatAutenticarDTO {
	private String Username;
	private String Password;
	
	public firmaSatAutenticarDTO() {}
	
	public firmaSatAutenticarDTO(String username, String password) {
		Username = username;
		Password = password;
	}

	public String getUsername() {
		return Username;
	}
	
	public void setUsername(String username) {
		Username = username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
