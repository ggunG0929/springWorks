package exer7;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

public class CoffeeShop implements Coffee {

	@Override
	public void order() {
		
		
	}


	@Override
	public void make() {

		
	}
	

}

@Component
class Americano{
	@Resource
	Bean bean;
	@Resource
	Water wat;
	int price;
	public Bean getBean() {
		return bean;
	}
	public void setBean(Bean bean) {
		this.bean = bean;
	}
	public Water getWat() {
		return wat;
	}
	public void setWat(Water wat) {
		this.wat = wat;
	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	public void setPrice(Bean bean, Water wat) {
		this.price = bean.price + wat.price;
	}
	@Override
	public String toString() {
		return "Americano [bean=" + bean + ", wat=" + wat + ", price=" + price + "]";
	}
	
}

@Component
class Cafelatte extends Americano{
	Bean bean;
	Water wat;
	Milk milk;
	int price;
	public Bean getBean() {
		return bean;
	}
	public void setBean(Bean bean) {
		this.bean = bean;
	}
	public Water getWat() {
		return wat;
	}
	public void setWat(Water wat) {
		this.wat = wat;
	}
	public Milk getMilk() {
		return milk;
	}
	public void setMilk(Milk milk) {
		this.milk = milk;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPrice(Bean bean, Water wat, Milk milk) {
		price = 0;
		price = bean.price + wat.price + milk.price;
	}
	@Override
	public String toString() {
		return "Cafelatte [bean=" + bean + ", wat=" + wat + ", milk=" + milk + ", price=" + price + "]";
	}
	
	
}

@Component
class Caramelmakiato extends Americano{
	Bean bean;
	Water wat;
	Caramel cara;
	int price;
	public Bean getBean() {
		return bean;
	}
	public void setBean(Bean bean) {
		this.bean = bean;
	}
	public Water getWat() {
		return wat;
	}
	public void setWat(Water wat) {
		this.wat = wat;
	}
	public Caramel getCara() {
		return cara;
	}
	public void setCara(Caramel cara) {
		this.cara = cara;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPrice(Bean bean, Water wat, Caramel cara) {
		price = 0;
		price = bean.price + wat.price + cara.price;
	}
	@Override
	public String toString() {
		return "Caramelmakiato [bean=" + bean + ", wat=" + wat + ", cara=" + cara + ", price=" + price + "]";
	}
	
}
@Component
class Bean{
	String name="콜롬비아원두";
	int price=900;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bean [name=" + name + ", price=" + price + "]";
	}
}
@Component
class Water{
	String name="제주삼다수";
	int price=100;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Water [name=" + name + ", price=" + price + "]";
	}
	
}
@Component
class Milk{
	String name="매일우유";
	int price=500;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Milk [name=" + name + ", price=" + price + "]";
	}
}
@Component
class Caramel{
	String name="카라멜시럽";
	int price=500;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Caramel [name=" + name + ", price=" + price + "]";
	}
}
