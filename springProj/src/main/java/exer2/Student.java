package exer2;

import java.util.Arrays;

// 주의
public class Student{
	// 필드 선언
	String name;
	int[] jum;
	int tot, avg, rank;

//	// tot, avg, grade 연산 - 따로 안쓰심
//	void calc() {
//		tot = 0;
//		for(int i : jum) {
//			tot += i;
//		}
//		avg = (double)tot/jum.length;
//	}

	public void setJum(int... jum) {
		this.jum = jum;
	// 여기 중요
		tot=0;
		for(int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	
	// 여기에 있어야함
	void rankCalc(Student [] studs) {
		rank = 1;
		for (Student you : studs) {
			if(avg < you.avg) {
				rank++;
			}
		}
	}
	
	public int[] getJum() {
		return jum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "" + name + Arrays.toString(jum) + " 총점: " + tot + ", 평균: " + avg + ", 등수: "+rank + "\n";
	}
}