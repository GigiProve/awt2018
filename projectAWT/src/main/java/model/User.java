package model;

import enumeration.Role;

public class User {
	private String username;
	private String password;
	private String mail;
	private Role typeOfUser;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Role getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(Role typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
}
