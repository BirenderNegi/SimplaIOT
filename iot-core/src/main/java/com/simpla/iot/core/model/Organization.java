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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "organization", catalog = "simpla_db")
public class Organization implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int organizationId;
	private String organizationName;
	private String organizationAddress;
	private Set<UserDetails> userDetails;

	public Organization() {
		userDetails = new HashSet<UserDetails>();
	}

	public Organization(int organizationId, String organizationName, String organizationAddress) {
		this.organizationId = organizationId;
		this.organizationName = organizationName;
		this.organizationAddress = organizationAddress;
	}

	public Organization(String organizationName, String organizationAddress, Set<UserDetails> userDetails) {
		//this.organizationId = organizationId;
		this.organizationName = organizationName;
		this.organizationAddress = organizationAddress;
	/*	this.groupDetailses = groupDetailses;
		this.deviceDetailses = deviceDetailses;*/
		this.userDetails = userDetails;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "organization_id", unique = true, nullable = false)
	public int getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	@Column(name = "organization_name", nullable = false, length = 45)
	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@Column(name = "organization_address", nullable = false, length = 200)
	public String getOrganizationAddress() {
		return this.organizationAddress;
	}

	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
	public Set<GroupDetails> getGroupDetailses() {
		return this.groupDetailses;
	}

	public void setGroupDetailses(Set<GroupDetails> groupDetailses) {
		this.groupDetailses = groupDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
	public Set<DeviceDetails> getDeviceDetailses() {
		return this.deviceDetailses;
	}

	public void setDeviceDetailses(Set<DeviceDetails> deviceDetailses) {
		this.deviceDetailses = deviceDetailses;
	}*/

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade=CascadeType.ALL)
	public Set<UserDetails> getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(Set<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}

}
