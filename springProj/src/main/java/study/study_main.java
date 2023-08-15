package study;

import java.util.Scanner;

public class study_main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		System.out.println("-----------");
		
		String str = "Hello world\n";
		System.out.println(str + str + str);
		
		for(int i=0; i<3; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("-----------");
		
		System.out.println("홍길동\n홍 길 동\n홍  길  동");
		
		System.out.println("-----------");
		
		System.out.printf("이름: 권지혜\n");
		System.out.printf("주소: 서울시 관악구\n");
		System.out.printf("전화번호: 010-6211-0929");

		System.out.println("\n-----------");
		
		System.out.printf("제 이름은 홍길동입니다.\n제 나이는 %d살이고요.\n제가 사는 곳의 번지수는 %d-%d 입니다.", 20, 123, 456);
		
		System.out.println("\n-----------");
		
		System.out.println("4*5=20\n7*9=63");
		
		System.out.println("-----------");
		
		System.out.println(10+5+"a"+10+5);	// 15a105
		System.out.println("a"+10+5);	// 스트링은 객체자료형이고 > int가 기본자료형이어서 자동형변환 발생
		System.out.println('a'+10+5);	// char a = 97
				
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println("뺄셈: " + (num1-num2));
//		System.out.println("덧셈: " + (num1+num2));
		
		System.out.println("-----------");
		
//		int [] num = new int[10];
//		for(int i=0; i<10; i++) {
//			System.out.println("정수를 입력해주세요");
//			num[i] = sc.nextInt();
//		}
//		for(int i : num) {			
//			System.out.println(i);
//		}
		
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num3=sc.nextInt();
//		System.out.println(num1 + "*" + num2 + "+" + num3 + "=" + (num1*num2+num3));
		
//		System.out.println("정수를 입력해주세요");
//		int num=sc.nextInt();
//		System.out.println(num*num);
		
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println(num1+","+num2+": "+(num1/num2) + ", " + (num1%num2));
		
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num3=sc.nextInt();
//		System.out.println((num1-num2)*(num2+num3)*(num3/num1));
		
//		System.out.println("정수를 입력해주세요");
//		int num=sc.nextInt();
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}

//		System.out.println("나이를 입력해주세요");
//		int num=sc.nextInt();
//		if(num>=20) {
//			System.out.println("성인");
//		}else {
//			System.out.println("미성년자");
//		}
		
		int num1=23, num2=34, num3=67;
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1);
			}else {
				System.out.println(num3);
			}
		}else {
			if(num2>num3) {
				System.out.println(num2);
			}else {
				System.out.println(num3);
			}
		}
		
		System.out.println("-----------");
		
		
	}

}
