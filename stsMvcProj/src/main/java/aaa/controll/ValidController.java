package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.JoinData;
import aaa.service.JoinChk;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/form")
public class ValidController {
	
//	@Resource
//	JoinChk joinChk;

	@GetMapping("validation")
	String validForm(JoinData jd) {
		return "form/validForm";
	}
	
	@PostMapping("validation")
	// 서버 재시작해야 함
	String validReg(@Valid JoinData jd, BindingResult br) {
		System.out.println("validReg: "+br.hasErrors());
		
		if(br.hasErrors()) {
			return "form/validForm";
		}
//		if(joinChk.pwDupChk(jd, br)) {//에러가 있다면
//			return "form/validForm";
//		}
		if(!jd.getPw1().equals(jd.getPw2())) { // 암호가 일치하지 않으면
			br.rejectValue("pw2", null, "암호확인이 문제여");
			return "form/validForm";
		}
		String [] ids = {"aa","bb","cc","dd","ee"};
		for(String i : ids) {			
			if(jd.getPid().equals(i)) { // 아이디가 동일하면
				br.rejectValue("pid", null, "중복된 id입니다.");
				return "form/validForm";
			}
		}
		return "form/validReg";
	}
	
	// 성적을 입력받아 처리하세요
	// 이름 - 한글 2~5
	// 국영수 - 숫자 0~100
}
