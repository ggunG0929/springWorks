package exer10;
/*
 * 도형 클래스를 구현하세요
 * PI = Math.PI
 * method	넒이			둘레
 * return
 * 원		PI*r*r		2*PI*r			변수1: 반지름
 * 직사각형	가로*세로		(가로+세로)*2		변수2: 가로 세로
 * 직각삼각형	가로*세로/2	가로+세로+빗변		변수3: 가로 세로 빗변
 * 
 * AOP를 이용, 계산할 때마다 각 도형의 넓이, 둘레의 합계, 평균을 계산하세요
 */
public class Figure {
	int area, round, sum, avg;

	public Figure() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Figure(int radius) {
		super();
		this.area = area;
		this.round = round;
		this.sum = sum;
		this.avg = avg;
	}
	public Figure(int width, int height) {
		super();
		this.area = area;
		this.round = round;
		this.sum = sum;
		this.avg = avg;
	}
	public Figure(int width, int height, int hypotenus) {
		super();
		this.area = area;
		this.round = round;
		this.sum = sum;
		this.avg = avg;
	}
	
	
	
	
}
