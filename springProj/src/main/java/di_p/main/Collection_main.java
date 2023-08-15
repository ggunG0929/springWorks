package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.DIColl;

public class Collection_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/collection.xml");
		
		// arraylist : 중복있음, 순서있음
		ArrayList arr1 = context.getBean("arr1", ArrayList.class);
		System.out.println(arr1);	// [아기상어, 뚜루루뚜루, 귀여운, 뚜루루뚜루, 바닷속, 아기상어]
		
		// hashset : 중복없음, 순서없음
		HashSet ss1 = context.getBean("ss1", HashSet.class);
		System.out.println(ss1);	// [바닷속, 귀여운, 아기상어, 뚜루루뚜루]
		
		// linkedhashset : 중복없음, 순서있음
		LinkedHashSet ss2 = context.getBean("ss2", LinkedHashSet.class);
		System.out.println(ss2);	// [아기상어, 뚜루루뚜루, 귀여운, 바닷속]
		
		// hashmap : 아기상어의 경우 value가 두번나와서 덮어씀(나중에 부여한 값으로 출력됨)
		HashMap map1 = context.getBean("map1", HashMap.class);
		System.out.println(map1);	// {티라노=파충류, 아기상어=1심방1심실, 켄신=비천어검류, 악어=파충류}
		
		DIColl dic = context.getBean("dic", DIColl.class);
		System.out.println(dic.nick+", "+dic.age);	// 정우성, 50
		System.out.println(Arrays.toString(dic.arr));	// [11, 22, 33, 44]
		System.out.println(Arrays.toString(dic.arr1));	// [55, 66, 77, 88]
		// list
		System.out.println(dic.arr2);	// [현빈, 원빈, 장희빈, 커피빈]
		// set
		System.out.println(dic.ss1);	// [바닷속, 귀여운, 아기상어, 뚜루루뚜루]
		// map
		System.out.println(dic.mm1);	// {티라노=파충류, 아기상어=1심방1심실, 켄신=비천어검류, 악어=파충류}
	}

}
