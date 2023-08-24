package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.service.MyProvider;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/provider")
public class ProviderController {
	
	@Resource
	MyProvider provider;

	@ModelAttribute("cam")
	Object mm() {
		// name을 알면 component 걸고 가져오기도 쉬워짐
		Object res = provider.getContext().getBean("camera");
		// mm()실행: Camera(name=전방카메라, pixel=2080)
		System.out.println("mm()실행: "+res);
		return res;
	}

	@RequestMapping("/list")
	String mapping1() {
		return "provider/view";
	}
	
	@RequestMapping("{bbb}")
	String mapping2(@PathVariable String bbb, Model mm) {
		mm.addAttribute("bat",provider.getContext().getBean(bbb));
		return "provider/view";
	}
	
	@ModelAttribute("season")
	Object season() {
		Object res = provider.getContext().getBean("sn");
		System.out.println(res);
		return "res";
	}
	
	@RequestMapping("{sn}")
	String mapping(@PathVariable String sn, Model mm) {
		mm.addAttribute("sn",provider.getContext().getBean(sn));
		System.out.println("sn");
		return "provider/view";
	}
	
	
	
}
