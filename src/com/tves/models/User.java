package com.tves.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_user")
public class User {
	@Id
	private String username;
	@Column
	private String password;
	@Column
	private int loginStatus;

	public User() {
		// TODO Auto-generated constructor stub
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

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return username + "-" + password + "-" + loginStatus ;
	}

}