package exer1;

public class Bike implements Bike0{
	String name;
	Tire tire;
	Handle handle;
	Basket basket;
	String intf = "";
	
	// set을 넣어주어야 bean 세팅 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public Handle getHandle() {
		return handle;
	}
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	@Override
	public String toString() {
		return name + "(" + tire + ", " + handle + ", " + basket + ")" + intf;
	}
	@Override
	public void go() {
		this.intf = "가 간다";
		
	}
	@Override
	public void fix() {
		this.intf = "를 고친다";
		
	}
	@Override
	public void fall() {
		this.intf = "가 넘어진다";
		
	}
}
