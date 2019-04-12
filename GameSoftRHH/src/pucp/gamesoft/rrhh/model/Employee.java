package GameSoftRHH.src.pucp.gamesoft.rrhh.model;

import GameSoftRHH.src.pucp.gamesoft.rrhh.model.Role;

import java.util.Date;
public class Employee{
	private String name;
	private String lastName;
	private String secondLastName;
	private String DNI;
	private String gender;
	private String email;
	private Date birthday;
	private Date hireDate;
	private double salary;
	private Role role;
	public Employee(String name, String lastName, String secondLastName, String DNI, String gender, String email, Date birthday, Date hireDate, double salary, Role role){
		this.name = name;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.DNI = DNI;
		this.gender = gender;
		this.email = email;
		this.birthday = birthday;
		this.hireDate = hireDate;
		this.salary = salary;
		this.role = role;
	}
	public String getName(){
		return name;
	}
	public String getDNI(){
		return DNI;
	}
	public String getLastName(){
		return lastName;
	}
	public Role getRole(){
		return role;
	}
}