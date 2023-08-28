package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider;

import aaa.model.MenuData;
import aaa.model.SeasonMain;
import aaa.service.MyProvider;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("model2")
public class ModelSeasonController2 {
	@Resource
	SeasonMain sm;

	// 잘 모르겄는디
	@Resource
	MyProvider provider;

	@ModelAttribute("hNav")
	Object headerNav() {
		ArrayList<MenuData>res = new ArrayList<>();
		res.add(new MenuData("spring", "봄"));
		res.add(new MenuData("summer", "여름"));
		res.add(new MenuData("autumn", "가을"));
		res.add(new MenuData("winter", "겨울"));
		return res;
	}
	
//	// 주소창에 ?sn=이 아니라 /로 연결되도록
//	// myconfig와 연결
//	@Autowired
//	private SeasonMain seasonMain;
	
//	@ModelAttribute("mainCt")
//	Object mainContent(String sn) {
//		return sm.getPicture(sn);
//	}
//	@ModelAttribute("mainCt")
//	public Object mainContent2(@RequestParam String sn) {
//		return seasonMain.getPicture(sn);
//	}
//    @ModelAttribute("mainCt")	// sn이 null이라 오류
//    public Object mainContent(@RequestParam String sn) {
//        SeasonMain seasonMain = provider.getContext().getBean(SeasonMain.class);
//        return seasonMain.getPicture(sn);
//    }
    @ModelAttribute("mainCt")
    Object mainContent(@RequestParam(name = "sn", required = false) String sn) {
        if (sn == null) {
            sn = "spring"; // 기본값 설정
        }
        return sm.getPicture(sn);
//        return provider.getData(sn);
    }
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "바닥글";
	}
	
	@RequestMapping("season")
	String template() {
		return "model/template2";
	}
	
	@RequestMapping("season/{sn}")
	String template(Model mm, @PathVariable String sn) {
		mm.addAttribute("mainCt", sm.getPicture(sn));
		return "model/template2";
	}

	// season/spring 이 아니라 그냥 spring으로 동작함
//	@RequestMapping("{sn}")
//	String mapping(@PathVariable String sn, Model mm) {
//		mm.addAttribute("mainCt", sm.getPicture(sn));
//		return "model/template2";
//	}
	
}
