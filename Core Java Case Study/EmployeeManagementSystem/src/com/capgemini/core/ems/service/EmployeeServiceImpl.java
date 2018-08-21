package com.capgemini.core.ems.service;

import java.util.List;

import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.model.EmployeeDAO;
import com.capgemini.core.ems.model.EmployeeDAOimpl;

public class EmployeeServiceImpl implements EmployeeService {

	//loose coupling
	private EmployeeDAO empDAO;
	
	public EmployeeServiceImpl() 
	{
		//association - (link)
		empDAO = new EmployeeDAOimpl();
	}
	@Override
	public int addEmployee(Employee employee) throws EMSException 
	{
		int empId = 0;
		
		if(true)
			empId = empDAO.addEmployee(employee);
		
		return empId;
	}

	@Override
	public Employee getEmployee(int id) throws EMSException 
	{
		Employee employee = null;
		
		employee = empDAO.getEmployee(id);
		
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) throws EMSException 
	{
		empDAO.updateEmployee(employee);

	}

	@Override
	public Employee removeEmployee(int id) throws EMSException 
	{
		Employee employee = null;
		employee = empDAO.removeEmployee(id);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() throws EMSException 
	{
		List<Employee> employees = null;
		employees = empDAO.getAllEmployees();
		return employees;
	}

	@Override
	public boolean isValid(Employee employee) throws EMSException
	{
		//validation Code
		
		
		
		return true;
	}

}
