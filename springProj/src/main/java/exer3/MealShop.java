package exer3;

abstract public class MealShop {
	/*
	식단표의 식단을 xml에서 지정하세요
	식단표
	아침, 점심, 저녁
	
	아침, 점심, 저녁을 달라고 하면 xml에서 각 식단대로 식사메뉴를 리턴
	토스트, 제육, 삼겹살 
	*/
	abstract public Meal order_morning();
	abstract public Meal order_lunch();
	abstract public Meal order_dinner();
}

class Meal{
	String main, side, soda;
	
	public Meal(String main, String side, String soda) {
		super();
		this.main = main;
		this.side = side;
		this.soda = soda;
	}
	@Override
	public String toString() {
		return "식사나왔습니다. " + main + ", " + side + " 드시고 " + soda + "까지 챙겨서 마시세요.";
	}
	
}
