package videos;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int []sayilar=new int[]{1,2,5,7,8,9};
		int aranacak =8;
		boolean varMi=false;
		
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayi mevcuttur."+aranacak);
		}
		else {
			System.out.println("Sayi mevcut deðildir!"+aranacak);
		}
}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
