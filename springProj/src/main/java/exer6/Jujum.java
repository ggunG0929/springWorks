package exer6;

import jakarta.annotation.Resource;

// Alcohol은 Resource(name="ac1")을 통해 고정하고
// Anju는 autowire byname과 constructor를 통해 다르게 
public class Jujum {
	String name;
	Anju anju;
	Alcohol alc;
	int price;
	
	// Constructor
	public Jujum(Anju a2, Alcohol alc) {
		super();
		this.anju = a2;
		this.alc = alc;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAnju(Anju anju) {
		this.anju = anju;
	}
	// byName
	public void setA1(Anju anju) {
		this.anju = anju;
	}
	// 생성자가 쓰일 때는 어노테이션을 위에서 쓰면 안먹힘
	@Resource(name="ac1")
	public void setAlc(Alcohol alc) {
		this.alc = alc;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// postprocessor에서 쓰기 위해 getter
	public String getName() {
		return name;
	}
	public Anju getAnju() {
		return anju;
	}
	public Alcohol getAlc() {
		return alc;
	}
//	public int getPrice() {
//		return price;
//	}
	@Override
	public String toString() {
		return name + "나갑니다! " + anju + "술로는 " + alc + "가 함께합니다. 가격은 " + price + "입니다.";
	}
}

class Anju{
	String menu, side;
	int price;
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
//	public String getSide() {
//		return side;
//	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return menu + "에 서비스는 " + side + "~ ";
	}
}

class Alcohol{
	String name;
	int price;

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name;
	}
}
