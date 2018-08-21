package com.capgemini.doctors.dao;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorException;

public interface IDoctorAppointmentDao {

public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment)throws DoctorException;
	
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId)throws DoctorException;
}
