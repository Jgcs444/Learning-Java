package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}
	
	public String setName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	

	public double Total() {
		return price * quantity;
	}

	public int addNum(int x) {
		return this.quantity += x;
	}

	public int removeNum(int x) {
		return this.quantity -= x;
	}

}
