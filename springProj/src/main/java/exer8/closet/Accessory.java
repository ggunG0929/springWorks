package exer8.closet;

public class Accessory {
	String name, type="기타";
    
	public Accessory() {
        // 기본 생성자
    }
	public Accessory(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
