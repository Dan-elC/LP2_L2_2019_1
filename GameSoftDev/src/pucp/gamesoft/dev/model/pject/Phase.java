package GameSoftDev.src.pucp.gamesoft.dev.model.pject;
import java.util.ArrayList;
import java.util.Date;
public class Phase{
	private String name;
	private Date estimatedStartDate;
	private ArrayList<Activity> activities;
	public Phase(String name, Date estimatedStartDate){
		this.name = name;
		this.estimatedStartDate = estimatedStartDate;
		activities = new ArrayList<Activity>();
	}
	public ArrayList<Activity> getActivities(){
		return activities;
	}
}