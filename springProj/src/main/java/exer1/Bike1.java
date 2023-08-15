package exer1;

public class Bike1 implements Bike0{
	String name="MTB";
	Tire tire;
	Handle handle;
	String intf = "";
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	public void setIntf(String intf) {
		this.intf = intf;
	}
	@Override
	public String toString() {
		return name + intf;
	}
	@Override
	public void go() {
		this.intf = "가 산길을 헤쳐간다";
		
	}
	@Override
	public void fix() {
		this.intf = "를 뚝딱뚝딱 고친다";
		
	}
	@Override
	public void fall() {
		this.intf = "가 훼까닥 쓰러져버렸다";
		
	}
}
