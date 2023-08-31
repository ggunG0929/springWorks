package aaa.controll;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;
import aaa.service.MybatisMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/mybatis")
public class MybatisController {
	
	@Resource
	MybatisMapper mapper;
	
	@RequestMapping("{ser}")
	@ResponseBody
	Object sqlGo(@PathVariable String ser) {
		
		Object res = null;
		
//		// ser:list
//		System.out.println("ser:"+ser);

		try {
//			Class cc = mapper.getClass();
//			Method mth = cc.getDeclaredMethod(ser);		//import reflect
//			
//			// class jdk.proxy21.$Proxy104
//			System.out.println("cc: "+cc);
//			// mth: public final java.util.List jdk.proxy5.$Proxy83.list()
//			System.out.println("mth: "+mth);
//			
//			// res는 모두 같은 값임
//			res = mth.invoke(mapper);
//			res = mapper.getClass().getDeclaredMethod(ser).invoke(mapper);
			// mapper에서 만든 메서드 호출
			res = mapper.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return res;
	}
	
	@RequestMapping("listSch/{title}")
	@ResponseBody
	Object listSch(BoardDTO dto) {
		
		System.out.println("listSch");
		Object res = mapper.listSch(dto);
		return res;
	}

	@RequestMapping("cntSch")
	@ResponseBody
	Object cntSch(BoardDTO dto) {
		
		System.out.println("cntSch");
		Object res = mapper.cntSch(dto);
		return res;
	}

	@RequestMapping("inserList")
	@ResponseBody
	Object insseerrList() {
		System.out.println("inserList");
		ArrayList<BoardDTO> list = new ArrayList<>();
		list.add(new BoardDTO("제목1", "이름1", "1111", "내용1"));
		list.add(new BoardDTO("제목12", "이름16", "1111", "내용156"));
		list.add(new BoardDTO("제목13", "이름17", "1111", "내용1ㄱㄷㅇㅎㄴ"));
		list.add(new BoardDTO("제목14", "이름18", "1111", "내용1ㄱㄴㅁㅀ"));
		list.add(new BoardDTO("제목15", "이름19", "1111", "내용1ㄱㄷㅇㄹ"));
		Object res = mapper.insseerrList(list);
		// 갯수를 리턴하고 리스트가 db에 입력됨
		return res;
	}
	
	@RequestMapping("inserDTOs")
	@ResponseBody
	Object inserDTOs() {
		System.out.println("inserDTOs");
		ArrayList<BoardDTO> list = new ArrayList<>();
		Object res = mapper.insseerrDTOs(new BoardDTOs());
		// 갯수를 리턴하고 db에 입력됨
		return res;
	}
	
	@RequestMapping("delete")
	@ResponseBody
	Object delete(int id, String pw) {
		System.out.println("delete");
		Object res = mapper.delettt(id, pw);
		// 갯수를 리턴하고 db에 입력됨
		return res;
	}
	
	@RequestMapping("modify")
	@ResponseBody
	Object modify(int id, String pw, String pname, String content, String title) {
		System.out.println("modify");
		Object res = mapper.modifffy(id, pw, pname, content, title);
		// 갯수를 리턴하고 db에 입력됨
		return res;
	}
	
	@RequestMapping("insert")
	@ResponseBody
	Object insert(BoardDTO dto) {
		System.out.println("insert");
		Object res = mapper.insseerr(dto);
		res += " , " + dto.getId();
		return res;
	}
}
