package pucp.gamesoft.rrhh.model;
public class Role{
	private String title;
	private float minSalary;
	private float maxSalary;
	public Role(String title, float minSalary, float maxSalary){
		this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	public String getTitle(){
		return title;
	}
}