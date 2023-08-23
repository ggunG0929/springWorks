package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Battery;
import aaa.model.Camera;
import aaa.model.Person;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/model")
public class ModelController {
	
	@ModelAttribute
	// ppp1, ppp2로 불러봐야 안 불러와짐
	// person으로 불러야 불러와짐
	// ppp1과 ppp2 모두가 선택되어서 무엇이 불러와질 지 알 수가 없음 - 이런식으로 사용하지 말 것
	Person ppp1() {
		return new Person("yzc", "유진초이", "1111");
	}

	@ModelAttribute
	Person ppp2() {
		return new Person("bss", "백승수단장", "2222");
	}

	@ModelAttribute("per3")	// 이름 지정. 메소드이름과 attribute 이름은 관련없음
	Person ppp3(int no) {
		Person [] res = {
				new Person("gdm", "구동매", "3333"),
				new Person("khs", "김하성", "4444"),
				new Person("gas", "고애신", "5555")
		};
		System.out.println("ppp3: "+no);
		return res[no];
	}
	
	// @ModelAttribute	// 멤버변수에 직접 넣을 수 없음 (disalllowed)
	@Resource	// 가져오기만 함
	Camera cam;

	@Resource	// 가져오기만 함
	Battery bat1;

	@ModelAttribute
	Camera cc1() {
		return cam;
	}

	@ModelAttribute
	Battery bb1() {
		return bat1;
	}
	
	@RequestMapping("mmm1")
	String mmm1(Model mm) {
		mm.addAttribute("pp", "아이젠 소스케");
		return "model/mmm1";
	}

	@RequestMapping("mmm2")
	String mmm2(Model mm) {
		mm.addAttribute("pp2","내가 곧 하늘이다");
		return "model/mmm2";
	}
}
