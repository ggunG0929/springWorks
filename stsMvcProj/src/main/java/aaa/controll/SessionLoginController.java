package aaa.controll;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Person;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("session")
public class SessionLoginController {

	@RequestMapping("loginMain")
	ModelAndView view(HttpSession session) {
		ModelAndView mav = new ModelAndView("session/loginMain");
		String sid, sname;
		if(session.getAttribute("sid") == null) {
			sid = "없음";
		}else {
			sid = (String)session.getAttribute("sid");
		}
		sname = (String)session.getAttribute("sname");
		session.getAttribute("sname");
		mav.addObject("sid", sid);
		mav.addObject("sname", sname);
		return mav;
	}	

	@RequestMapping("loginReg")
	ModelAndView  loginReg(
			String sid, String pw, HttpSession session) {
		
		HashMap<String, Person>map = new HashMap<>();
		map.put("aaa", new Person("aaa", "장동건" , "1111"));
		map.put("bbb", new Person("bbb", "장서건", "222"));
		map.put("ccc", new Person("ccc", "장동건", "3333"));
		map.put("ddd", new Person("ddd", "장남건", "1111"));
		map.put("eee", new Person("eee", "북두신건", "3333"));

		ModelAndView mav = new ModelAndView("session/loginAlert");
		String msg = "로그인 실패";
		if(map.containsKey(sid) && map.get(sid).getPw().equals(pw)) {
			msg = map.get(sid).getPname()+"님 로그인 성공";
			session.setAttribute("sid", sid);
			session.setAttribute("sname", map.get(sid).getPname());
		}
		mav.addObject("msg", msg);
		return mav;
	}
	
	@RequestMapping("logout")
	ModelAndView delete(HttpSession session) {
		String sname = (String)session.getAttribute("sname");
		session.invalidate();
		ModelAndView mav = new ModelAndView("session/loginAlert");
		mav.addObject("msg", sname + "님 로그아웃 되었습니다");
		return mav;
	}
	
	// 선생님것
//	@RequestMapping("loginReg")
//	String loginReg(Person per, HttpSession session) {
//		
//		HashMap<String, Person>map = new HashMap<>();
//		map.put("aaa", new Person("aaa", "장동건" , "1111"));
//		map.put("bbb", new Person("bbb", "장서건", "222"));
//		map.put("ccc", new Person("ccc", "장동건", "3333"));
//		map.put("ddd", new Person("ddd", "장남건", "1111"));
//		map.put("eee", new Person("eee", "북두신건", "3333"));
//		//System.out.println("체크 확인"+per);
//		per.setMsg("로그인 실패");
//		if(map.containsKey(per.getId())) {
//			Person mPer = map.get(per.getId());
//			
//			if(mPer.idPwChk(per)) {
//		
//				per.setMsg(mPer.getPname()+"님 로그인 성공");
//				session.setAttribute("per", mPer);
//			}
//		}
//		
//		return "session/loginAlert";
//	}
//	
//	
//	@RequestMapping("logout")
//	String delete(Person per ,HttpSession session) {
//		
//		per.setMsg(((Person)session.getAttribute("per")).getPname()+"로그아웃 되었습니다");
//		session.invalidate();
//		return "session/loginAlert";
//	}
//	
//	
//	@RequestMapping("loginMain")
//	String view() {
//		
//		return "session/loginMain";
//	}

}
