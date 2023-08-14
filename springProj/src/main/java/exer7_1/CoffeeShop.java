package exer7_1;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Configuration
public class CoffeeShop {
	
	Bean bean1() {
		return new Bean("아라비카원두", 800);
	}
	
	Americano am1() {
		return new Americano();
	}
	
	Americano am2(Bean bean2) {
		Americano am = new Americano();
		am.setWat("백산수", 200);
		am.setBean(bean2);
		return am;
	}
	
	// Bean bean, Water wat, Milk milk, int price
//	Cafelatte cl1() {
//		return new Cafelatte("bean1", "백산수", "매일우유", 1500);
//	}
	
	
}

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
	public void setWat(String string, int i) {
		// TODO Auto-generated method stub
		
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
	@Resource
	public void setPrice(Bean bean, Water wat) {
		this.price = bean.price + wat.price;
	}
	@Override
	public String toString() {
		setPrice(bean, wat);
		return "Americano [bean=" + bean + ", wat=" + wat + ", price=" + price + "]";
	}
	
}

@Component
class Cafelatte{
	@Resource
	Bean bean;
	@Resource
	Water wat;
	@Resource
	Milk milk;
	int price;
	
	public Cafelatte(Bean bean, Water wat, Milk milk, int price) {
		super();
		this.bean = bean;
		this.wat = wat;
		this.milk = milk;
		this.price = price;
	}
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


class Caramelmakiato{
	@Resource
	Bean bean;
	@Resource
	Water wat;
	@Resource
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

class Bean{
	String name="콜롬비아원두";
	int price=900;
	public Bean(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
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

class Water{
	String name="제주삼다수";
	int price=100;
	
	public Water(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
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

class Caramel{
	String name="카라멜시럽";
	int price=300;
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
