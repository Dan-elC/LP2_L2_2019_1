package pucp.gamesoft.dev.model.pject;
public class Time extends Resource implements Consumable{
	private String measureUnit;
	private float quantity;
	public Time(String measureUnit, float quantity){
		this.measureUnit = measureUnit;
		this.quantity = quantity;
	}
	public void reduce(float quantity){
		this.quantity -= quantity;
	}
}