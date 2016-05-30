package com.simpla.iot.core.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sensor_data_type", catalog = "simpla_db")
public class SensorDataType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sensorTypeId;
	private String sensorTypeDesc;
	private String type;
	private Set<DevicePinSensorConf> devicePinSensorConfs = new HashSet<DevicePinSensorConf>(0);

	public SensorDataType() {
	}

	public SensorDataType(int sensorTypeId) {
		this.sensorTypeId = sensorTypeId;
	}

	public SensorDataType(int sensorTypeId, String sensorTypeDesc, String type,
			Set<DevicePinSensorConf> devicePinSensorConfs) {
		this.sensorTypeId = sensorTypeId;
		this.sensorTypeDesc = sensorTypeDesc;
		this.type = type;
		this.devicePinSensorConfs = devicePinSensorConfs;
	}

	@Id

	@Column(name = "sensor_type_id", unique = true, nullable = false)
	public int getSensorTypeId() {
		return this.sensorTypeId;
	}

	public void setSensorTypeId(int sensorTypeId) {
		this.sensorTypeId = sensorTypeId;
	}

	@Column(name = "sensor_type_desc", length = 45)
	public String getSensorTypeDesc() {
		return this.sensorTypeDesc;
	}

	public void setSensorTypeDesc(String sensorTypeDesc) {
		this.sensorTypeDesc = sensorTypeDesc;
	}

	@Column(name = "type", length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sensorDataType")
	public Set<DevicePinSensorConf> getDevicePinSensorConfs() {
		return this.devicePinSensorConfs;
	}

	public void setDevicePinSensorConfs(Set<DevicePinSensorConf> devicePinSensorConfs) {
		this.devicePinSensorConfs = devicePinSensorConfs;
	}

}
