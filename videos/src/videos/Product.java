package videos;

public class Product {
	
	public Product() {
	
	}
	
	public Product(int id,String name) {
		this();
		this.id=id;
		this.setName(name);
	}
	
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	
}
