package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		// Constructor, executa no momento de instanciação do objeto.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		// Constructor, executa no momento de instanciação do objeto.
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int adicionalQuantity) {

		this.quantity += adicionalQuantity;
		// O this é uma referência ao próprio obj da classe. Quando se está dentro de uma classe e usasse o this, 
		//está sendo referido ao objeto atual que está executando o código.
		// Por que e quando usar ? 
		// 1. Para diferenciar atributos de parâmetros;
		// 2. Para passar o próprio obj como argumento;
		// 3. Para chamar outro construtor na mesma classe;
		// 4. Quando se quer deixar claro que está sendo usado o atributo da instância.
		// Obs importante: Só pode ser usado dentro de métodos de instância, por que ele depende do objeto em si.
		// Em métodos static, não tem this - por que não tem objeto.
		// Static é da classe, this é do obj.
		// Todos esses métodos não são static por que :
		// 1- Eles dependem de dados do objeto atual;
		

	}

	public void removeQuantity(int removalQuantity) {
		this.quantity -= removalQuantity;
	}

}
