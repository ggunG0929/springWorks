package exer7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class CoffeeShop implements Coffee{
    private List<CoffeeOrder> orders = new ArrayList<>();
    
//    @Resource
//    private Americano am;
//    @Resource
//    private Cafelatte cl;
//    @Resource
//    private Caramelmakiato cm;
//
//    @Autowired
//    public CoffeeShop(Americano am, Cafelatte cl, Caramelmakiato cm) {
//        this.am = am;
//        this.cl = cl;
//        this.cm = cm;
//    }


	@Override
    public void order() {
        orders.add(new CoffeeOrder("Americano", 2));
        orders.add(new CoffeeOrder("Cafelatte", 2));
        for (CoffeeOrder order : orders) {
            System.out.println(order.getCoffeeType() + " " + order.getQuantity() + "잔");
        }
        System.out.println("주문 받았습니다.");
//        int sum = 0;
//        int price = 0;
//        for (CoffeeOrder order : orders) {
//	        if("Americano".equals(order.getCoffeeType())) {
//	            price = am.getPrice();
//	            sum += price * order.getQuantity();
//	        } else if("Cafelatte".equals(order.getCoffeeType())) {
//	            price = cl.getPrice();
//	            sum += price * order.getQuantity();
//	        } else if("Caramelmakiato".equals(order.getCoffeeType())) {
//	            price = cm.getPrice();
//	            sum += price * order.getQuantity();
//	        }
//        }
//        System.out.println("총 금액은 " + sum + "입니다.");
    }

    @Override
    public void sell() {
        System.out.println("커피 받아가세요!");
        for (CoffeeOrder order : orders) {
            System.out.println(order.getCoffeeType() + " " + order.getQuantity() + "잔");
        }
    }

    @Override
    public String toString() {
        return "CoffeeShop [orders=" + orders + "]";
    }
}

@Component
class Americano {
	@Resource
	Bean bean;
	@Resource
	Water wat;
	int price;
	
	// configuration을 위해서
	public Americano() {
		super();
	}
	public Americano(Bean bean, Water wat) {
		super();
		this.bean = bean;
		this.wat = wat;
		// bean.price보다 객체지향적인 방식 그리고 bean.price를 쓰면 public이 아니라서 쓸 수 없음
		this.price = bean.getPrice() + wat.getPrice();
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
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	public void setPrice() {
		this.price = bean.price + wat.price;
	}
	
	@Override
	public String toString() {
		return "Americano [bean=" + bean + ", wat=" + wat + ", price=" + price + "]";
	}
}

@Component
class Cafelatte extends Americano{
	@Resource
	Milk milk;
	
	public Cafelatte() {
		super();
	}
	public Cafelatte(Bean bean, Water wat, Milk milk) {
		super(bean, wat);
		this.milk = milk;
		this.price = price + milk.getPrice();
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	@Override
	public String toString() {
		return "Cafelatte [bean=" + bean + ", wat=" + wat + ", milk=" + milk + ", price=" + price + "]";
	}
}

@Component
class Caramelmakiato extends Americano{
	@Resource
	Caramel cara;
	
	public Caramelmakiato() {
		super();
	}
	public Caramelmakiato(Bean bean, Water wat, Caramel cara) {
		super(bean, wat);
		this.cara = cara;
		this.price = price + cara.getPrice();
	}
	
	public void setCara(Caramel cara) {
		this.cara = cara;
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
	
	public Bean() {
		super();
	}
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
@Component
class Water{
	String name="제주삼다수";
	int price=100;
	
	public Water() {
		super();
		// TODO Auto-generated constructor stub
	}
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

@Component
class Milk{
	String name="매일우유";
	int price=500;

	public Milk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Milk(String name, int price) {
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
		return "Milk [name=" + name + ", price=" + price + "]";
	}
}

@Component
class Caramel{
	String name="카라멜시럽";
	int price=500;
	
	public Caramel() {
		super();
	}
	
	public Caramel(String name, int price) {
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
		return "Caramel [name=" + name + ", price=" + price + "]";
	}
}
