package com.simpla.iot.core.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_details", catalog = "simpla_db")
public class UserDetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private Role role;
	private Organization organization;
	private String firstName;
	private String lastName;
	private String emailAddress;
	/*private Set<UserDevice> userDevices;
	private Set<UserAccess> userAccesses;*/
	private Set<LoginDetails> loginDetails;

	public UserDetails() {
		 /*userDevices = new HashSet<UserDevice>(0);
		 userAccesses = new HashSet<UserAccess>(0);*/
		 loginDetails = new HashSet<LoginDetails>(0);
	}

	public UserDetails(int userId) {
		this.userId = userId;
	}

	public UserDetails(Role role, Organization organization, String firstName, String lastName,
			String emailAddress)/*Set<UserDevice> userDevices, Set<UserAccess> userAccesses,
			Set<LoginDetails> loginDetailses)*/ {
		this.role = role;
		this.organization = organization;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
/*		this.userDevices = userDevices;
		this.userAccesses = userAccesses;
		this.loginDetails = loginDetailses;*/
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id")
	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Column(name = "first_name", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email_address", length = 45)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetails")
	public Set<UserDevice> getUserDevices() {
		return this.userDevices;
	}

	public void setUserDevices(Set<UserDevice> userDevices) {
		this.userDevices = userDevices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetails")
	public Set<UserAccess> getUserAccesses() {
		return this.userAccesses;
	}

	public void setUserAccesses(Set<UserAccess> userAccesses) {
		this.userAccesses = userAccesses;
	}*/

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetails", cascade=CascadeType.ALL)
	public Set<LoginDetails> getLoginDetails() {
		return this.loginDetails;
	}

	public void setLoginDetails(Set<LoginDetails> loginDetails) {
		this.loginDetails = loginDetails;
	}

}
