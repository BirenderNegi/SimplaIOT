package com.simpla.iot.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sensor_data", catalog = "simpla_db")
public class SensorData implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sensorDataId;
	private DeviceDetails deviceDetails;
	private Integer devicePinNumber;
	private Float sensorValue;

	public SensorData() {
	}

	public SensorData(int sensorDataId) {
		this.sensorDataId = sensorDataId;
	}

	public SensorData(int sensorDataId, DeviceDetails deviceDetails, Integer devicePinNumber, Float sensorValue) {
		this.sensorDataId = sensorDataId;
		this.deviceDetails = deviceDetails;
		this.devicePinNumber = devicePinNumber;
		this.sensorValue = sensorValue;
	}

	@Id

	@Column(name = "sensor_data_id", unique = true, nullable = false)
	public int getSensorDataId() {
		return this.sensorDataId;
	}

	public void setSensorDataId(int sensorDataId) {
		this.sensorDataId = sensorDataId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "device_id")
	public DeviceDetails getDeviceDetails() {
		return this.deviceDetails;
	}

	public void setDeviceDetails(DeviceDetails deviceDetails) {
		this.deviceDetails = deviceDetails;
	}

	@Column(name = "device_pin_number")
	public Integer getDevicePinNumber() {
		return this.devicePinNumber;
	}

	public void setDevicePinNumber(Integer devicePinNumber) {
		this.devicePinNumber = devicePinNumber;
	}

	@Column(name = "sensor_value", precision = 12, scale = 0)
	public Float getSensorValue() {
		return this.sensorValue;
	}

	public void setSensorValue(Float sensorValue) {
		this.sensorValue = sensorValue;
	}

}
