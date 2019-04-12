package GameSoftDev.src.pucp.gamesoft.dev.model.pject;
import java.util.ArrayList;
public class Task extends WorkUnit{
	private ArrayList<Resource> resources;
	private ArrayList<Product> Products;
	public Task(String name){
		super(name);
		this.resources = new ArrayList<Resource>();
		this.Products = new ArrayList<Product>();
	}
	public ArrayList<Resource> getResources(){
		return resources;
	}
	public ArrayList<Product> getProducts(){
		return Products;
	}
}