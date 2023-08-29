package aaa.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

// 별명처럼 불려짐
@Alias("bDTO")
@Data
public class BoardDTO {
	
	MultipartFile mmff;
	
	int id, cnt, seq, lev, gid;
	String title, pname, pw, upfile, content;
	Date regDate;
	
//	// 선생님이 만드신 것
//	int start, limit = 3,pageLimit=4, page, pageStart, pageEnd, pageTotal;
//	
//	public void calc() {
//		
//		
//		start = (page -1) * limit;
//		
//		pageStart = (page -1)/pageLimit*pageLimit +1;
//		pageEnd = pageStart + pageLimit -1;
//	
//	public String getUpfile() {
//		if(upfile == null || upfile.trim().equals("") ||  upfile.trim().equals("null") ) {
//			upfile = null;
//		}
//		return upfile;
//	}
//	
//	public boolean isImg() {
//		if(getUpfile()==null) {
//			return false;
//		}
//		return Pattern.matches(".{1,}[.](bmp|png|gif|jpg|jpeg)", upfile.toLowerCase());
//	}
	
	
	// 선생님은 이 밑에 것들 다 만들지 않으신 상태이긴 함. 그치만 우리는 jsp때도 여기에 만들기는 했었는데... 그냥 따로 안만들고 다 컨트롤러에서 돌려도 되는건지?
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm");
	
	public String getUpfile() {
		if(upfile==null||upfile.trim().equals("")||upfile.trim().equals("null")) {
			upfile="";
		}
		return upfile;
	}
	
	public boolean isImg() {
		boolean res = Pattern.matches(".*[.](jpg|bmp|png|gif)", getUpfile().toLowerCase());
		return res;
	}
	
	public String getContentBr() {
		return content.replaceAll("\n", "<br>");
	}
	
	public String getReg_dateStr() {
		return sdf.format(regDate);
	}
}
