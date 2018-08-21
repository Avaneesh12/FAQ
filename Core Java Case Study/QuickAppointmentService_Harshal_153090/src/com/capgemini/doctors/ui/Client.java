package com.capgemini.doctors.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.DoctorException;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.IDoctorAppointmentService;

public class Client {

	IDoctorAppointmentService doctorservice;
	
	List<String> doclist=new ArrayList<String>(); 

	public Client() {
		
		doctorservice=new DoctorAppointmentService();
	}




	public void doctorsList()
	{
		
		doclist.add("Heart");
		doclist.add("Gynecology");
		doclist.add("Diabetes");
		doclist.add("ENT");
		doclist.add("Bone");
		doclist.add("Dermatology");
	}
	
	
	
	
		public void menu() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("===Quick Appontment Service Application===");
			System.out.println("1) Book Doctor Appointment");
			System.out.println("2) View Doctor Appointment Status");
			System.out.println("3) Exit");
		
			int ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
				DoctorAppointment da=new DoctorAppointment();
				
				System.out.print("Enter Name of The Patient :");
				String pname=sc.next();
				System.out.println();
				System.out.print("Enter the Phone Number    :");
				String pno=sc.next();
				System.out.println();
				System.out.print("Enter Email               :");
				String mail=sc.next();
				System.out.println();
				System.out.print("Enter Age                 :");
				int age=sc.nextInt();
				System.out.println();
				System.out.print("Enter Gender              :");
				String gen=sc.next();
				System.out.println();
				System.out.print("Enter Problem Name        :");
				String probname=sc.next();
				System.out.println();
				
				
				
				if(doclist.contains(probname) && doclist.indexOf(probname)==0)
				{	
					da.setProblemName(probname);
					da.setAppointmentStatus("Approved");
					da.setDoctorName("Dr.Brijesh Kumar");
					da.setAppointmentDate(LocalDate.now());
				}
				
				else if(doclist.contains(probname) && doclist.indexOf(probname)==1)
				{
					da.setProblemName(probname);
					da.setAppointmentStatus("Approved");
					da.setDoctorName("Dr.Sharda Singh");
					da.setAppointmentDate(LocalDate.now());
				}
				
				else if(doclist.contains(probname) && doclist.indexOf(probname)==2)
				{ 
					da.setProblemName(probname);
					da.setAppointmentStatus("Approved");
					da.setDoctorName("Dr.Heena Khan");
					da.setAppointmentDate(LocalDate.now());
				}
				
				else if(doclist.contains(probname) && doclist.indexOf(probname)==3)
				{
					da.setProblemName(probname);
					da.setAppointmentStatus("Approved");
					da.setDoctorName("Dr.Paras mal");
					da.setAppointmentDate(LocalDate.now());
				}
				
				else if(doclist.contains(probname) && doclist.indexOf(probname)==4)
				{
					da.setProblemName(probname);
					da.setAppointmentStatus("Approved");
					da.setDoctorName("Dr.Renuka Kher");
					da.setAppointmentDate(LocalDate.now());
				}
				
				else if(doclist.contains(probname) && doclist.indexOf(probname)==5)
				{
					da.setProblemName(probname);
					da.setAppointmentStatus("Approved");
					da.setDoctorName("Dr.Kanika Kapoor");
					da.setAppointmentDate(LocalDate.now());
				}
				
				da.setPatientName(pname);
				da.setPhoneNumber(pno);
				da.setEmail(mail);
				da.setAge(age);
				da.setGender(gen);
				
				try {
					int id1=doctorservice.addDoctorAppointmentDetails(da);
					System.out.println("Your Doctor Appointment has beeen succesfully registered, your appointment ID is : "+id1);
				
				} 
				
				catch (DoctorException e) {
					
					System.out.println(e.getMessage());
				}
				
				
				break;
				
				case 2:System.out.println("Enter The Appointment ID : ");
						int apid=sc.nextInt();
						
				try {
					
					da=doctorservice.getDoctorAppointmentDetails(apid);
					
					System.out.println("Patient Name       :"+da.getPatientName());
					System.out.println("Appointment Status :"+da.getAppointmentStatus());
					System.out.println("Doctor Name        :"+da.getDoctorName());
				} 
				
				catch (DoctorException e) {
					
					System.out.println(e.getMessage());
				}
					break;
					
				case 3:System.out.println("Thankyou For Using The Application.");
						System.exit(0);
						System.out.println();
				break;
				
				default: System.out.println("Invalid Choice");
						System.out.println();
						break;
			}
		
		}
		
	public static void main(String[] args) {
			
			Client client=new Client();
			
			while(true)
			{
				client.doctorsList();
				client.menu();
			}
			
		}

}
