package aaa.controll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Exer1Data;

@Controller
//@RequestMapping("exer/exer1")
@RequestMapping("exer")
public class Exer1Controller {
	
//	@GetMapping
	@RequestMapping("exer1Form")
	// Model사용시 mav인스턴스를 통해 model의 attribute로 정보를 전달하고 view를 return 값으로 이동가능
	String exer1(Model mm) {
		// 학생 수(Student Length),과목 수(Title Length),반 수(Ban)
		int sl=20, tl=3, b=4;
		// 배열이 아닌 리스트(크기가 고정되지 않은 경우 더 적절)로 해보자
		// 학생 수만큼 반을 랜덤으로 배정해서 준비
		List<Integer> rban = rnums(sl, 1, b);
		// 학생 수 * 과목 수만큼 점수를 랜덤으로 배정해서 준비
		List<Integer> rjum = rnums(sl*tl, 0, 100);
		// html에서 시퀀스에 넣어주기 위해 전달
		mm.addAttribute("sl", sl);
		mm.addAttribute("tl", tl);
		// 랜덤숫자 전달
        mm.addAttribute("rban", rban);
        mm.addAttribute("rjum", rjum);
		return "exer/exer1Form";
	}
	
	// 랜덤 정수값으로 리스트 만들기(개수, 최소값, 최대값)
	List<Integer> rnums(int cnt, int min, int max) {
        Random random = new Random();
        List<Integer> rnums = new ArrayList<>();
        // 필요한 개수만큼 랜덤숫자를 만듦
        for(int i=0; i<cnt; i++) {
        	// 최대값과 최소값 범위의 정수를 랜덤으로 구하고 최소값을 더해줌
            int rnum = random.nextInt(max-min+1)+min;
            // 리스트에 추가해줌
            rnums.add(rnum);
        }
        return rnums;
    }
	
//	@PostMapping
	@RequestMapping("exer1Reg")
	String exer1Reg(Model mm, @ModelAttribute Exer1Data ed) {
		// 등수 채워주기
		ed.ranks(ed);
		if("반".equals(ed.getSort())) {
		    if(ed.getStuds() != null) {		    	
				Collections.sort(ed.getStuds(), new Exer1Data.CompareBan());
		    }
		}else if("이름".equals(ed.getSort())) {
			if(ed.getStuds() != null) {		    	
				Collections.sort(ed.getStuds(), new Exer1Data.CompareName());
			}
		}else if("성적".equals(ed.getSort())) {
			if(ed.getStuds() != null) {		    	
				Collections.sort(ed.getStuds(), new Exer1Data.CompareRank());
			}
		}
//	    System.out.println(ed);
	    mm.addAttribute("exer1Data", ed);
	    return "exer/exer1Reg";
	}

}
