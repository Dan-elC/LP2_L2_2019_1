package GameSoftDev.src.pucp.gamesoft.dev.model.pject;
import java.util.ArrayList;
public class Project{
	private String name;
	private ArrayList<Phase> phases;
	private ArrayList<Participant> participants;
	private Game game;
	public Project(String name, Game game){
		this.name = name;
		this.game = game;
		phases = new ArrayList<Phase>();
		participants = new ArrayList<Participant>();
	}
	public ArrayList<Phase> getPhases(){
		return phases;
	}
	public ArrayList<Participant> getParticipants(){
		return participants;
	}
	public String getReportParticipants(){
		String cad = name+"\n";
		cad = cad + "Reporte de Participantes"+"\n";
		cad = cad + "------------------------------"+"\n";
		for(Participant p : participants){
			cad = cad + p.getUser().getEmployee().getDNI() + " " + p.getUser().getEmployee().getName() + " " + p.getUser().getEmployee().getLastName() + " - " + p.getUser().getEmployee().getRole().getTitle() + "\n";
		}
		return cad;
	}
}