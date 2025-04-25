package entities;

public class Worker {

	public String name = "Maria Carolina Toledo";
	public double salary = 6000.00;
	public double tax = 1000.00;

	public double netSalary() {
		return salary - tax;
	}

	public void increaseSalary(double percentage) {
		salary += (salary * percentage) / 100.0;
	}
	
	public String toString () {
		return "\nEmployee: "
				+ String.format("%s", this.name)
				+ ", $: "
				+ String.format("%.2f", this.netSalary());
	}

}
