package aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data	// setter, toString
@AllArgsConstructor		// getter? 요소를 불러올 수 있음
public class Person {
	
	String pname, gender;
	boolean mil;
	
	String id, pw;
	int age;
	boolean marriage;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String id, String pname, String pw) {
		super();
		this.id = id;
		this.pname = pname;
		this.pw = pw;
	}
	
//	// lombok.data 사용시 생략가능
//	public Person(String pname, String gender, boolean mil) {
//		super();
//		this.pname = pname;
//		this.gender = gender;
//		this.mil = mil;
//	}
//
//	public String getPname() {
//		return pname;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public boolean isMil() {
//		return mil;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [pname=" + pname + ", gender=" + gender + ", mil=" + mil + "]";
//	}
	
}
