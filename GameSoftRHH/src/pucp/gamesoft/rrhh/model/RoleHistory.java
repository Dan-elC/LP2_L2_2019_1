package pucp.gamesoft.rrhh.model;

import pucp.gamesoft.rrhh.model.Role;
import pucp.gamesoft.rrhh.model.Employee;
import pucp.gamesoft.rrhh.model.Department;

import java.util.Date;
public class RoleHistory{
	private Date startDate;
	private Date endDate;
	private Role role;
	private Employee employee;
	private Department department;
	public RoleHistory(Department department, Employee employee, Date startDate, Date endDate){
		this.department = department;
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}