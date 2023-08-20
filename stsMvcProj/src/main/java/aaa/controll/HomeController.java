package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 컨트롤러 어노테이션
@Controller
@RequestMapping("/")
public class HomeController {
	
	// responsebody까지 붙여줘야 homehome이 뜸
	@RequestMapping("/")
	//@ResponseBody	// 주석처리해서 연결처리한 페이지 뜨게 함		// return값이 화면에 뜸
	String homeGo() {
		System.out.println("홈이다");
//		return "homehome";
		return "home";	// views/home.html
	}
	/*
	 * 	application.yaml 설정
	 * server :
	 *	 port : 80
	 * spring :
	 *   thymeleaf :
	 *     prefix : views/
	 *	   suffix : .html
	 *	   cache : false
	 * */

}
