package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.Exer2Coffee;

@Controller
@RequestMapping("exer")
public class Exer2Controller {
	/*
	 * 커피 주문을 구현하세요
	 * 주문내용
	 * 커피종류 : 필수
	 * 잔수 : 선택 --> 없을 경우 1잔
	 * 
	 * 아메리카노: 2200
	 * 아프리카노: 2300
	 * 아시아노: 2500
	 * 
	 * 결과
	 * 커피이름, 잔수, 금액
	 * */
	@RequestMapping("exer2param")
	String exer2(Model mm, @RequestParam(value="name", required=true)String name,
			@RequestParam(value="jan", required=false, defaultValue = "1")int jan) {
		Exer2Coffee coffee = new Exer2Coffee(name);
		int price = coffee.getPrice();
//		System.out.println("커피이름: "+name+", 잔수: "+jan+", 총금액: "+(jan*price));
		String str = "커피이름: "+name+", 잔수: "+jan+", 총금액: "+(jan*price);
		mm.addAttribute("str", str);
		return "exer/exer2param";
	}
}
