package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;
import com.capgemini.doctors.exception.DoctorException;

public class DoctorAppointmentService implements IDoctorAppointmentService {

	
	IDoctorAppointmentDao doctordao=null;
		
	
	public DoctorAppointmentService() {
		
		doctordao=new DoctorAppointmentDao();
	}

	
	
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws DoctorException {
		
		isvalid1(doctorAppointment);
		isvalid2(doctorAppointment);
		isvalid3(doctorAppointment);
		isvalid4(doctorAppointment);
		isvalid5(doctorAppointment);
		
		return doctordao.addDoctorAppointmentDetails(doctorAppointment);
	}

	@Override
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId) throws DoctorException {
		
		return doctordao.getDoctorAppointmentDetails(appointmentId);
	}

	
	public void isvalid1(DoctorAppointment doctorAppointment)throws DoctorException
	{
		if(doctorAppointment==null)
			throw new DoctorException("Appointment instance cannot be null");
	}
	
	public void isvalid2(DoctorAppointment doctorAppointment)throws DoctorException
	{
		if(doctorAppointment.getAge()<=0)
			throw new DoctorException("Age has to be greter than zero");
	}
	
	public void isvalid3(DoctorAppointment doctorAppointment)throws DoctorException
	{
		int v=0;
				
		if(doctorAppointment.getGender().equalsIgnoreCase("male") || doctorAppointment.getGender().equalsIgnoreCase("female"))
		{
			v=1;
		}
		
		if(v==0)
			throw new DoctorException("Gender is Invalid");
	}
	
	
	public void isvalid4(DoctorAppointment doctorAppointment)throws DoctorException
	{
		if(!(doctorAppointment.getEmail().contains("@")))
		{
			throw new DoctorException("Email is Invalid");
		}
	}
	
	public void isvalid5 (DoctorAppointment doctorAppointment) throws DoctorException
	{
		int v=0;
		
		if(String.valueOf(doctorAppointment.getPhoneNumber()).matches("^[7-9]{1}[0-9]{9}$"))
		{
			v=1;
		}
		
		if(v==0)
		{
			throw new DoctorException("Invalid Phone number");
		}
			
			
	}
	
	
}
