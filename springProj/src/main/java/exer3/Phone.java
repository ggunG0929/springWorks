package exer3;

public class Phone {
	String name;
	Battery bat;
	Screen scr;
	Camera cam;
	
//	public Phone(String name, Battery bat, Screen scr, Camera cam) {
//		super();
//		this.name = name;
//		this.bat = bat;
//		this.scr = scr;
//		this.cam = cam;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Battery getBat() {
		return bat;
	}
	public void setBat(Battery bat) {
		this.bat = bat;
	}
	// autowire="byName"때문에 연결해줌
//	public void setBat1(Battery bat) {
//		this.bat = bat;
//	}
	public Screen getScr() {
		return scr;
	}
	public void setScr(Screen scr) {
		this.scr = scr;
	}
	// autowire="byName"때문에 연결해줌
//	public void setSc1(Screen scr) {
//		this.scr = scr;
//	}
	public Camera getCam() {
		return cam;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}
	// autowire="byName"때문에 연결해줌
//	public void setCam1(Camera cam) {
//		this.cam = cam;
//	}
	@Override
	public String toString() {
		return "PhoneShop [name=" + name + ", bat=" + bat + ", scr=" + scr + ", cam=" + cam + "]";
	}

}

class Battery{
	String name, type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + ", type=" + type + "]";
	}
	
};

class Screen{
	
	String name;
	int size;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Screen [name=" + name + ", size=" + size + "]";
	}
	
};

class Camera{
	
	String name, pixel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
	
};
