package com.reg.login.app.regloginapplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class UserRegDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition = "Number(10) default '1' ")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;


	
	public UserRegDetails() {
	}

	public UserRegDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	@Autowired
	public String toString() {
		return String.format("UserRegDetails[id=%d,username=%s,password=%s]",id,username,password);
	}
         
}
