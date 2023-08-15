package exer8.closet;

public class Clothes {
	String name, type="옷";
	
    public Clothes() {
        // 기본 생성자
    }
	public Clothes(String name) {
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