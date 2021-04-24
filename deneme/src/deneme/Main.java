package deneme;


public class Main {

	public static void main(String[] args) {
			
		
		int [] sayilar = {80,50,30,90,100};
		int max =sayilar[0];
		for (int i = 0; i < sayilar.length;i++) {

			if(max< i) {
				max=i;
			}
		}
		System.out.println(max);
		
		

	}

}
