package videos;

public class Method {

	public static void main(String[] args) {
		//String mesaj="Bug�n hava �ok g�zel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi=topla(5,7);
		System.out.println(sayi);
		
		int toplam=topla2();
		System.out.println(toplam);
		
		
	}
//	public static void add() {
//		System.out.println("eklendi");
//	}
//	
//	public static void delete() {
//		System.out.println("silindi");
//	}
//	
//	public static void update() {
//		System.out.println("g�ncellendi");
//	}
	
	public static int topla(int sayi1,int sayi2){
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar){
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
	}
		return toplam;
	}
	public static String sehirVer(){
		return "�stanbul";
	
	}

}
