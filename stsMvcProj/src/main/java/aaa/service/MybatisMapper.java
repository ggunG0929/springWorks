package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;

@Mapper
public interface MybatisMapper {

	List<BoardDTO> list();
	
	List<BoardDTO> listSch(BoardDTO dto);
	
	List<BoardDTO> cntSch(BoardDTO dto);
	
	int insseerrList(List list);
	int insseerrDTOs(BoardDTOs dtos);
	// 여러개의 매개변수를 처리시 xml에서는 매개변수 이름으로 접근
	int delettt(int id, String pw);
	// parameterType="map"인 경우 매개변수를 map으로 묶어 key, value 형태로 접근
	int modifffy(int id, String pw, String pname, String content, String title);
	int insseerr(BoardDTO dto);
	
//	// 상세보기
//	BoardDTO detail(int id);
//	// 삽입(글 작성)
//	// 삭제
//	int delettt(BoardDTO dto);
//	// 수정
//	int modifffy(BoardDTO dto);	
//	// 총 게시물수
//	int listCnt();
//	// 현재 id의 최대값
//	int maxId();
//	// 조회수 증가
//	void addCount(int id);
//	// 첨부파일삭제
//	int fileDelete(BoardDTO dto);
//	// 아이디비번체크
//	int idPwChk(BoardDTO dto);
}
