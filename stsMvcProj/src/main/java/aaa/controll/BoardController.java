package aaa.controll;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.model.PageData2;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource
	BoardMapper mapper;
	
	@RequestMapping("list")
	String list(Model mm,
			@RequestParam(defaultValue = "1") int page) {
		PageData2 pd = new PageData2(mapper);
		pd.setPage(page);
		pd.calc();
		List<BoardDTO> data = mapper.list(pd.getStart(), pd.getLimit());
//		System.out.println(data);
		mm.addAttribute("pd", pd);
		mm.addAttribute("mainData", data);
		return "board/list";
	}
	
	@RequestMapping("detail/{id}")
	String detail(Model mm, @PathVariable int id) {
		mm.addAttribute("dto", mapper.detail(id));
		return "board/detail";
	}
	
	@GetMapping("insert")
	String insert(BoardDTO dto) {
		return "board/insertForm";
	}
	
	// 파일컨트롤러를 참고하기
	// 멀티파트파일이랑 ud랑 뭐가 다른지 잘 모르겠음 
	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd) {
		mapper.insseerr(dto);
		pd.setMsg("작성되었습니다.");
		pd.setGoUrl("list");
		System.out.println(dto);
		return "board/alert";
	}
	
	@GetMapping("delete/{id}")
	String delete(@PathVariable int id, BoardDTO dto) {
		return "board/deleteForm";
	}
	
	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd) {
		
		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/"+dto.getId());
		
		int cnt = mapper.delettt(dto);
		System.out.println("deleteReg:" + cnt);
		
		if(cnt>0) {
			pd.setMsg("삭제되었습니다");
			pd.setGoUrl("/board/list");
		}
		return "board/alert";
	}
	
	@GetMapping("modify/{id}")
	String modify(Model mm,
			@PathVariable int id) {
		mm.addAttribute("dto", mapper.detail(id));
		return "board/modifyForm";
	}
	
	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd) {
		
		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/"+dto.getId());
		
		int cnt = mapper.modifffy(dto);
		System.out.println("modifyReg:" + cnt);
		
		if(cnt>0) {
			pd.setMsg("수정되었습니다");
			pd.setGoUrl("/board/detail/"+dto.getId());
		}
		return "board/alert";
	}
	
}
