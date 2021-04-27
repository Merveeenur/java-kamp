package videos;

public class Product {
	
	public Product() {
	
	}
	
	public Product(int id,String name) {
		this();
		this.id=id;
		this.name=name;
	}
	
	
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	

}
