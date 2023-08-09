package exer2;

import java.util.Arrays;

import di_p.Stud;

public class SRank {
	Student [] students;

	public Student[] getStudents() {
		return students;
	}
	
	public void setStudents(Student [] students) {
		this.students = students;
		for (Student st : students) {
			st.rankCalc(students);
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(students);
	}
		
}

