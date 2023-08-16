package exer10;
/*
 * 도형 클래스를 구현하세요
 * PI = Math.PI
 * method	넒이			둘레
 * return
 * 원		PI*r*r		2*PI*r
 * 직사각형	가로*세로		(가로+세로)*2
 * 직각삼각형	가로*세로/2	가로+세로+빗변
 * 
 * AOP를 이용, 계산할 때마다 각 도형의 넓이, 둘레의 합계, 평균을 계산하세요
 */
public class Figure {
	int jum, sun;
	
	public Figure() {
		super();
		System.out.println("원입니다.");
	}

	public Figure(int jum, int sun) {
		super();
		this.jum = jum;
		this.sun = sun;
		
	}
	
	
}
