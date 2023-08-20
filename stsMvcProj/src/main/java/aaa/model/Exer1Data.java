package aaa.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.Data;

@Data
public class Exer1Data {
	// 폼에 입력된 과목 이름을 리스트로 저장
	ArrayList<String> titles;
	// 학생으로 묶은 값들을 리스트로 저장
	ArrayList<Exer1Stud> studs;
	String sort;
	
	public Exer1Data ranks(Exer1Data exer1Data) {
        List<Exer1Stud> studs = exer1Data.getStuds();
        // null 오류가 발생해서 추가해줌
        if(studs!=null) {
	        for(Exer1Stud stud : studs) {
	            stud.rankCalc(studs);
	        }
        }
        return exer1Data;
    }
	
	// 정렬 클래스
	// 컨트롤러에서 사용하기 위해 static으로
	// No enclosing instance of type Exer1Data is accessible. 
	// Must qualify the allocation with an enclosing instance of type Exer1Data
	// (e.g. x.new A() where x is an instance of Exer1Data).
	public static class CompareBan implements Comparator<Exer1Stud> {
		@Override
		public int compare(Exer1Stud s1, Exer1Stud s2) {
			// 반 길이를 비교해서 더 짧은 경우를 앞으로 오게	// 1반 11반 2반 순으로 정렬되는 것을 보완
	        int length = Integer.compare(s1.ban.length(), s2.ban.length());
	        // 반 길이가 같은 경우가 아니라면
	        if (length != 0) {
	        	// 짧은 반이 앞으로
	        	// length값은 s1의 값이 더 짧다면 음수, 길다면 양수가 나옴
	            return length;
	        }
	        // 반 길이가 같으면 철자를 비교
	        int ban = s1.ban.compareTo(s2.ban);
	        // 반이 다른 경우
	        if (ban != 0) {
	        	// 반 철자에 따라 정렬
	            return ban;
	        }
	        // 반이 같은 경우 등수로 정렬
	        return Integer.compare(s1.rank, s2.rank);
		}
	}
	
	public static class CompareName implements Comparator<Exer1Stud> {
		@Override
	    public int compare(Exer1Stud s1, Exer1Stud s2) {
			// 이름 길이를 비교해서 더 짧은 경우를 앞으로 오게	// 학생1 학생 11 학생2 순으로 정렬되는 것을 보완
	        int length = Integer.compare(s1.name.length(), s2.name.length());
	        // 이름 길이가 같은 경우가 아니라면
	        if (length != 0) {
	        	// 짧은 이름이 앞으로
	        	// length값은 s1의 값이 더 짧다면 음수, 길다면 양수가 나옴
	            return length;
	        }
	        // 이름 길이가 같으면 사전 순으로 정렬
	        return s1.name.compareTo(s2.name);
	    }
	}
	public static class CompareRank implements Comparator<Exer1Stud> {
		@Override
		public int compare(Exer1Stud s1, Exer1Stud s2) {
			// s1의 값이 더 크다면 양수, 뒤로 감
			if(s1.rank > s2.rank) {
				return 1;
			// s1의 값이 더 작다면 음수, 앞으로 감
			} else if(s1.rank < s2.rank) {
				return -1;
			}
			return 0;
		}
	}
}