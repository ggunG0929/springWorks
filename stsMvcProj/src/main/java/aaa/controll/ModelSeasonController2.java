package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider;

import aaa.model.MenuData;
import aaa.model.SeasonMain;
import aaa.service.MyProvider;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/model2")
public class ModelSeasonController2 {
	@Resource
	SeasonMain sm;

	@ModelAttribute("hNav")
	Object headerNav() {
		ArrayList<MenuData>res = new ArrayList<>();
		res.add(new MenuData("spring", "봄"));
		res.add(new MenuData("summer", "여름"));
		res.add(new MenuData("autumn", "가을"));
		res.add(new MenuData("winter", "겨울"));
		return res;
	}
	
	@ModelAttribute("mainCt")
	Object mainContent(String sn) {
		return sm.getPicture(sn);
	}
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "바닥글";
	}
	
//	@RequestMapping("/season")
//	String template() {
//		return "model/template2";
//	}
	
	@RequestMapping("/season/{sn}")
	String template(Model mm, @PathVariable String sn) {
		mm.addAttribute(sm.getPicture(sn));
		return "model/template2";
	}
	
	
	// 잘 모르겄는디
	@Resource
	MyProvider provider;
	
//	@RequestMapping("{sn}")
//	String mapping(@PathVariable String sn, Model mm) {
//		mm.addAttribute("sn",Provider.getContext().getBean(sn));
//		System.out.println("sn");
//		return "model/template2";
//	}
	
//	@ModelAttribute("season")
//	Object season() {
//		Object res = provider.getContext().getBean("sn");
//		System.out.println(res);
//		return "res";
//	}
	
}
