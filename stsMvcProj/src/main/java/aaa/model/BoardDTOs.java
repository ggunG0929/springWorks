package aaa.model;

import java.util.ArrayList;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("dtos")
public class BoardDTOs {

	ArrayList<BoardDTO> arr;
	// add로 입력해놓은 부분이 대체됨. 공통적으로 넣을 항목 정할 수 있음
	String ct = "dtos 내용이여";
	int no = 3;
	
	public BoardDTOs() {
		arr = new ArrayList<>();
		arr.add(new BoardDTO("dtos제목21", "dtos이름91", "1111", "dtos내용1"));
		arr.add(new BoardDTO("dtos제목31", "dtos이름81", "1111", "dtos내용ㅇㅇㅇㅇ"));
		arr.add(new BoardDTO("dtos제목41", "dtos이름71", "1111", "dtos내용ㅎㄷㅁㅌ"));
		arr.add(new BoardDTO("dtos제목51", "dtos이름61", "1111", "dtos내용ㅇㄹㄴㄴㄹ"));
		arr.add(new BoardDTO("dtos제목61", "dtos이름51", "1111", "dtos내용1dfs"));
	}
	
}
