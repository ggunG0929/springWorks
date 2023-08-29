package aaa.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.model.PageData2;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource
	BoardMapper mapper;
	
	// 목록
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
	
	// 상세보기
	@RequestMapping("detail/{id}")
	String detail(Model mm, @PathVariable int id) {
		mapper.cntup(id);
		mm.addAttribute("dto", mapper.detail(id));
		return "board/detail";
	}
	
	// 글 작성(폼)
	@GetMapping("insert")
	String insert(BoardDTO dto) {
		return "board/insertForm";
	}
	// 글 작성(폼 등록)
	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd) {
		// mmff필드에 파일이 있다면
		if(!dto.getMmff().isEmpty()) {
			// upfile필드에 mmff필드 파일을 저장하고 최종저장된 이름을 세팅
			dto.setUpfile(fileSave(dto.getMmff()));
		}
		// db에 파일명 저장
		mapper.insseerr(dto);
		pd.setMsg("업로드되었습니다.");
//		pd.setGoUrl("list");
		pd.setGoUrl("detail/"+dto.getGid());
		return "board/alert";
	}
	
	// 글 삭제(폼)
	@GetMapping("delete/{id}")
	String delete(@PathVariable int id, BoardDTO dto) {
		return "board/deleteForm";
	}
	// 글 삭제(폼 등록)
	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd) {
		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/"+dto.getId());
		int cnt = mapper.delettt(dto);
		if(cnt>0) {
			pd.setMsg("삭제되었습니다");
			pd.setGoUrl("/board/list");
		}
		return "board/alert";
	}
	
	// 글 수정(폼)
	@GetMapping("modify/{id}")
	String modify(Model mm,
			@PathVariable int id) {
		mm.addAttribute("dto", mapper.detail(id));
		return "board/modifyForm";
	}
	// 글 수정(폼 등록)
	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd) {
		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/"+dto.getId());
		int cnt;
		if(dto.getMmff().isEmpty()) {
			cnt = mapper.modifffy2(dto);
			if(cnt>0) {
				pd.setMsg("수정되었습니다");
				pd.setGoUrl("/board/detail/"+dto.getId());
			}
		}else {
			dto.setUpfile(fileSave(dto.getMmff()));
			cnt = mapper.modifffy(dto);
			if(cnt>0) {
				pd.setMsg("수정되었습니다");
				pd.setGoUrl("/board/detail/"+dto.getId());
			}else {
				String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
				new File(path+"//"+dto.getUpfile()).delete();
			}
		}
		return "board/alert";
	}
	
	// 파일저장 메서드
	String fileSave(MultipartFile mf) {
	// uploadData클래스에서 해도 됨
	// 메세지를 남기고 싶어서 업로드데이타로 - 이거아냐~
//	UploadData fileSave(UploadData ud) {
		String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
		// 이름 중간에 .이 있을 수 있으니 last index of를 쓰는 것이 좋음
		int dot = mf.getOriginalFilename().lastIndexOf(".");
		String fDomain = mf.getOriginalFilename().substring(0, dot);
		String ext = mf.getOriginalFilename().substring(dot);
//		//이미지인지 확인	// 어차피 확장자를 잘라놓았으니 그대로 활용하는 방법이 더 좋음
//		if(!Pattern.matches("[.](bmp|jpg|gif|png|jpeg)", ext.toLowerCase())) {	// import
//			msg = "이미지 파일이 아닙니다.";
//			return;
//		}
		String mfn =(fDomain+ext); 
		File ff = new File(path+"\\"+mfn);
		int cnt = 1;
		// 같은 이름의 파일이 존재한다면 이름변경
		while(ff.exists()) {
			mfn = (fDomain+"_"+cnt+ext);
			ff = new File(path+"\\"+mfn);
			cnt++;
		}
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			fos.write(mf.getBytes());
			System.out.println("저장됐다");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mfn;
	}
	
//	@RequestMapping("/download/{ff}")
//	void download(@PathVariable String ff) {
//		String fName = ff;
//		String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
//		try {
//			FileInputStream fis = new FileInputStream(path+"\\"+fName);
//			String encFName = URLEncoder.encode(fName,"utf-8");
//			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
//			ServletOutputStream sos = response.getOutputStream();
//			
//			byte [] buf = new byte[1024];
//			//int cnt = 0;
//			while(fis.available()>0) { //읽을 내용이 남아 있다면
//				int len = fis.read(buf);  //읽어서 -> buf 에 넣음
//											//len : 넣은 byte 길이
//				sos.write(buf, 0, len); //보낸다 :  buf의 0부터 len 만큼
//			}
//			sos.close();
//			fis.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
}
