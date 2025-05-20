package entities;

public class User {
	private int acc_number;
	private String user_name;
	private double balance;
	private double tax = 5.00;

	public User(int number, String user_name, double valor_dep_inicial) {
		super();
		this.acc_number = number;
		this.user_name = user_name;
		this.balance = valor_dep_inicial;
	}

	public User(int acc_number, String user_name) {
		super();
		this.acc_number = acc_number;
		this.user_name = user_name;
	}

	public int getAcc_Number() {
		return acc_number;
	}


	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public double getValor_dep_inicial() {
		return balance;
	}


	public double insertValue(double x) {
		return this.balance += x;
	}

	public double withdrwal(double x) {
		 this.balance = balance - x - tax;
		 return this.balance;
	}

}
