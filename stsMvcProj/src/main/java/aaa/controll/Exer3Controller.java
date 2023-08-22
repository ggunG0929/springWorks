package aaa.controll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Exer3Member;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("exer")
public class Exer3Controller {

	@RequestMapping("exer3cookie")
	ModelAndView loginForm(
			Model mm,
			// defaultValue를 "null"로 설정해도 가능
			@CookieValue(value="pid", defaultValue = "없음")String pid,
			@CookieValue(value="pname", defaultValue = "없음")String pname) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pname", pname);
		mav.addObject("pid", pid);
		return mav;
	}	
	
	@ResponseBody
	@RequestMapping("exer3Reg")
	String loginReg(Model mm,
			HttpServletResponse response,
			@RequestParam String pid,
			@RequestParam String pw,
			@ModelAttribute Exer3Member em
			) {
		System.out.println("pid: " + pid);
		System.out.println("pw: " + pw);

		System.out.println("멤버를 등록합니다");
		Exer3Member m1 = new Exer3Member("aaa", "1111", "장동건");
		Exer3Member m2 = new Exer3Member("bbb", "2222", "장서건");
		Exer3Member m3 = new Exer3Member("ccc", "3333", "장남건");
		Exer3Member m4 = new Exer3Member("ddd", "1111", "장동건");
		Exer3Member m5 = new Exer3Member("eee", "3333", "북두신건");
		
		System.out.println("멤버리스트를 만듭니다");
		List<Exer3Member> ml= new ArrayList<Exer3Member>();
		ml.add(m1);
		ml.add(m2);
		ml.add(m3);
		ml.add(m4);
		ml.add(m5);
		
		String msg = "<script>alert('로그인 실패');location.href='exer3cookie';</script>";
		for(Exer3Member m : ml) {
			if(pid.equals(m.getDbid())&&pw.equals(m.getDbpw())) {
				String dbPname = m.getDbPname();
				msg = "<script>alert('로그인 성공');location.href='exer3cookie';</script>";
				System.out.println("쿠키생성");
				response.addCookie(new Cookie("pid", pid));
				response.addCookie(new Cookie("pname", dbPname));
			}
		}
		return msg;
	}

	@ResponseBody
	@RequestMapping("exer3logout")
	String logout(HttpServletResponse response,
			@CookieValue(value="pid", defaultValue = "없음")String pid,
			@CookieValue(value="pname", defaultValue = "없음")String pname) {
		
		System.out.println("쿠키를 삭제합니다");
		Cookie coo = new Cookie("pid","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		coo = new Cookie("pname","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		String msg = "<script>alert('로그아웃');location.href='exer3cookie';</script>";
		return msg;
	}
	
}
