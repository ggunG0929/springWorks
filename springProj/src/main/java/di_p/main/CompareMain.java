package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareMain {
	
	public static void main(String[] args) {
		int [] arr = {66,33,22,33,33,66,88,77,22,33,44};
		ArrayList al = new ArrayList();
		HashSet s1 = new HashSet();
		LinkedHashSet s2 = new LinkedHashSet();
		TreeSet s3 = new TreeSet();

		TreeSet ts1 = new TreeSet(
				new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						return 0;
					}
				});
		
		// 뭔가 이상하다
		TreeSet ts2 = new TreeSet(
				new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						return 1;
					}
				});
		
		TreeSet ts3 = new TreeSet(
				new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						if(o1==o2) {
							return 0;
						}
						return 1;
					}
				});
		
		TreeSet ts4 = new TreeSet(
				new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						int me = (int)o1;
						int you = (int)o2;
						System.out.println(me+", "+you);
						return you-me;
					}
				});
		
		for(int i:arr) {
			al.add(i);
			s1.add(i);
			s2.add(i);
			s3.add(i);
			ts1.add(i);
			ts2.add(i);
			ts3.add(i);
			ts4.add(i);
			System.out.println(">>");
		}
		
		
		System.out.println("-------------------------------------");
		
		// arr: [66, 33, 66, 88, 77, 22, 33, 44]
		System.out.println("arr:"+Arrays.toString(arr));
		
		// al:[66, 33, 66, 88, 77, 22, 33, 44]
		System.out.println("al:"+al);
		
		// s1:[33, 66, 22, 88, 44, 77]
		// 중복제거, 순서 바뀜
		System.out.println("s1:"+s1);
		
		// s2:[66, 33, 88, 77, 22, 44]
		// 중복만 제거
		System.out.println("s2:"+s2);
		
		// s3:[22, 33, 44, 66, 77, 88]
		// 중복제거, 오름차순
		System.out.println("s3:"+s3);
		
		System.out.println("-------------------------------------");
		
		// ts1:[66]
		// compare가 작동이 안됨 다 삭제함
		System.out.println("ts1:"+ts1);
		
		// ts2:[66, 33, 66, 88, 77, 22, 33, 44]
		// al과 같음. 자신과 비교 후 다 뒤로 붙임
		System.out.println("ts2:"+ts2);
		
		// ts3:[66, 33, 88, 77, 22, 44]
		// Linked hashset(s2)과 같음. 중복만 제거
		System.out.println("ts3:"+ts3);
		
		// ts4:[88, 77, 66, 44, 33, 22]
		// 역순정렬
		System.out.println("ts4:"+ts4);

	}

}
