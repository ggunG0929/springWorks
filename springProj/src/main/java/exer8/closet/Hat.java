package exer8.closet;

public class Hat {
	String name, type="모자";
	
    public Hat() {
        // 기본 생성자
    }
	// bean 연결을 위해 필요
	public Hat(String name) {
		super();
		this.name = name;
	}

	// bean 연결을 위해 필요
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}

	// 주소가 아니라 내용을 출력하기 위해서 필요
	@Override
	public String toString() {
		return type+"는 "+name;
	}
	
}