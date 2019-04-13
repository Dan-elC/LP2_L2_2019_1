package pucp.gamesoft.dev.model.pject;
import java.util.ArrayList;
import java.util.Date;
public class Activity extends WorkUnit{
	private String description;
	private Date estimatedStartDate;
	private ArrayList<Technique> techniques;
	private ArrayList<Task> tasks;
	public Activity(String name, String description, Date estimatedStartDate){
		super(name);
		this.description = description;
		this.estimatedStartDate = estimatedStartDate;
		techniques = new ArrayList<Technique>();
		tasks = new ArrayList<Task>();
	}
	public ArrayList<Task> getTasks(){
		return tasks;
	}
	public ArrayList<Technique> getTechniques(){
		return techniques;
	}
}