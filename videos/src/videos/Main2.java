package videos;

public class Main2 {
	
	public static void main(String[]args) {
		
//		CustomerManager customerManager=new CustomerManager( );
//		CustomerManager customerManager2=new CustomerManager();
		
//		customerManager = customerManager2;
//		customerManager.Add();
//		customerManager.Remove();
//		customerManager2.Update();
		
		Product product=new Product();
		product.name="tablet";
		product.id=3;
		product.description="samsung";
		
		
		ProductManager productManager=new ProductManager( );
		productManager.Add(product);
		 
		System.out.println(product.name);
		
		
		
		
//		DortIslem dortIslem=new DortIslem();
//		int sonuc =dortIslem.Cikar(5,7);
//		System.out.println(sonuc); 
	}
}

