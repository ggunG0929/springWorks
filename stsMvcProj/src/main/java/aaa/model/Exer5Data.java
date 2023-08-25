package aaa.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Exer5Data {
	// 사용자가 쓰는 걸까 관리자가 쓰는 걸까
	// 상점아이디(우직)
	String mid = "wuzik";
	// 상품이름[1,2,3셀렉트] - 예약정보에서 넘어옴
//	String gname1, gname2, gname3;
	// 상품가격 		- 예약정보에서 넘어옴
	int price = 12000;
	// 구매자아이디 	- 예약정보에서 넘어옴 	- 회원정보와 연결
	String bid = "wuzikuser1";
	// 구매자명 		- 회원정보에서 넘어옴
	String bname = "송강";
	// 카드번호		- 회원정보? 결제정보?
	int cardnum;
	// 카드 유효기간 년/월[셀렉트]
//	int cardexpy;
//	int cardexpm;
	// 생년월일 6자리	- 회원정보에서 넘어옴
	int authfield1 = 940423;
	// 카드비번앞2자리
	int authfield2;
	// 구매자이메일[2셀렉트]	- 회원정보에서 넘어옴
	String bemail1;
//	, bemail2;
	// 구매자 폰번호[1셀렉트]	- 회원정보에서 넘어옴
//	int btel1, 
	int btel2, btel3;
	// 화폐단위[셀렉트]
	String currency = "WON";
//	// 결과값 - api에서 넘어옴
//	// 거래번호
//	int tid;
//	// 결과코드 - 00이어야 함
//	int resultCode;
//	// 결과메세지
//	String resultMsg;
//	// 승인번호
//	int authCode;
//	// 승인날짜, 시각
//	int PgAuthDate;
//	int PgAuthTime;
	
	// 데이터명/한글명인 클래스가 필요
	public List<MenuData> getGname1(){
		List<MenuData> res = new ArrayList<>();
		
		res.add(new MenuData("local1","노원점"));
		res.add(new MenuData("local2","수유점"));
		res.add(new MenuData("local3","강남점"));
		res.add(new MenuData("local4","목동점"));
		
		return res;
	}
	public List<MenuData> getGname2(){
		List<MenuData> res = new ArrayList<>();
		
		res.add(new MenuData("room1","다이아룸"));
		res.add(new MenuData("room2","사파이어룸"));
		res.add(new MenuData("room3","루비룸"));
		res.add(new MenuData("room4","가넷룸"));
		
		return res;
	}
	public List<MenuData> getGname3(){
		List<MenuData> res = new ArrayList<>();
		res.add(new MenuData("a09","9~10시"));
		res.add(new MenuData("a10","10~11시"));
		res.add(new MenuData("a11","11~12시"));
		res.add(new MenuData("p12","12~13시"));
		res.add(new MenuData("p13","13~14시"));
		res.add(new MenuData("p14","14~15시"));
		res.add(new MenuData("p15","15~16시"));
		res.add(new MenuData("p16","16~17시"));
		res.add(new MenuData("p17","17~18시"));
		res.add(new MenuData("p18","18~19시"));
		res.add(new MenuData("p19","19~20시"));
		res.add(new MenuData("p20","20~21시"));
		res.add(new MenuData("p21","21~22시"));
		
		return res;
	}
	
	public List<Integer> getCardexpy(){
		List<Integer> res = new ArrayList<>();
		
		res.add(23);
		res.add(24);
		res.add(25);
		res.add(26);
		res.add(27);
		
		return res;
	}
	
	public List<Integer> getCardexpm(){
		List<Integer> res = new ArrayList<>();
		
		res.add(1);
		res.add(2);
		res.add(3);
		res.add(4);
		res.add(5);
		res.add(6);
		res.add(7);
		res.add(8);
		res.add(9);
		res.add(10);
		res.add(11);
		res.add(12);
		
		return res;
	}

	public Map<String, String> getBemail2(){
		Map<String, String> res = new LinkedHashMap<>();
		
		res.put("네이버", "naver.com");
		res.put("구글", "google.com");
		res.put("다음(한메일)", "daum.net");
		res.put("줌", "zum.com");
		
		return res;
	}
}
