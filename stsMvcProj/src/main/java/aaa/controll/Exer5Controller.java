package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Exer5Data;
import jakarta.validation.Valid;

@RequestMapping("/exer5")
@Controller
public class Exer5Controller {

	@GetMapping("form")
	String form(Exer5Data pd) {
		return "exer/exer5form";
	}
	
	@PostMapping("form")
	// 서버 재시작해야 함
	String postform(@Valid Exer5Data ed, BindingResult br) {
		
		if(br.hasErrors()) {
			return "exer/exer5Form";
		}else {			
			return "exer/exer5Reg";
		}
	}
}
