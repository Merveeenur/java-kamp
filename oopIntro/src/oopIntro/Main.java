package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10); //referans olu�turma, instance

		
		
		Product product2 = new Product(); 
		product2.setId(1);
		product2.setName("lenovo v15");
		product2.setDetail("15 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
//		Product product3 = new Product(); 
//		
//		
//	
//		 Product[] products= {product1,product2,product3};
//		 
//		 for (Product product : products) {
//			 
//			 System.out.println(product.name);
//		}
//		 
//		 System.out.println(products.length);
//		 
//		 
		 Category category1=new Category();
		 category1.setId(1);
		 category1.setName("Bilgisayar");
		 
		 Category category2=new Category();
		 category2.setId(2);
		 category2.setName("Ev/Bah�e");
		 
		 System.out.println(category1.getName());
//		 
//		 
//		 ProductManager productManager=new ProductManager();
//		 productManager.addToCart(product1);
//		 
//		 productManager.addToCart(product2);
//		 
//		 productManager.addToCart(product3);
//		 
		 
	}

}
