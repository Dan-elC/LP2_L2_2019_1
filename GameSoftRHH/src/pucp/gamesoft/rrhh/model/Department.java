package pucp.gamesoft.rrhh.model;

import pucp.gamesoft.rrhh.model.Employee;

import java.util.ArrayList;
public class Department{
	private String name;
	private ArrayList<Employee> employees;
	private Employee manager;
	private ArrayList<Department> departments;
	public Department(String name){
		this.name = name;
		this.departments = new ArrayList<Department>();
		this.employees = new ArrayList<Employee>();
	}
	public void setManager(Employee manager){
		this.manager = manager;
	}
	public ArrayList<Employee> getEmployees(){
		return employees;
	}
}