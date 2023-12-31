package aaa.controll;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
// 이 경로로 들어온다면 적용한다
//@RequestMapping("request/attr1")
@RequestMapping("request")
public class RequestController {

//	@RequestMapping("request/attr1")
	@RequestMapping("attr1")
	// 모델(변수 전달)과 뷰(뷰의 이름)를 동시에 반환하는 인스턴스
	ModelAndView attr1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("req/attr");	// 여기로 이동하도록 함
		mav.addObject("age", 29);
		mav.addObject("pname", "정우성");
		mav.addObject("jum", new int[] {78,89,34});
		mav.addObject("now", new Date());
//		mav.addObject("per", new Person("장동건", "남", true));
		return mav;
	}
	//html에 있으면 오류나서 옮겨옴
//	<!--getter가 없으면 에러-->
//	<!--per: [[${per.pname}]], [[${per.mil}]]<br/>-->
//	@RequestMapping("attr2")
//	ModelAndView attr2() {
////		ModelAndView mav = new ModelAndView();	// 생략시 에러
//		mav.setViewName("req/attr");
//		mav.addObject("age", 29);
//		mav.addObject("pname", "정우성");
//		mav.addObject("jum", new int[] {78,89,34});
//		mav.addObject("now", new Date());
//		mav.addObject("per", new Person("장동건", "남", true));
//		return mav;
//	}
	
	@RequestMapping("attr2")
	// http request 방식도 잘 돌아감
	String attr2(HttpServletRequest request) {
		request.setAttribute("age", 22);
		request.setAttribute("pname", "정좌성");
		request.setAttribute("jum", new int[] {11,22,78,89,34});
		request.setAttribute("now", new Date());
//		request.setAttribute("per", new Person("장서건", "여", true));
		return "req/attr";
	}
	
	@RequestMapping("attr3")
	// Model을 쓰면 자동으로 model and view 객체를 생성, 데이터를 추가하고 뷰를 반환함
	String attr3(Model mm) {
		mm.addAttribute("age", 17);
		mm.addAttribute("pname", "정북성");
		mm.addAttribute("jum", new int[] {11,22});
		mm.addAttribute("now", new Date());
//		mm.addAttribute("per", new Person("북두신건", "남", false));
		return "req/attr";
	}

	@RequestMapping("attr4")
	// age정보가 갱신이 안됨
//	String attr4(Model mm, int age) {
	// age attribute값이 적용됨
//	String attr4(Model mm, @ModelAttribute("age") int age) {
	String attr4(Model mm, 
			@ModelAttribute("age") int age,
			@ModelAttribute("pname") String nick,	// 링크전부터 다시 하니 안됨	// 나는 왜 pname이 잘 받아지지? 선생님과 다른 학생들은 안됨
			@ModelAttribute("jum") int [] jum) {
		mm.addAttribute("now", new Date());
//		mm.addAttribute("per", new Person("북두신건", "남", false));
		return "req/attr";
	}
	
	@RequestMapping("attrForm")
	String attrForm() {
		return "req/attrForm";
	}
	
	@RequestMapping("attrReg")
	ModelAndView attrReg(Model mm,
			@ModelAttribute("age") int age,
			@ModelAttribute("pname") String pname,
			int [] jum, 
			@ModelAttribute("gender") String gender, 
			@ModelAttribute("mil") boolean mil,
			Person per) {
		
		System.out.println(age);
		System.out.println(pname);
		System.out.println(Arrays.toString(jum));
		System.out.println(gender);
		System.out.println(mil);
		System.out.println(per);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("req/attrReg");
		mav.addObject("age", age);
		mav.addObject("pname", pname);
		mav.addObject("jum", jum);
		mav.addObject("now", new Date());
		mav.addObject("per", per);
		return mav;
	}
	
	@RequestMapping("joinForm")
	String joinForm() {
		return "req/joinForm";
	}
	
	@RequestMapping("joinReg")
	String joinReg(Model mm, String pname, String gender, boolean mil) {
	    Person per = new Person();
	    per.setPname(pname);
	    per.setGender(gender);
	    per.setMil(mil);
	    mm.addAttribute("per", per); // Person 객체를 Model에 추가
	    return "req/joinReg";
	}
}
