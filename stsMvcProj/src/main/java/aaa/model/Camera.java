package aaa.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component	// 여러 컨트롤러에서 가져다 쓰기 가능
@Data
public class Camera {
	String name = "전방카메라";
	int pixel = 2080;
}
