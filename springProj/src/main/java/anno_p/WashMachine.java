package anno_p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WashMachine {
	// 메소드가 아니라 멤버변수에 직접 걸어줘도 됨
	// 자동결합
	@Autowired
	// mmm2랑 연결해라
	@Qualifier("mmm2")
	Motor mt;

	Drum dr;
	String name;
	
	public Motor getMt() {
		return mt;
	}
	// 멤버변수에 직접 걸어주었다면 굳이 setter가 필요가 없음
//	// 자동결합
//	@Autowired
//	// mmm2랑 연결해라
//	@Qualifier("mmm2")
//	public void setMqaz(Motor mt) {
//		this.mt = mt;
//	}
	public Drum getDr() {
		return dr;
	}
	// 있으면 자동결합해라 하지만 없어도 오류는 안난다
	@Autowired(required=false)
	public void setDr(Drum dr) {
		this.dr = dr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "WashMachine [name=" + name + ", dr=" + dr + ", mt=" + mt + "]";
	}
}

class Motor{
	String name;
	int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Motor [name=" + name + ", power=" + power + "]";
	}
	
}

class Drum{
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
		return "Drum [name=" + name + ", size=" + size + "]";
	}
	
}