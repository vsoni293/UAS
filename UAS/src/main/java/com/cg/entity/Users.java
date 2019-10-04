package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "users_seq", sequenceName = "USER_ID")
public class Users {
	@Id
	@GeneratedValue(generator = "users_seq")
	@Column(name = "user_id")
	private int userid;
	@Column(name = "login_id", length = 5)
	private String loginId;
	@Column(name = "password", length = 10)
	private String password;
	@Column(name = "role", length = 5)
	private String role;
	
	public Users() {
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
