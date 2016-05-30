package com.simpla.iot.core.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "group_details", catalog = "simpla_db")
public class GroupDetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupId;
	private Organization organization;
	private String groupPostalAddress;
	private String groupName;
	private String groupStreetAddress;
	private Set<DeviceDetails> deviceDetailses = new HashSet<DeviceDetails>(0);

	public GroupDetails() {
	}

	public GroupDetails(int groupId) {
		this.groupId = groupId;
	}

	public GroupDetails(int groupId, Organization organization, String groupPostalAddress, String groupName,
			String groupStreetAddress, Set<DeviceDetails> deviceDetailses) {
		this.groupId = groupId;
		this.organization = organization;
		this.groupPostalAddress = groupPostalAddress;
		this.groupName = groupName;
		this.groupStreetAddress = groupStreetAddress;
		this.deviceDetailses = deviceDetailses;
	}

	@Id

	@Column(name = "group_id", unique = true, nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id")
	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Column(name = "group_postal_address", length = 45)
	public String getGroupPostalAddress() {
		return this.groupPostalAddress;
	}

	public void setGroupPostalAddress(String groupPostalAddress) {
		this.groupPostalAddress = groupPostalAddress;
	}

	@Column(name = "group_name", length = 45)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "group_street_address", length = 200)
	public String getGroupStreetAddress() {
		return this.groupStreetAddress;
	}

	public void setGroupStreetAddress(String groupStreetAddress) {
		this.groupStreetAddress = groupStreetAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupDetails")
	public Set<DeviceDetails> getDeviceDetailses() {
		return this.deviceDetailses;
	}

	public void setDeviceDetailses(Set<DeviceDetails> deviceDetailses) {
		this.deviceDetailses = deviceDetailses;
	}

}
