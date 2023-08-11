package exer6;

import java.util.Arrays;

import jakarta.annotation.Resource;

public class Jujum {
	String name;
	@Resource
	Alcohol alc;
	@Resource
	Anju anju;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAlc(Alcohol alc) {
		this.alc = alc;
	}
	public void setAnju(Anju anju) {
		this.anju = anju;
	}
	
	@Override
	public String toString() {
		return name + "를 시키셨습니다. " + alc + anju;
	}
}

class Alcohol{
	String name, volume;

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "술 들어갑니다~ 알콜도수 "+volume+"인 "+name+"입니다.";
	}
	
	
}
class Anju{
	String menu, side;
		
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void setSide(String side) {
		this.side = side;
	}
	
	@Override
	public String toString() {
		return "안주 드세요~ " + menu + "에 "+side+" 드셔보세요.";
	}
}
