package exer12;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import exer12.model.Food;

@Component
public class Order {
	Food[] fl;
	int tot;
	
	public Order(Food...fl) {
		super();
		this.fl = fl;
	}

	@Override
	public String toString() {
		return "Order [fl=" + Arrays.toString(fl) + ", tot=" + tot + "]";
	}

}

	

//
//	public void add(GreenStud gs) {
//		StudData sd = null;
//		// kind에 따라서 정보를 연결
//		if(map.containsKey(gs.kind)) {
//			sd = map.get(gs.kind);
//		}else {
//			sd = new StudData();
//		}
//		sd.add(gs);
//		map.put(gs.kind, sd);
//	}
//	
//	public void ppp() {
//		for (Map.Entry<String, StudData> me : map.entrySet()) {
//			System.out.println(me.getKey()+" : "+me.getValue());
//		}
//	}
//}


//class FoodData{
//	int cnt;
//	
//	void count(Food f) {
//		cnt ++;
//	}
//
//	@Override
//	public String toString() {
//		return "FoodData [총갯수=" + cnt + "]";
//	}
//}
