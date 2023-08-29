package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface BoardMapper {

	// 리스트보기
//	List<BoardDTO> list();
	List<BoardDTO> list(int start, int limit);
	// 상세보기
	BoardDTO detail(int id);
	// 삽입(글 작성)
	int insseerr(BoardDTO dto);
	// 삭제
	int delettt(BoardDTO dto);
	// 수정
	int modifffy(BoardDTO dto);	
	int modifffy2(BoardDTO dto);	
	// 총 게시물수
	int total();
	// 조회수 증가
	void cntup(int id);
}
