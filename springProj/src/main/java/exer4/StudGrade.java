package exer4;

import java.util.Arrays;

public class StudGrade{

	String name, grade;
	int [] jum;
	int avg;
	public void setName(String name) {
		this.name = name;
	}
	public void setJum(int... jum) {
		this.jum = jum;
		int tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}
	public int[] getJum() {
		return jum;
	}
	
	@Override
	public String toString() {
		return "" + name + "\t" + Arrays.toString(jum) + "\t" + avg + "\t"+grade;
	}
	
}
