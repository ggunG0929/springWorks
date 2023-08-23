package aaa.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URLEncoder;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.UploadData;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping(value="upload", method=RequestMethod.GET)
	String fileForm() {
		return "file/uploadForm";
	}
	
	@RequestMapping(value="upload", method=RequestMethod.POST)
	String fileReg(Model mm,
			@ModelAttribute("id")String id, 
			@ModelAttribute("age")int age,
			MultipartFile ff1,
			MultipartFile ff2) {
		System.out.println("ff2: "+ff2);
		// ff1: org.springframework.web.multipart.support.StandardMultipartHttpServletRequest$StandardMultipartFile@131a8cca
		System.out.println("ff1: "+ff1);
		// OriginalFilename(): i14yello.jpg
		System.out.println("OriginalFilename(): "+ff1.getOriginalFilename());
		// getName(): ff1
		System.out.println("getName(): "+ff1.getName());
		// getContentType(): image/jpeg
		System.out.println("getContentType(): "+ff1.getContentType());
		// getSize(): 95690
		System.out.println("getSize(): "+ff1.getSize());
		// isEmpty(): false
		System.out.println("isEmpty(): "+ff1.isEmpty());
		
		mm.addAttribute("ff1", ff1.getOriginalFilename());
		return "file/uploadReg";
	}
	
	@RequestMapping(value="upload2")
	String fileReg2(Model mm,
			MultipartHttpServletRequest mr) {
		MultipartFile ff1 = mr.getFile("ff1");
		MultipartFile ff2 = mr.getFile("ff2");
		System.out.println("ff2: "+ff2);
		// ff1: org.springframework.web.multipart.support.StandardMultipartHttpServletRequest$StandardMultipartFile@368ae4bf
		System.out.println("ff1: "+ff1);
		// OriginalFilename(): 18798962_1.jpg
		System.out.println("OriginalFilename(): "+ff1.getOriginalFilename());
		// getName(): ff1
		System.out.println("getName(): "+ff1.getName());
		// getContentType(): image/jpeg
		System.out.println("getContentType(): "+ff1.getContentType());
		// getSize(): 190737
		System.out.println("getSize(): "+ff1.getSize());
		// isEmpty(): false
		System.out.println("isEmpty(): "+ff1.isEmpty());
		
		mm.addAttribute("id", mr.getParameter("id"));
		mm.addAttribute("age", mr.getParameter("age"));
		mm.addAttribute("ff1", ff1.getOriginalFilename());
		return "file/uploadReg";
	}

//	// 내가 한 과제
//	@RequestMapping(value="upload3")
//	String fileReg3(UploadData ud) {
//		// ud: UploadData(id=aaa, age=24, 
//		// ff1=org.springframework.web.multipart.support.
//		// StandardMultipartHttpServletRequest$StandardMultipartFile@7952b366, 
//		// ff2=org.springframework.web.multipart.support.
//		// StandardMultipartHttpServletRequest$StandardMultipartFile@26c43a0c)
//		System.out.println("ud: "+ud);
//
//		// OriginalFilename(): 10.jpg
//		System.out.println("OriginalFilename(): "+ud.getFf1().getOriginalFilename());
//		// getName(): ff1
//		System.out.println("getName(): "+ud.getFf1().getName());
//		// getContentType(): image/jpeg
//		System.out.println("getContentType(): "+ud.getFf1().getContentType());
//		// getSize(): 18538
//		System.out.println("getSize(): "+ud.getFf1().getSize());
//		// isEmpty(): false
//		System.out.println("isEmpty(): "+ud.getFf1().isEmpty());
//		
//		fileSave(ud.getFf1());
//
//		System.out.println("OriginalFilename(): "+ud.getFf2().getOriginalFilename());
//		System.out.println("getName(): "+ud.getFf2().getName());
//		System.out.println("getContentType(): "+ud.getFf2().getContentType());
//		System.out.println("getSize(): "+ud.getFf2().getSize());
//		System.out.println("isEmpty(): "+ud.getFf2().isEmpty());
//		
//		// 파일이 비워져있지 않다면
//		if(!ud.getFf2().isEmpty()) {
//			System.out.println("파일이 존재합니다. 파일 종류를 확인합니다.");
//			// 컨텐츠타입이 image로 시작한다면
//			if((ud.getFf2().getContentType()).substring(0, 5).equals("image")) {
//				System.out.println("이미지 파일입니다. 파일 저장을 시도합니다.");
//				// 파일저장메서드 호출
//				fileSave2(ud.getFf2());
//			// 컨텐츠타입이 image로 시작하지 않는다면
//			}else {
//				System.out.println("이미지 파일이 아닙니다. 파일을 저장하지 않습니다.");
//			}
//		// 파일이 비워져 있다면
//		}else {
//			System.out.println("파일이 존재하지 않습니다. 파일을 저장하지 않습니다.");
//		}
//		
//		return "file/uploadReg3";
//	}
//	
//
//	void fileSave(MultipartFile mf) {
//		// 학원컴
////		String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
//		// 놋북
//		String path = "C:\\Users\\laptop\\Desktop\\coding\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
//		
//		File ff = new File(path+"\\"+mf.getOriginalFilename());
//
//		try {
//			FileOutputStream fos = new FileOutputStream(ff);	// surround with try catch
//			fos.write(mf.getBytes());
//			fos.close();
//		} catch (Exception e) {	// exception 으로
//			e.printStackTrace();
//		}
//	}
//	
//	
//	void fileSave2(MultipartFile mf) {
//		// 저장될 경로
//		// 학원컴
////		String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
//		// 놋북
//		String path = "C:\\Users\\laptop\\Desktop\\coding\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
//		
//		// ff = 저장경로에 파일이름 부여
//		File ff = new File(path+"\\"+mf.getOriginalFilename());
//		
//		// 저장경로에 중복된 파일이름이 존재하지 않을 때까지 파일이름을 가공
//		int cnt=1;
//		while(ff.exists()) {
//			System.out.println("같은 이름의 파일이 존재합니다.");
//			// 파일이름에서 .을 기준으로 앞뒤를 배열에 저장
//			String[] fn = mf.getOriginalFilename().split("[.]");
//			// 배열사이에 _숫자.를 넣어 다시 조합
//			String newName = String.join("_"+cnt+".", fn);
//			System.out.println("새로운 파일이름을 부여합니다. newName: "+newName);
//			// 저장경로에 새로운 파일이름 부여
//			ff = new File(path+"\\"+newName);
//			cnt++;
//		}
//		try {
//			System.out.println("파일을 저장합니다.");
//			FileOutputStream fos = new FileOutputStream(ff);	// surround with try catch
//			fos.write(mf.getBytes());
//			fos.close();
//		} catch (Exception e) {	// exception 으로
//			e.printStackTrace();
//		}
//	}
	
	@RequestMapping(value="upload3")
	String fileReg3(UploadData ud, HttpServletRequest request) {
		
		
		System.out.println("ud:"+ud);
		
		System.out.println("OriginalFilename():"+ud.getFf1().getOriginalFilename());
		System.out.println("getName():"+ud.getFf1().getName());
		System.out.println("getContentType():"+ud.getFf1().getContentType());
		System.out.println("getSize():"+ud.getFf1().getSize());
		System.out.println("isEmpty():"+ud.getFf1().isEmpty());
		
		fileSave(ud.getFf1());
		fileSave2(ud, request);
		
		return "file/uploadReg3";
	}
	
	
	void fileSave(MultipartFile mf) {
		String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
		
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(mf.getBytes());
			
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// uploadData클래스에서 해도 됨
	void fileSave2(UploadData ud, HttpServletRequest request) {
		ud.setMsg(null);
		//파일 업로드 유무 확인
		if(ud.getFf2().isEmpty()) {
			
			ud.setMsg("파일이 비었어");
			return;
		}
		
		String path = request.getServletContext().getRealPath("up");
		path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
		
		// 이름 중간에 .이 있을 수 있으니 last index of를 쓰는 것이 좋음
		int dot = ud.getFf2().getOriginalFilename().lastIndexOf(".");
		String fDomain = ud.getFf2().getOriginalFilename().substring(0, dot);
		String ext = ud.getFf2().getOriginalFilename().substring(dot);
		
		//이미지인지 확인	// 어차피 확장자를 잘라놓았으니 그대로 활용하는 방법이 더 좋음
		if(!Pattern.matches("[.](bmp|jpg|gif|png|jpeg)", ext.toLowerCase())) {	// import
			
			ud.setMsg("이미지 파일이 아님");
			return;
		}
		
		ud.setFf2Name(fDomain+ext); 
		File ff = new File(path+"\\"+ud.getFf2Name());
		int cnt = 1;
		while(ff.exists()) {
			 
			ud.setFf2Name(fDomain+"_"+cnt+ext);
			ff = new File(path+"\\"+ud.getFf2Name());
			cnt++;
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(ud.getFf2().getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping("download")
	void download(
			String ff, 
			HttpServletRequest request,
			HttpServletResponse response) {
		
		
		String fName = request.getParameter("fName");
		String path = request.getServletContext().getRealPath("up");
		path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
		
		
		try {
			FileInputStream fis = new FileInputStream(path+"\\"+fName);
			String encFName = URLEncoder.encode(fName,"utf-8");
			System.out.println(fName+"->"+encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			
			ServletOutputStream sos = response.getOutputStream();
			
			byte [] buf = new byte[1024];
			
			//int cnt = 0;
			while(fis.available()>0) { //읽을 내용이 남아 있다면
				int len = fis.read(buf);  //읽어서 -> buf 에 넣음
											//len : 넣은 byte 길이
				
				sos.write(buf, 0, len); //보낸다 :  buf의 0부터 len 만큼
				
				//cnt ++;
				//System.out.println(cnt+":"+len);
			}
			
			sos.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
