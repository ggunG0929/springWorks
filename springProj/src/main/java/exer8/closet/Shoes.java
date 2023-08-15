package exer8.closet;

public class Shoes {
	String name, type="신발";

    public Shoes() {
        // 기본 생성자
    }
	public Shoes(String name) {
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
		return type+"은 "+name;
	}
}
