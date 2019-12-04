package com.collabera.mongo;

import org.bson.types.ObjectId;

public class Auth {
	
	private ObjectId id;
	private String username;
	private String password;
	
	public Auth() {
		super();
	}
	public Auth(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
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
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Auth [username=" + username + ", password=" + password + "]";
	}
}
