package exer7;

public class CoffeeOrder {
    String coffeeType;
    int quantity;

    public CoffeeOrder(String coffeeType, int quantity) {
        this.coffeeType = coffeeType;
        this.quantity = quantity;
    }

	public String getCoffeeType() {
		return coffeeType;
	}

	public int getQuantity() {
		return quantity;
	}

}
