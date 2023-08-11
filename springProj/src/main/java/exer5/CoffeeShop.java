package exer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CoffeeShop {
	String name;
	int price;
	@Autowired
	@Qualifier("b2")
	Beans bean;
	@Autowired(required = false)
	@Qualifier("c2")
	Custom cus;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBean(Beans bean) {
		this.bean = bean;
	}
	public void setCus(Custom cus) {
		this.cus = cus;
	}
	
	@Override
	public String toString() {
		return "CoffeeShop [name=" + name + ", price=" + price + ", bean=" + bean + ", cus=" + cus + "]";
	}
}

class Beans{
	String name, nation;

	public void setName(String name) {
		this.name = name;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "Beans [name=" + name + ", nation=" + nation + "]";
	}
	
	
}

class Custom{
	String name, volume;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return "Custom [name=" + name + ", volume=" + volume + "]";
	}
	
}
