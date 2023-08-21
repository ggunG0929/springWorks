package study;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class study_main {

	public static void main(String[] args) {
//		System.out.println("Hello world");
//		
//		System.out.println("-----------");
//		
//		String str = "Hello world\n";
//		System.out.println(str + str + str);
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("Hello World");
//		}
//		
//		System.out.println("-----------");
//		
//		System.out.println("홍길동\n홍 길 동\n홍  길  동");
//		
//		System.out.println("-----------");
//		
//		System.out.printf("이름: 권지혜\n");
//		System.out.printf("주소: 서울시 관악구\n");
//		System.out.printf("전화번호: 010-6211-0929");
//
//		System.out.println("\n-----------");
//		
//		System.out.printf("제 이름은 홍길동입니다.\n제 나이는 %d살이고요.\n제가 사는 곳의 번지수는 %d-%d 입니다.", 20, 123, 456);
//		
//		System.out.println("\n-----------");
//		
//		System.out.println("4*5=20\n7*9=63");
//		
//		System.out.println("-----------");
//		
//		System.out.println(10+5+"a"+10+5);	// 15a105
//		System.out.println("a"+10+5);	// 스트링은 객체자료형이고 > int가 기본자료형이어서 자동형변환 발생
//		System.out.println('a'+10+5);	// char a = 97
				
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println("뺄셈: " + (num1-num2));
//		System.out.println("덧셈: " + (num1+num2));
//		
//		System.out.println("-----------");
//		
//		int [] num = new int[10];
//		for(int i=0; i<10; i++) {
//			System.out.println("정수를 입력해주세요");
//			num[i] = sc.nextInt();
//		}
//		for(int i : num) {			
//			System.out.println(i);
//		}
//		
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num3=sc.nextInt();
//		System.out.println(num1 + "*" + num2 + "+" + num3 + "=" + (num1*num2+num3));
//		
//		System.out.println("정수를 입력해주세요");
//		int num=sc.nextInt();
//		System.out.println(num*num);
//		
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println(num1+","+num2+": "+(num1/num2) + ", " + (num1%num2));
//		
//		System.out.println("정수를 입력해주세요");
//		int num1=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num2=sc.nextInt();
//		System.out.println("정수를 입력해주세요");
//		int num3=sc.nextInt();
//		System.out.println((num1-num2)*(num2+num3)*(num3/num1));
//		
//		System.out.println("정수를 입력해주세요");
//		int num=sc.nextInt();
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//
//		System.out.println("나이를 입력해주세요");
//		int num=sc.nextInt();
//		if(num>=20) {
//			System.out.println("성인");
//		}else {
//			System.out.println("미성년자");
//		}
//		
//		int num1=23, num2=34, num3=67;
//		if(num1>num2) {
//			if(num1>num3) {
//				System.out.println(num1);
//			}else {
//				System.out.println(num3);
//			}
//		}else {
//			if(num2>num3) {
//				System.out.println(num2);
//			}else {
//				System.out.println(num3);
//			}
//		}
//		
//		System.out.println("-----------");
//		
//		for(int i=1; i<=100; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i=1; i<=100; i++) {			
//			if(i%2==0) {
//				System.out.println("짝수: "+i);
//			}else {
//				System.out.println("홀수: "+i);
//			}
//		}
		
//		int sum=0;
//		for(int i=1; i<=50; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		for(int i=1; i<=50; i++) {
//			if(i%2==0) {				
//				sum += i;
//			}
//		}
//		System.out.println("짝수의 합: "+sum);

//		int sum=0;
//		for(int i=1; i<=50; i++) {
//			if(i%2!=0) {				
//				sum += i;
//			}
//		}
//		System.out.println("홀수의 합: "+sum);
		
//		for(int i=0; i<=100; i++) {
//			if(i%5==0) {				
//				System.out.println(i);
//			}
//		}
//		
//		for(int i=1; i<=100/3; i++) {
//			int y = 3*i;
//			System.out.println(y);
//		}
//		
//		for(int i=1; i<=100; i++) {			
//			if(i%6==0) {
//				System.out.println(i);
//			}
//		}
//		
//		Random r = new Random();
//		int m = r.nextInt(1,10);
//		int n = r.nextInt(1,10);
//		for(int i=1; i<=1000; i++) {
//			if(i%m==0 && i%n==0) {
//				System.out.println(m+","+n+": "+i);
//			}
//		}
		
//		int cnt=0;
//		for(int i=2; i<=40; i+=2) {
//			cnt++;
//		}
//		System.out.println(cnt);
//		int cnt=0;
//		for(int i=1; i<=67; i+=2) {
//			cnt++;
//		}
//		System.out.println(cnt);
//		
//		int sum=0;
//		for(int i=2; i<=100; i+=2) {
//			sum += i;
//			if(sum>=60) {
//				System.out.println(i);
//				break;
//			}
//		}
//
//		int sum=0;
//		for(int i=1; i<=100; i+=2) {
//			sum += i;
//			if(sum>=60) {
//				System.out.println(i);
//				break;
//			}
//		}
//		
//		int [] arr = new int[5];
//		System.out.println("정수 5개를 입력해주세요");
//		int sum=0;
//		int min=0;
//		int max=0;
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//			sum += arr[i];
//			if(i==0) {				
//				min=arr[0];
//				max=arr[0];
//			}else if(min>arr[i]) {
//				min = arr[i];
//			}else if(max<arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최소값: "+min+", 최대값: "+max+", 총합: "+sum);
		
//		String[] arr = new String[30]; 
//		System.out.println(arr.length);
		System.out.println("영단어를 입력해주세요");
//		String [] ar = sc.next().split("");
//		System.out.println(Arrays.toString(ar));
//		System.out.println(ar.length);
//		for(int i=0; i<ar.length; i++) {
//			arr[i]=ar[i];
//		}
//		int max=0;
//		String str = sc.next();
//		String [] ar = str.split("");
//		int [] cl = new int [ar.length];
//		for(int i=0; i<ar.length; i++) {
//			cl[i]  = str.charAt(i);
//			if(i==0) {
//				max=cl[0];
//			}else {
//				if(cl[i]>max) {
//					max = cl[i];
//				}
//			}
//		}
//		System.out.println((char)max);
		String str = sc.next();
		String [] arr = str.split("");
		String str2="";
		for(int i=0; i<arr.length; i++) {
			str2 += arr[arr.length-(i+1)];
		}
		System.out.println(str2);
	}

}
