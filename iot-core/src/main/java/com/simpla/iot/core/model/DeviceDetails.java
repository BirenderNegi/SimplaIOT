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
@Table(name = "device_details", catalog = "simpla_db")
public class DeviceDetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int deviceId;
	private GroupDetails groupDetails;
	private Organization organization;
	private String deviceName;
	private String gatewayId;
	private String ssid;
	private String networkAddress;
	private Set<SensorData> sensorDatas = new HashSet<SensorData>(0);
	private Set<DevicePinSensorConf> devicePinSensorConfs = new HashSet<DevicePinSensorConf>(0);

	public DeviceDetails() {
	}

	public DeviceDetails(int deviceId) {
		this.deviceId = deviceId;
	}

	public DeviceDetails(int deviceId, GroupDetails groupDetails, Organization organization, String deviceName,
			String gatewayId, String ssid, String networkAddress, Set<SensorData> sensorDatas,
			Set<DevicePinSensorConf> devicePinSensorConfs) {
		this.deviceId = deviceId;
		this.groupDetails = groupDetails;
		this.organization = organization;
		this.deviceName = deviceName;
		this.gatewayId = gatewayId;
		this.ssid = ssid;
		this.networkAddress = networkAddress;
		this.sensorDatas = sensorDatas;
		this.devicePinSensorConfs = devicePinSensorConfs;
	}

	@Id

	@Column(name = "device_id", unique = true, nullable = false)
	public int getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	public GroupDetails getGroupDetails() {
		return this.groupDetails;
	}

	public void setGroupDetails(GroupDetails groupDetails) {
		this.groupDetails = groupDetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id")
	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Column(name = "device_name", length = 45)
	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Column(name = "gateway_id", length = 45)
	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	@Column(name = "ssid", length = 45)
	public String getSsid() {
		return this.ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	@Column(name = "network_address", length = 45)
	public String getNetworkAddress() {
		return this.networkAddress;
	}

	public void setNetworkAddress(String networkAddress) {
		this.networkAddress = networkAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deviceDetails")
	public Set<SensorData> getSensorDatas() {
		return this.sensorDatas;
	}

	public void setSensorDatas(Set<SensorData> sensorDatas) {
		this.sensorDatas = sensorDatas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deviceDetails")
	public Set<DevicePinSensorConf> getDevicePinSensorConfs() {
		return this.devicePinSensorConfs;
	}

	public void setDevicePinSensorConfs(Set<DevicePinSensorConf> devicePinSensorConfs) {
		this.devicePinSensorConfs = devicePinSensorConfs;
	}

}
