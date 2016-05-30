package com.simpla.iot.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_device", catalog = "simpla_db")
public class UserDevice implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userDeviceId;
	private UserDetails userDetails;
	private String deviceId;
	private String userDeviceName;

	public UserDevice() {
	}

	public UserDevice(int userDeviceId) {
		this.userDeviceId = userDeviceId;
	}

	public UserDevice(int userDeviceId, UserDetails userDetails, String deviceId, String userDeviceName) {
		this.userDeviceId = userDeviceId;
		this.userDetails = userDetails;
		this.deviceId = deviceId;
		this.userDeviceName = userDeviceName;
	}

	@Id

	@Column(name = "user_device_id", unique = true, nullable = false)
	public int getUserDeviceId() {
		return this.userDeviceId;
	}

	public void setUserDeviceId(int userDeviceId) {
		this.userDeviceId = userDeviceId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Column(name = "device_id", length = 45)
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "user_device_name", length = 45)
	public String getUserDeviceName() {
		return this.userDeviceName;
	}

	public void setUserDeviceName(String userDeviceName) {
		this.userDeviceName = userDeviceName;
	}

}
