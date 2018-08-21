package com.capgemini.doctors.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorException;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.IDoctorAppointmentService;

public class DoctorTest {

	public static IDoctorAppointmentService docserv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	docserv=new DoctorAppointmentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testAddDoctorAppointmentDetails() throws DoctorException {
		
		DoctorAppointment docappoint=new DoctorAppointment();
		
		docappoint.setPatientName("Eric");
		docappoint.setPhoneNumber("9814357773");
		docappoint.setEmail("Eric12@gmail.com");
		docappoint.setGender("male");
		docappoint.setAge(67);
		docappoint.setProblemName("Heart");
		
		int id=docserv.addDoctorAppointmentDetails(docappoint);
	
			assertTrue(id>0);
	}

	@Test
	public void testGetDoctorAppointmentDetails() throws DoctorException {
		
DoctorAppointment docappoint=new DoctorAppointment();
		
		docappoint.setPatientName("Eric");
		docappoint.setPhoneNumber("9814357773");
		docappoint.setEmail("Eric12@gmail.com");
		docappoint.setGender("male");
		docappoint.setAge(67);
		docappoint.setProblemName("Heart");
		
		int id1=docserv.addDoctorAppointmentDetails(docappoint);
		DoctorAppointment doc1=docserv.getDoctorAppointmentDetails(id1);
		
		assertNotEquals(null, doc1);
	}

	@Test(expected = DoctorException.class)
	public void testAddDoctorAppointmentDetails1() throws DoctorException {
		
		DoctorAppointment docappoint=new DoctorAppointment();
		
		docappoint.setPatientName("Eric");
		docappoint.setPhoneNumber("9814357773");
		docappoint.setEmail("Eric12@gmail.com");
		docappoint.setGender("ale");
		docappoint.setAge(67);
		docappoint.setProblemName("Heart");
		
		int id=docserv.addDoctorAppointmentDetails(docappoint);
	
			
	}
	
	@Test(expected=DoctorException.class)
	public void testAddDoctorAppointmentDetails2() throws DoctorException {
		
		DoctorAppointment doc=new DoctorAppointment();
		doc.setPhoneNumber(null);
		docserv.addDoctorAppointmentDetails(doc);
			
	}
	
	
}
