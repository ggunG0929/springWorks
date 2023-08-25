package aaa.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

//성적을 입력받아 처리하세요
//이름 - 한글 2~5
//국영수 - 숫자 0~100

@Data
public class Exer6Data {
	
	@NotEmpty(message="이름입력은 필수입니다.")
	@Pattern(regexp="[가-힣]{2,5}", message="한글 2~5자로 입력해주세요.")
	String name;
	
	@Pattern(regexp="[0-9]{1,2}||100", message="0~100까지의 숫자로 입력하세요.")
	String kor;
	@Pattern(regexp="[0-9]{1,2}||100", message="0~100까지의 숫자로 입력하세요.")
	String eng;
	@Pattern(regexp="[0-9]{1,2}||100", message="0~100까지의 숫자로 입력하세요.")
	String mat;
	
	// 다른방법
	@Min(0)
	@Max(100)
	int mus;

}
