package exer6;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.Resource;

//// Alcohol은 resource(name="ac1")"을 통해 고정하고 - 어떤 어노테이션이 우선인지 알 수 없어 오류생김
// Alcohol은 autowire-qualifier="ac1"을 통해 고정하고
// Anju는 autowire-byname과 constructor를 통해 다르게 
public class Jujum {
	String name;
//	@Autowired
//	@Qualifier("a1")
	Anju anju;
//	@Resource(name="ac1")
	Alcohol alc;
	int price;
	
	// Constructor
	// resource를 사용하면 어떤 어노테이션이 우선인지 알 수 없어 오류생김
	// 'exer6.Alcohol' available: expected single matching bean but found 2: ac1,ac2
//	public Jujum(Anju a2, Alcohol alc) {
	// Autowire Qualifier
	@Autowired
	public Jujum(Anju a2, @Qualifier("ac1")Alcohol alc) {
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

	public void setAlc(Alcohol alc) {
		this.alc = alc;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// post processor에서 쓰기 위해 getter
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
		DecimalFormat df = new DecimalFormat("###,###");
		return name + " 나갑니다! " + anju + "술로는 " + alc + "가 딱이죠? 가격은 " + df.format(price) + "원 입니다.";
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
		return menu + "에 세트서비스로 " + side + "까지~ ";
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
