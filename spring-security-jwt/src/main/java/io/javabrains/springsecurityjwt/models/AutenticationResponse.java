package io.javabrains.springsecurityjwt.models;

public class AutenticationResponse {

	private final String jwt;

	
	public AutenticationResponse(String jwt) {
		this.jwt = jwt;
	}


	public String getJwt() {
		return jwt;
	}
	
	
}
