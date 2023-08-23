package aaa.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class Exer4SData {
	HashMap<String, Exer1Data> data;

    public Exer4SData() {
        data = new HashMap<>();

        ArrayList<Exer1Stud> studs = new ArrayList<>();

        // 학생: 반, 이름, 점수 지정 생성
        // 이름순 정렬을 알아보기 위해 이름 섞어서 저장
    	Exer1Stud stud1 = new Exer1Stud("1", "학생10", Arrays.asList(90, 85, 84));
    	Exer1Stud stud2 = new Exer1Stud("1", "학생4", Arrays.asList(78, 88, 92));
    	Exer1Stud stud3 = new Exer1Stud("1", "학생16", Arrays.asList(96, 64, 68));
    	Exer1Stud stud4 = new Exer1Stud("1", "학생2", Arrays.asList(73, 69, 53));
    	Exer1Stud stud5 = new Exer1Stud("1", "학생18", Arrays.asList(42, 53, 85));
    	Exer1Stud stud6 = new Exer1Stud("2", "학생6", Arrays.asList(78, 67, 92));
    	Exer1Stud stud7 = new Exer1Stud("2", "학생20", Arrays.asList(77, 32, 61));
    	Exer1Stud stud8 = new Exer1Stud("2", "학생12", Arrays.asList(56, 74, 92));
    	Exer1Stud stud9 = new Exer1Stud("2", "학생9", Arrays.asList(74, 94, 87));
    	Exer1Stud stud10 = new Exer1Stud("2", "학생1", Arrays.asList(81, 83, 89));
    	Exer1Stud stud11 = new Exer1Stud("3", "학생11", Arrays.asList(90, 85, 74));
    	Exer1Stud stud12 = new Exer1Stud("3", "학생8", Arrays.asList(37, 82, 55));
    	Exer1Stud stud13 = new Exer1Stud("3", "학생13", Arrays.asList(83, 52, 91));
    	Exer1Stud stud14 = new Exer1Stud("3", "학생5", Arrays.asList(84, 72, 83));
    	Exer1Stud stud15 = new Exer1Stud("3", "학생15", Arrays.asList(72, 88, 92));
    	Exer1Stud stud16 = new Exer1Stud("4", "학생3", Arrays.asList(84, 96, 74));
    	Exer1Stud stud17 = new Exer1Stud("4", "학생17", Arrays.asList(86, 78, 72));
    	Exer1Stud stud18 = new Exer1Stud("4", "학생19", Arrays.asList(90, 82, 84));
    	Exer1Stud stud19 = new Exer1Stud("4", "학생14", Arrays.asList(86, 56, 39));
    	Exer1Stud stud20 = new Exer1Stud("4", "학생7", Arrays.asList(88, 68, 78));

    	// 어레이리스트에 추가
    	studs.add(stud1);
    	studs.add(stud2);
    	studs.add(stud3);
    	studs.add(stud4);
    	studs.add(stud5);
    	studs.add(stud6);
    	studs.add(stud7);
    	studs.add(stud8);
    	studs.add(stud9);
    	studs.add(stud10);
    	studs.add(stud11);
    	studs.add(stud12);
    	studs.add(stud13);
    	studs.add(stud14);
    	studs.add(stud15);
    	studs.add(stud16);
    	studs.add(stud17);
    	studs.add(stud18);
    	studs.add(stud19);
    	studs.add(stud20);

    	// 학생 클래스의 어레이리스트
        ArrayList<Exer1Stud> firsts = new ArrayList<>();
        ArrayList<Exer1Stud> seconds = new ArrayList<>();
        ArrayList<Exer1Stud> thirds = new ArrayList<>();
        ArrayList<Exer1Stud> fourths = new ArrayList<>();
        
        // data형식으로 stud어레이리스트를 저장
        Exer1Data datas = new Exer1Data();
        datas.setStuds(studs);
        // 등수계산
        datas.ranks(datas);
        // all 키값에 저장
        data.put("all", datas);
        
        // 반별로 나눔
        for (Exer1Stud stud : studs) {
            if(stud.getBan().equals("1")) {
                firsts.add(stud);
            }else if(stud.getBan().equals("2")) {
            	seconds.add(stud);
            }else if(stud.getBan().equals("3")) {
            	thirds.add(stud);
            }else {
            	fourths.add(stud);
        	}
        }
        
        // 반별로 저장
        Exer1Data first = new Exer1Data();
        first.setStuds(firsts);
        // 전체에서 등수계산을 해서 이미 적용이 되어버림
        // 데이터형태를 data로 받지말고 stud로만 받을걸..
//        first.ranks(first);
        data.put("first", first);
        Exer1Data second = new Exer1Data();
        second.setStuds(seconds);
//        second.ranks(second);
        data.put("second", second);
        Exer1Data third = new Exer1Data();
        third.setStuds(thirds);
//        third.ranks(third);
        data.put("third", third);
        Exer1Data fourth = new Exer1Data();
        fourth.setStuds(fourths);
//        fourth.ranks(fourth);
        data.put("fourth", fourth);
    }
    
    // 컨트롤러에서 사용하기 위해 만듦
    public HashMap<String, Exer1Data> getData() {
        return data;
    }
    
}
