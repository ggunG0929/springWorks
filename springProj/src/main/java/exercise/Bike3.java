package exercise;

public class Bike3 implements Bike0{
	String name = "세발자전거";
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
		this.intf = "가 동네를 헤집는다";
		toString();
		
	}
	@Override
	public void fix() {
		this.intf = "를 열심히 고쳐본다";
		toString();
		
	}
	@Override
	public void fall() {
		this.intf = "가 우당탕탕 넘어진다";
		toString();
	}
	
}