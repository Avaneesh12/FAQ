package com.capgemini.core.ems.util;

import java.util.*;

import com.capgemini.core.ems.beans.Employee;

public class DBUtil 
{
	private List<Employee> employees = new ArrayList<Employee>();
	{
		employees.add(new Employee(210, "John", 25000, "IT", null, null));
		
	}
	public List<Employee> getEmployees()
	{
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
