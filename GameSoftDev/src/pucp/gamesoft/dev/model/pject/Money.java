package GameSoftDev.src.pucp.gamesoft.dev.model.pject;
public class Money extends Resource{
	private String currency;
	private float quantity;
	public Money(String currency, float quantity){
		this.currency = currency;
		this.quantity = quantity;
	}
}