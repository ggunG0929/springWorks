package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.OrderData;

@Controller
@RequestMapping("request/order")
// get인지 post인지 방식에 따라 다른 페이지로 넘어감
public class OrderController {

	@GetMapping
	String orderForm() {
		return "req/orderForm";
	}
	
	@PostMapping
	String orderReg(OrderData od) {
		System.out.println(od);
		return "req/orderReg";
	}
}
