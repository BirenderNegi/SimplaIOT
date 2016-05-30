package com.simpla.iot.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.simpla.iot.core.dao.SensorDataDAO;
import com.simpla.iot.core.model.SensorData;

public class SensorDataServiceImpl implements SensorDataService	{

	@Autowired
	private SensorDataDAO sensorDataDAO;
	
	@Override
	public void saveSensorData(SensorData sensorData) {
		// TODO Auto-generated method stub
		if(sensorData.getDateTime()==null || sensorData.getDateTime().equals(" ")){
			sensorData.setDateTime(new Date());
		}
		sensorDataDAO.saveSensorData(sensorData);
	}

}
