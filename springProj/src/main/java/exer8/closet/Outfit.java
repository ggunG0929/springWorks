package exer8.closet;

public class Outfit {
	String name;
	// 자동연결이 아닌 상황이라 Resource 연결 안함
	Hat hat;
	Clothes c;
	Accessory acc;
	Shoes sh;
	
	// Bean 연결을 위해
	public Outfit(String name, Hat hat, Clothes c, Accessory acc, Shoes sh) {
		super();
		this.name = name;
		this.hat = hat;
		this.c = c;
		this.acc = acc;
		this.sh = sh;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHat(Hat hat) {
		this.hat = hat;
	}
	public void setC(Clothes c) {
		this.c = c;
	}
	public void setAcc(Accessory acc) {
		this.acc = acc;
	}
	public void setSh(Shoes sh) {
		this.sh = sh;
	}
	
	@Override
	public String toString() {
		return name + "에 갑니다.\n" + hat + ", " + c + ", " + sh +". 거기에 "+ acc + "까지 갖추어 집을 나섭니다.";
	}

}