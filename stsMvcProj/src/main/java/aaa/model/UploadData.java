package aaa.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadData {
//// 내가 작성한 것
//	String id;
//	int age;
//	MultipartFile ff1, ff2;
//	
//	public String getFf1Name() {
//		return ff1.getOriginalFilename();
//	}
	
	String id,ff1Name, msg, ff2Name;
	int age;
	MultipartFile ff1, ff2;
	
	// board만들면서 추가
	String mmffName;
	MultipartFile mmff;
	
	public String getFf1Name() {
		return ff1.getOriginalFilename();
	}
	
}
