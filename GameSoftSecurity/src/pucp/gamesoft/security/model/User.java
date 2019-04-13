package pucp.gamesoft.security.model;

import pucp.gamesoft.rrhh.model.Employee;

public class User{
	private String username;
	private Employee employee;
	public User(Employee employee, String username){
		this.username = username;
		this.employee = employee;
	}
	public Employee getEmployee(){
		return employee;
	}
}