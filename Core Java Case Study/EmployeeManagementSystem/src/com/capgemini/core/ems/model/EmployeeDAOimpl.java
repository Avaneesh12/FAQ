package com.capgemini.core.ems.model;

import java.util.List;

import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.util.DBUtil;

public class EmployeeDAOimpl implements EmployeeDAO {

	private List<Employee> employees;//List is declared
	
	private DBUtil dbUtil = new DBUtil();
	
	//to remember previously assigned emp id
	private int employeeId = 1000;
	
	public EmployeeDAOimpl()
	{
		employees = dbUtil.getEmployees();   //List is instantiated by dbUtil
	}
	
	public int generateEmployeeId()
	{
		return ++employeeId;
		
	}
	
	
	@Override
	public int addEmployee(Employee employee) throws EMSException {
			
			//generate emp id
			int empId = generateEmployeeId();
			
		
			//set to emp bean
			employee.setId(empId);
		
			//add to collections
			employees.add(employee);
			
			//return emp id
			return empId;
	}

	@Override
	public Employee getEmployee(int id) throws EMSException {
		
		//get employee by empId
		int index = employees.indexOf(new Employee(id)); //contains() whether the object exist or not. So we will not use this
		//because we want to know where the elements is present
		
		
		//indexOf() will also not work. In EMPLOYEE CLASS we have to add hashCode() and Equals() method, then it will work
		
		
		//If index is unable to find the elements it returns -1
		if(index == -1) //employee not found
			throw new EMSException("Employee with Id : " + id + " does not exist.");
		
		return employees.get(index);
	}

	@Override
	public void updateEmployee(Employee employee) throws EMSException {
		
		int index = employees.indexOf(employee); 
		// remove employee by id and return
		if(index == -1) //employee not found
			throw new EMSException("Employee with Id : " + employee.getId() + " does not exist.");
		
		//employee found : updating details
		
		Employee oldEmployee = employees.get(index);
		
		oldEmployee.setName(employee.getName());
		oldEmployee.setSalary(employee.getSalary());
		oldEmployee.setDepartment(employee.getDepartment());
		oldEmployee.setDateOfBirth(employee.getDateOfBirth());
		oldEmployee.setDateOfJoining(employee.getDateOfJoining());
		
		//updating successful
		
		
		
	}

	@Override
	public Employee removeEmployee(int id) throws EMSException 
	{
		int index = employees.indexOf(new Employee(id)); 
		// remove employee by id and return
		if(index == -1) //employee not found
			throw new EMSException("Employee with Id : " + id + " does not exist.");
		
		
		return employees.remove(index);
		
	}

	@Override
	public List<Employee> getAllEmployees() throws EMSException {
		
		return employees;
	}

}
