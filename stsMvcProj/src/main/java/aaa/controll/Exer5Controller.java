package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Exer5Data;

@RequestMapping("/exer5")
@Controller
public class Exer5Controller {

	@GetMapping("form")
	String form(Exer5Data pd) {
		return "exer/exer5form";
	}
}
