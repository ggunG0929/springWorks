package di_p;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Umbrella implements BeanNameAware, InitializingBean, DisposableBean {	// add
	String name, type;
	int price;
	
	public Umbrella() {
		System.out.println("Umbrella 생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Umbrella setName():"+name);
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Umbrella setPrice():"+price);
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Umbrella [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	// implement 걸어주고 add하면 생기는 것들
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName()");
		
	}
	
	

}
