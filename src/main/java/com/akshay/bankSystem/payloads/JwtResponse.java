package com.akshay.bankSystem.payloads;

import lombok.Data;

@Data
public class JwtResponse {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
