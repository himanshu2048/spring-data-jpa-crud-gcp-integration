package com.wangs.request;

public class UserRequest {
	
	
	private String name;

	private String role;


	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRequest(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
