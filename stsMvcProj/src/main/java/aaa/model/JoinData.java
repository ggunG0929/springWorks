package aaa.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinData {
	
	// 자카르타로 import
	// 요즘엔 유효성검사를 ajax로 많이 하기 때문에 잘 쓰지 않음
	// 서버에 다녀와 value값으로 넣어져 다시 보여짐
	@NotEmpty(message = "아이디가 없습니다.")
	@Size(min=1, max=10, message="아이디 길이를 확인하세요")
	String pid;
	
//	@Size(min=2, max=10, message="이름 길이를 확인하세요")
	@Pattern(regexp="[가-힣]{2,10}", message = "한글 2~10자로 입력해주세요.")
	String pname;
		
	String pw1;
	String pw2;
	
	@Email(message="메일 형식으로 입력하세요")
	String email;
	
//	// 컨버팅오류
//	@Past(message="오늘 이전의 날짜로 입력하세요")
//	Date birth;
	String birth;
	
	@Positive(message="양수만 입력하세요")
	int ban;

}
