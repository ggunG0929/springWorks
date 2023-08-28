package aaa.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Exer5Data {
	// 사용자가 작성하는 걸로
	
	// 상품이름[1,2,3셀렉트]
//	String gname1, gname2, gname3;
	
	// 상품가격 - 자동계산되도록
	@Min(value=6000, message="최소가격은 6000원입니다.")
	@Max(value=20000, message="최대가격은 20000원입니다.")
	int price = 12000;
	
	// 구매자아이디 	- 회원정보와 연결
	@NotEmpty(message="필수입력사항입니다.")
	@Pattern(regexp="[a-z0-9]{3,8}", message="영어 소문자와 숫자만으로 3~8자입니다.")
	String bid = "user1";
	
	// 입금자명
	@Pattern(regexp="[가-힣]{2,5}", message="한글 2~5자로 입력해주세요.")
	String bname = "송강";
	
	// 연락처
	@NotEmpty(message="필수입력사항입니다.")
	@Pattern(regexp="010-[0-9]{3,4}-[0-9]{4}", message="제대로 입력해주세요.")
	String bphone = "";
	
	// 이메일[2셀렉트]
	@Pattern(regexp="[a-z0-9]", message="영어소문자나 숫자만 허용됩니다.")
	String bemail1;
//	, bemail2;
	
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

	public Map<String, String> getBemail2(){
		Map<String, String> res = new LinkedHashMap<>();
		
		res.put("네이버", "naver.com");
		res.put("구글", "google.com");
		res.put("다음(한메일)", "daum.net");
		res.put("줌", "zum.com");
		
		return res;
	}
}
