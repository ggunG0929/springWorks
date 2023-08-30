package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface MybatisMapper {

	// 리스트보기
//	List<BoardDTO> list(int start, int limit);
	List<BoardDTO> list();
	List<BoardDTO> listSch(BoardDTO dto);
	List<BoardDTO> cntSch(BoardDTO dto);
	
	// 상세보기
	BoardDTO detail(int id);
	// 삽입(글 작성)
	int insseerr(BoardDTO dto);
	// 삭제
	int delettt(BoardDTO dto);
	// 수정
	int modifffy(BoardDTO dto);	
	// 총 게시물수
	int listCnt();
	// 현재 id의 최대값
	int maxId();
	// 조회수 증가
	void addCount(int id);
	// 첨부파일삭제
	int fileDelete(BoardDTO dto);
	// 아이디비번체크
	int idPwChk(BoardDTO dto);
}
