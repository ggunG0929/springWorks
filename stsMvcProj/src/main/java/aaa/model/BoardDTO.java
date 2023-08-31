package aaa.model;

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
	
	// 8.30
	String grade;
	// 8.31
	public BoardDTO() {}	
	public BoardDTO(String title, String pname, String pw, String content) {
		super();
		this.title = title;
		this.pname = pname;
		this.pw = pw;
		this.content = content;
	}	
	
	// 선생님이 만드신 것
	int start, limit = 3,pageLimit=4, page, pageStart, pageEnd, pageTotal;
	String msg, goUrl;
	
	public void calc(int total) {
		
		start = (page -1) * limit;
		
		pageStart = (page -1)/pageLimit*pageLimit +1;
		pageEnd = pageStart + pageLimit -1;
		
		pageTotal = total / limit;
		if(total % limit != 0) {
			pageTotal++;
		}
		
		if(pageEnd > pageTotal) {
			pageEnd = pageTotal;
		}
	}
	
	public String getUpfile() {
		if(upfile == null || upfile.trim().equals("") ||  upfile.trim().equals("null") ) {
			upfile = null;
		}
		return upfile;
	}
	
	public boolean isImg() {
		if(getUpfile()==null) {
			return false;
		}
		return Pattern.matches(".{1,}[.](bmp|png|gif|jpg|jpeg)", upfile.toLowerCase());
	}

}
