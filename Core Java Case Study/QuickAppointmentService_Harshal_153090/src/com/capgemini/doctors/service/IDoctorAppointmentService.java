package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorException;

public interface IDoctorAppointmentService {

	
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment)throws DoctorException;
	
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId)throws DoctorException;
	
}
