package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// 파라미터보다 이게 더 가져오기 편해지므로 파라미터를 적게 쓰게 되는 방식
@RequestMapping("/path/{cate}")
public class PathController {

	@RequestMapping("aaa")
	String mmm1(@PathVariable String cate) {
		System.out.println("mmm1() 실행:"+cate);
		
		return "path/view";
	}

	@RequestMapping("{ser}")
	String mmm2(@PathVariable String cate, @PathVariable String ser) {
		System.out.println("mmm2() 실행:"+cate+","+ser);
		
		return "path/view";
	}
	
	@RequestMapping("list/{pNo}")
	String mmm3(String cate, @PathVariable String ser) {
		System.out.println("mmm3() 실행:"+cate+","+ser);
		
		return "path/view";
	}
	
	@RequestMapping("{ser}/{pNo}")
	String mmm4(@PathVariable String cate, @PathVariable int pNo,@PathVariable String ser) {
		System.out.println("mmm4() 실행:"+cate+","+ser+","+pNo);
		
		return "path/view";
	}
}
