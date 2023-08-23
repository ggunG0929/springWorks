package aaa.model;

import java.util.List;

import lombok.Data;

@Data
public class Exer1Stud {
	// 폼에 입력된 정보들을 학생단위로 묶어줌
	String ban, name;
	List<Integer> jumsu;
	int tot, avg, rank=1;
	
	// exer4에서 사용하기 위해 추가
	public Exer1Stud(String ban, String name, List<Integer> jumsu) {
		super();
		this.ban = ban;
		this.name = name;
		this.jumsu = jumsu;
	}
	
	public int getTot() {
		int tot = 0;
		for (int score : jumsu) {
			tot += score;
		}
		return tot;
	}
	
	// 안 만들어도 될 것 같지만 총점보다는 100점 만점으로 보여지는 평균값이 직관적으로 와닿을 것 같아서
	public int getAvg() {
		avg = getTot()/jumsu.size();
		return avg;
	}
	
	public void rankCalc(List<Exer1Stud> studs) {
		for(Exer1Stud you : studs) {
        	if(getTot()<you.getTot()) {
				rank++;
			}
		}
	}
}
