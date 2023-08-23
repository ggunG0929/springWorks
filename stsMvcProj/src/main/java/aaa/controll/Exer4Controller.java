package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 기존에 만들어둔 클래스 사용
import aaa.model.Exer1Data;
import aaa.model.Exer4SData;
// 기존에 만들어둔 클래스 사용
import aaa.model.MenuData;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/exer")
public class Exer4Controller {
	
	@Resource
	Exer4SData sm;

	@ModelAttribute("hNav")
	Object headerNav() {
		ArrayList<MenuData>res = new ArrayList<>();
		// url, txt
		// 기존 메뉴데이타 클래스 그대로 이용
		res.add(new MenuData("all", "전체"));
		res.add(new MenuData("first", "1반"));
		res.add(new MenuData("second", "2반"));
		res.add(new MenuData("third", "3반"));
		res.add(new MenuData("fourth", "4반"));
		return res;
	}
	
    @ModelAttribute("mainCt")
    Object mainContent(
    		// sn: menudata url부분 헤드바메뉴
    		@RequestParam(value="sn", required=false, defaultValue="all")String sn,
    		@RequestParam(value="sort", required=false, defaultValue="입력") String sort) {
    	
        Exer1Data data = sm.getData().get(sn);
        data.setSort(sort); // 정렬 방식 설정
        data.sort();
        return data;
    }
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "그린 풀스택 322호";
	}
	
	@RequestMapping("/exer4ban")
	String template() {
		return "exer/exer4ban";
	}
}
