package aaa.controll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.UploadData;

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
	
	@RequestMapping(value="upload3")
	String fileReg3(UploadData ud) {
		// ud: UploadData(id=aaa, age=24, ff1=org.springframework.web.multipart.support.
		// StandardMultipartHttpServletRequest$StandardMultipartFile@7952b366, 
		// ff2=org.springframework.web.multipart.support.StandardMultipartHttpServletRequest$StandardMultipartFile@26c43a0c)
		System.out.println("ud: "+ud);

		// OriginalFilename(): 10.jpg
		System.out.println("OriginalFilename(): "+ud.getFf1().getOriginalFilename());
		// getName(): ff1
		System.out.println("getName(): "+ud.getFf1().getName());
		// getContentType(): image/jpeg
		System.out.println("getContentType(): "+ud.getFf1().getContentType());
		// getSize(): 18538
		System.out.println("getSize(): "+ud.getFf1().getSize());
		// isEmpty(): false
		System.out.println("isEmpty(): "+ud.getFf1().isEmpty());
		
		if(!ud.getFf1().isEmpty()) {
			System.out.println("파일이 존재합니다.");
			if((ud.getFf1().getContentType()).substring(0, 5).equals("image")) {
				System.out.println("이미지 파일입니다. 파일 저장을 시도합니다.");
				fileSave(ud.getFf1());
				System.out.println("파일을 저장했습니다.");
			}else {
				System.out.println("이미지 파일이 아닙니다. 파일을 저장하지 않습니다.");
			}
		}else {
			System.out.println("파일이 존재하지 않습니다. 파일을 저장하지 않습니다.");
		}
		return "file/uploadReg3";
	}
	
	void fileSave(MultipartFile mf) {
		String path = "C:\\green_project\\springWorks\\stsMvcProj\\src\\main\\webapp\\up";
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		if(ff.exists()) {
			System.out.println("같은 이름의 파일이 존재합니다.");
			String []fm = mf.getOriginalFilename().split("[.]");
			String nn = String.join("_1.", fm);
			ff = new File(path+"\\"+nn);
		}
		try {
			
			FileOutputStream fos = new FileOutputStream(ff);	// surround with try catch
			System.out.println("파일을 올립니다.");
			fos.write(mf.getBytes());
			fos.close();
		} catch (Exception e) {	// exception 으로
			e.printStackTrace();
		}
	}
}
