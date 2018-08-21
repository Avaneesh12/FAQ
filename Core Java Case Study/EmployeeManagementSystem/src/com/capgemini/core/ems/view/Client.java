package com.capgemini.core.ems.view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;
import java.util.List;
import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.model.EmployeeDAO;
import com.capgemini.core.ems.model.EmployeeDAOimpl;
import com.capgemini.core.ems.service.EmployeeService;
import com.capgemini.core.ems.service.EmployeeServiceImpl;


public class Client
{
	private EmployeeService employeeService;
	
	public Client()
	{
		employeeService = new EmployeeServiceImpl();
	}
		
	public void menu()
	{
		System.out.println("(1) Add Employees Information");
		System.out.println("(2) Get employees Information");
		System.out.println("(3) Update employees Information");
		System.out.println("(4) Remove employees Information");
		System.out.println("(5) View All employees Information");
		System.out.println("(0) Exit Application");
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please select a choice : ");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1:
			Employee employee = new Employee();
			
			System.out.println("(1) Enter Employee Name");
			
			String name = console.next();
			System.out.println("(1) Enter Employee Salary : ");
			double Salary = console.nextDouble();
			
			System.out.println("(1) Enter Employee Department : ");
			String department = console.next();
			
			System.out.println("(1) Enter Employee Date of Birth : (dd-MM-yyyy) ");
			String dateOfBirth = console.next();
			
			System.out.println("(1) Enter Employee Date of Joining : (dd-MM-yyyy) ");
			String dateOfJoining = console.next();
		
			employee.setName(name);
			employee.setSalary(Salary);
			employee.setDepartment(department);
			employee.setDateOfBirth(convertToDate(dateOfBirth));
			employee.setDateOfJoining(convertToDate(dateOfJoining));
			
			try
			{
				
				int empId = employeeService.addEmployee(employee);
				
				System.out.println("Employee added successfully. Employee ID: " + empId);
			}
			catch(EMSException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
			
			
		case 2: 
			System.out.println("Enter Employee ID to view details : ");
			int empId = console.nextInt();
			try
			{
				
			
				employee = employeeService.getEmployee(empId);
				
				System.out.println("ID : " + employee.getId());
				System.out.println("Name : " + employee.getName());
				System.out.println("Salary : " + employee.getSalary());
				System.out.println("Department : " + employee.getDepartment());
				System.out.println("Date of Birth : " + employee.getDateOfBirth());
				System.out.println("Date of Joining : " + employee.getDateOfJoining());
				
			}
			catch(EMSException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
			
			
		case 3:
			//get employee details if exist
			System.out.println("Enter Employee ID to update details : ");
			empId = console.nextInt();
			try
			{
				employee = employeeService.getEmployee(empId);
				
				//updating name
				System.out.println("Employee name : "+ employee.getName());
				System.out.println("Do you want to update the name? (yes/no)");
				String reply = console.next();
				
				if(reply.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter new Name : ");
					employee.setName(console.next());
				}
				
				//updating salary
				System.out.println("Employee salary : "+ employee.getSalary());
				System.out.println("Do you want to update the salary? (yes/no)");
				reply = console.next();
				
				if(reply.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter new salary : ");
					employee.setSalary(console.nextDouble());
				}
				
				//updating department
				System.out.println("Employee department : "+ employee.getDepartment());
				System.out.println("Do you want to update the department? (yes/no)");
				reply = console.next();
				
				if(reply.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter new department : ");
					employee.setDepartment(console.next());
				}
				
				//updating DOB
				System.out.println("Employee DOB: "+ employee.getDateOfBirth());
				System.out.println("Do you want to update the DOB? (yes/no)");
				reply = console.next();
				
				if(reply.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter new DOB: ");
					employee.setDateOfBirth(convertToDate(console.next()));
				}
				
				//updating DOJ
				System.out.println("Employee DOJ: "+ employee.getDateOfJoining());
				System.out.println("Do you want to update the DOJ? (yes/no)");
				reply = console.next();
				
				if(reply.equalsIgnoreCase("yes"))
				{
					System.out.println("Enter new Name : ");
					employee.setDateOfJoining(convertToDate(console.next()));
				}
				
				
				employeeService.updateEmployee(employee);
				
				System.out.println("Employee details updates successfully...........");
			}
			catch(EMSException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
			
			
		case 4: 
			System.out.println("Enter Employee ID to remove details : ");
			empId = console.nextInt();
			try
			{
				
			
				employee = employeeService.removeEmployee(empId);
				System.out.println("Employee with below details removed.");
				System.out.println("ID : " + employee.getId());
				System.out.println("Name : " + employee.getName());
				System.out.println("Salary : " + employee.getSalary());
				System.out.println("Department : " + employee.getDepartment());
				System.out.println("Date of Birth : " + employee.getDateOfBirth());
				System.out.println("Date of Joining : " + employee.getDateOfJoining());
			}
			catch(EMSException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
			
			
		case 5:
			try
			{
				List<Employee> employees = employeeService.getAllEmployees();

				Iterator<Employee> it = employees.iterator();
				
				System.out.println("ID \t Name \t Salary \t Department \t DOB \t DOJ");
				while(it.hasNext())
				{
					Employee emp = it.next();
					System.out.println(	emp.getId() 					+         		"\t"  +
										emp.getName() 					+        		"\t"  +
										emp.getSalary() 				+              	 "\t"  +
										emp.getDepartment() 			+        	    "\t"  +
										emp.getDateOfBirth()		 	+ 				"\t" +
										emp.getDateOfJoining());
										
				}
			}
			catch(EMSException e)
			{
				e.printStackTrace();
			}
			break;
			
			
		case 0: 
			System.out.println("You can Leave now");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Option");
			break;
		}
	}
			
	public Date convertToDate (String dateInString)
	{
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate localdate = LocalDate.parse(dateInString, formatter);
		
		java.util.Date date = java.sql.Date.valueOf(localdate);
		return date;
	}
	
	public static void main(String[] args) 
	{
		
		Client client = new Client();
		
		//make sure application runs forever unless you close it
		while(true)
			client.menu();
	}
		
}

	