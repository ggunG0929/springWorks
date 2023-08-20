package aaa.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class OrderData {
	
	OrderAddr ad;
	ArrayList<OrderProduct> arr;
	int totalSum=0;
	
	public int getTotalSum() {
		totalSum = 0;
		for(OrderProduct tt : arr) {
			totalSum += tt.getTotal();
		}
		System.out.println(totalSum);
		return totalSum;
	}
}
