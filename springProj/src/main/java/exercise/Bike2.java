package exercise;

public class Bike2 implements Bike0{
	String name = "포카리자전거";
	Tire tire;
	Handle handle;
	Basket basket;
	String intf = "";

	@Override
	public String toString() {
		return name + intf;
	}
	@Override
	public void go() {
		this.intf = "가 상큼하게 지나간다";
		toString();
		
	}
	@Override
	public void fix() {
		this.intf = "를 조심스레 고친다";
		toString();
		
	}
	@Override
	public void fall() {
		this.intf = "가 사뿐하게 넘어진다";
		toString();
	}
	
}