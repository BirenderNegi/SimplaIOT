package com.simpla.iot.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "device_pin_sensor_conf", catalog = "simpla_db")
public class DevicePinSensorConf implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int devicePinSensorId;
	private SensorDataType sensorDataType;
	private DeviceDetails deviceDetails;
	private int devicePin;

	public DevicePinSensorConf() {
	}

	public DevicePinSensorConf(int devicePinSensorId, int devicePin) {
		this.devicePinSensorId = devicePinSensorId;
		this.devicePin = devicePin;
	}

	public DevicePinSensorConf(int devicePinSensorId, SensorDataType sensorDataType, DeviceDetails deviceDetails,
			int devicePin) {
		this.devicePinSensorId = devicePinSensorId;
		this.sensorDataType = sensorDataType;
		this.deviceDetails = deviceDetails;
		this.devicePin = devicePin;
	}

	@Id

	@Column(name = "device_pin_sensor_id", unique = true, nullable = false)
	public int getDevicePinSensorId() {
		return this.devicePinSensorId;
	}

	public void setDevicePinSensorId(int devicePinSensorId) {
		this.devicePinSensorId = devicePinSensorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sensor_id")
	public SensorDataType getSensorDataType() {
		return this.sensorDataType;
	}

	public void setSensorDataType(SensorDataType sensorDataType) {
		this.sensorDataType = sensorDataType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "device_id")
	public DeviceDetails getDeviceDetails() {
		return this.deviceDetails;
	}

	public void setDeviceDetails(DeviceDetails deviceDetails) {
		this.deviceDetails = deviceDetails;
	}

	@Column(name = "device_pin", nullable = false)
	public int getDevicePin() {
		return this.devicePin;
	}

	public void setDevicePin(int devicePin) {
		this.devicePin = devicePin;
	}

}
