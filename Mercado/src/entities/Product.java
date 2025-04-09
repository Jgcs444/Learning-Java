package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double valor_T () {
		return price*quantity;
	}
	
	public void addNewQuantity (int adicionalQuantity) {
		
		 this.quantity += adicionalQuantity;
		
	}
	

}
