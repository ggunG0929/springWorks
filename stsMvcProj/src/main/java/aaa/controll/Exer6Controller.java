package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Exer6Data;
import jakarta.validation.Valid;

// 성적을 입력받아 처리하세요
// 이름 - 한글 2~5
// 국영수 - 숫자 0~100

@Controller
@RequestMapping("/exer6")
public class Exer6Controller {

	@GetMapping("valid")
	String validForm(Exer6Data ed) {
		return "exer/exer6Form";
	}
	
	@PostMapping("valid")
	// 서버 재시작해야 함
	String validReg(@Valid Exer6Data ed, BindingResult br) {
		
		if(br.hasErrors()) {
			return "exer/exer6Form";
		}else {			
			return "exer/exer6Reg";
		}
	}
	
}
