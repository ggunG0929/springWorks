package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.OrderAddr;
import aaa.model.Person;

@Controller
@RequestMapping("/red")
public class RedirectController {

	@RequestMapping("from1")
	String from1() {
		System.out.println("from1() 진입");
		// redirect:주소 --> 리다이렉팅 한다
		return "redirect:to";
	}
	
	@RequestMapping("to")
	String to() {
		System.out.println("to() 실행");
		return "red/to";
	}
	
	// 진입-실행 정보안넘어감
	// Model은 파라미터 전달 못함
	@RequestMapping("from2")
	String from2(Model mm) {
		System.out.println("from2() 진입");
		mm.addAttribute("id", "bbb");
		mm.addAttribute("age", 37);
		mm.addAttribute("marriage", true);
		return "redirect:to";
	}
	
	// 진입-실행 정보넘어감
	// 많이 쓰이지는 않음 알고있어라~
	// ModelAndView로 parameter 전달 가능
	@RequestMapping("from3")
	ModelAndView from3() {
		System.out.println("from3() 진입");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:to");
		mav.addObject("id", "ccc");
		mav.addObject("age", 32);
		mav.addObject("marriage", true);
		// 인스턴스(파싱이 불가능한 형태)는 parameter로 전달 불가
		OrderAddr addr = new OrderAddr();
		mav.addObject("addr", addr);
		return mav;
	}
	
	//진입(정보o)-실행
	@RequestMapping("from4")
	String from4(String id, int age, boolean marriage) {
		System.out.println("from4() 진입: "+id+", "+age+", "+marriage);
		return "redirect:to";
	}
	
	//진입(정보o)-실행-출력
	@RequestMapping("from5")
	String from5(String id, int age, boolean marriage) {
		System.out.println("from5() 진입: "+id+", "+age+", "+marriage);
		return "redirect:to?id="+id+"&age="+age+"&marriage="+marriage;
	}
	
	@RequestMapping("from6")
	ModelAndView from6(Person per) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:to");
		ModelAndView mav = new ModelAndView("redirect:to");
		
		String id = per.getId();
		int age = per.getAge();
		boolean marriage = per.isMarriage();
		mav.addObject("id", id);
		mav.addObject("age", age);
		mav.addObject("marriage", marriage);
		
		System.out.println("from6() 진입: "+id+", "+age+", "+marriage);

		return mav;
	}
}
