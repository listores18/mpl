package com.sakaiwebservicesoap.modelo;


public class login {
	
	
	
	
	private String id;
	
	
	private String pw;
	
	
	//getters y setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public login(String id, String pw) {
		
		this.id = id;
		this.pw = pw;
	}
	public login() {
		
	}
	

}
