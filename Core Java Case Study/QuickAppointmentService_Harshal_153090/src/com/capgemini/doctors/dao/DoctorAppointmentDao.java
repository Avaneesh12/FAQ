package com.capgemini.doctors.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorException;

public class DoctorAppointmentDao implements IDoctorAppointmentDao {
	
	
	Map<Integer,DoctorAppointment> doctors=new HashMap<Integer,DoctorAppointment>();
	
	
	public int generateAppId()
	{
		double random=Math.random();
		
		return (int)(random * 10000);
	}

	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws DoctorException {
			
		doctorAppointment.setAppointmentid(generateAppId());
		
		doctors.put(doctorAppointment.getAppointmentid(),doctorAppointment);
		
		return doctorAppointment.getAppointmentid();
	}

	@Override
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId) throws DoctorException {
		
		if(doctors.containsKey(appointmentId))
		{
			return doctors.get(appointmentId);
		}
		
		else {
		throw new DoctorException("Patient with appointment id "+appointmentId+" not found");
		}
	}

}
