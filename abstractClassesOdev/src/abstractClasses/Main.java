package abstractClasses;

public class Main {

	public static void main(String[] args) {
	
		ManGameCalculator manGameCalculator =new ManGameCalculator();
		manGameCalculator.hesapla();
		
		WomanGameCalculator womanGameCalculator =new WomanGameCalculator();
		womanGameCalculator.gameOver();

	}

}
