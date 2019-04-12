package GameSoftApp.src.pucp.gamesoft;
import java.text.SimpleDateFormat;
public class Program{
	public static void main(String[] args) throws Exception{
		SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
		Region regLATAM = new Region("Latinoamerica");
		Country cPeru = new Country("Peru",regLATAM);
		Location loc001 = new Location("Av. Universitaria 1801 - San Miguel","Lima 32","Lima","Lima",cPeru);
		Brand brand1 = new Brand("EA Sports",loc001);
		Studio studioSM = new Studio("Santa Monica Studio");
		brand1.getStudios().add(studioSM);
		Department dp1 = new Department("RR.HH.");
		Department dp2 = new Department("Desarrollo");
		Role role1 = new Role("Gerente",10000.00f,20000.00f);
		Role role2 = new Role("Consultor de reclutamiento",3000.00f,3900.00f);
		Role role3 = new Role("Jefe de Proyecto",8000.00f,12000.00f);
		Role role4 = new Role("Programador",1500.00f,3000.00f);
		Role role5 = new Role("Designer",3000.00f,4000.00f);
		Role role6 = new Role("Tester",6000.00f,8000.00f);
		Employee emp1 = new Employee("Cesar","Quispe","Orellana","11090021","M","cquispe@easports.com.pe", formatDate.parse("01-03-1975"), formatDate.parse("01-03-2019"), 15000.00, role1);
		Employee emp2 = new Employee("Maria","Aguilera","Flores","12980976","F","maguilera@easports.com.pe", formatDate.parse("09-12-1988"), formatDate.parse("15-03-2019"), 3500.00, role2);
		Employee emp3 = new Employee("Mayra","Coronado","Oblitas","38230002","F","mcoronado@easports.com.pe", formatDate.parse("19-08-1990"), formatDate.parse("01-03-2019"), 11000.00, role1);
		Employee emp4 = new Employee("Juan","Perez","Mendoza","17902872","M","jperez@easports.com.pe", formatDate.parse("10-06-1983"), formatDate.parse("05-03-2019"), 1600.00, role4);
		Employee emp5 = new Employee("Adriana","Zapata","Espinoza","28760091","F","azapata@easports.com.pe", formatDate.parse("17-10-1986"), formatDate.parse("05-03-2019"), 3300.00, role5);
		Employee emp6 = new Employee("Jorge","Arancibia","Vargas","31318772","M","jarancibia@easports.com.pe", formatDate.parse("03-01-1976"), formatDate.parse("05-03-2019"), 7000.00, role6);
		dp1.setManager(emp1);
		dp1.getEmployees().add(emp2);
		dp2.setManager(emp3);
		dp2.getEmployees().add(emp4);
		dp2.getEmployees().add(emp5);
		dp2.getEmployees().add(emp6);
		studioSM.getDepartments().add(dp1);
		studioSM.getDepartments().add(dp2);
		RoleHistory rhDp11 = new RoleHistory(dp1,emp1,formatDate.parse("01-03-2019"),formatDate.parse("01-03-2021"));
		RoleHistory rhDp12 = new RoleHistory(dp1,emp2,formatDate.parse("15-03-2019"),formatDate.parse("15-03-2021"));
		RoleHistory rhDp21 = new RoleHistory(dp2,emp3,formatDate.parse("01-03-2019"),formatDate.parse("01-03-2021"));
		RoleHistory rhDp22 = new RoleHistory(dp2,emp4,formatDate.parse("05-03-2019"),formatDate.parse("05-03-2021"));
		
		User user1 = new User(emp1,"cquispe");
		User user2 = new User(emp2,"maguilera");
		User user3 = new User(emp3,"mcoronado");
		User user4 = new User(emp4,"jperez");
		User user5 = new User(emp5,"azapata");
		User user6 = new User(emp6,"jarancibia");
		
		Participant p1 = new Participant(user3);
		Participant p2 = new Participant(user4);
		Participant p3 = new Participant(user5);
		Participant p4 = new Participant(user6);
		
		Time time1 = new Time("meses",17);
		Money money1 = new Money("soles",25500.00f);
		
		Task task1 = new Task("Narrativa del Videojuego");
		task1.getResources().add(p1);
		task1.getResources().add(p2);
		task1.getResources().add(time1);
		task1.getResources().add(money1);
		Product prod1 = new Product("Game Design");
		task1.getProducts().add(prod1);
		
		Technique tech1 = new Technique("Brainstorming");
		
		Activity act1 = new Activity("Diseño del Videojuego","El proposito de esta actividad es obtener el GameDesign",formatDate.parse("20-04-2021"));
		act1.getTechniques().add(tech1);
		
		Phase ph1 = new Phase("Concepcion",formatDate.parse("20-04-2021"));
		ph1.getActivities().add(act1);
		
		Genre genre1 = new Genre("Arcade");
		Platform platform1 = new Platform("Computadora");
		ContentClassificationSystem ccs1 = new ContentClassificationSystem("PEGI 16");
		GameMode gm1 = new GameMode("Creativo");
		
		Game game1 = new Game("Mario Bros", genre1, platform1, gm1, ccs1);
		
		Project proj1 = new Project("Proyecto Mario Bros - Mundo Creativo",game1);
		proj1.getPhases().add(ph1);
		proj1.getParticipants().add(p1);
		proj1.getParticipants().add(p2);
		proj1.getParticipants().add(p3);
		proj1.getParticipants().add(p4);
		
		String reporte = proj1.getReportParticipants();
		System.out.println(reporte);
	}
}