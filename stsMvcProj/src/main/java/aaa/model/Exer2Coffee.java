package aaa.model;

import lombok.Data;

@Data
public class Exer2Coffee {
	String name;
	int price;
	
	public Exer2Coffee(String name) {
		super();
		this.name = name;
		if(name.equals("아메리카노")) {			
			this.price = 2200;
		} else if(name.equals("아프리카노")) {
			this.price = 2300;
		} else if(name.equals("아시아노")) {
			this.price = 2500;
		}
	}
}
