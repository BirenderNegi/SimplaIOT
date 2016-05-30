package com.simpla.iot.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login_details", catalog = "simpla_db")
public class LoginDetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int loginDetailId;
	private UserDetails userDetails;
	private String userName;
	private String password;

	public LoginDetails() {
	}

	public LoginDetails(int loginDetailId, String userName, String password) {
		this.loginDetailId = loginDetailId;
		this.userName = userName;
		this.password = password;
	}

	public LoginDetails(UserDetails userDetails, String userName, String password) {
		//this.loginDetailId = loginDetailId;
		this.userDetails = userDetails;
		this.userName = userName;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_detail_id", unique = true, nullable = false)
	public int getLoginDetailId() {
		return this.loginDetailId;
	}

	public void setLoginDetailId(int loginDetailId) {
		this.loginDetailId = loginDetailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Column(name = "user_name", nullable = false, length = 45)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
