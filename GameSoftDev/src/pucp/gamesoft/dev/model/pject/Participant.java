package GameSoftDev.src.pucp.gamesoft.dev.model.pject;
public class Participant extends Resource implements Reportable{
	private User user;
	public Participant(User user){
		this.user = user;
	}
	public String getInfo(){
		return "";
	}
	public String getDetails(){
		return "";
	}
	public User getUser(){
		return user;
	}
}