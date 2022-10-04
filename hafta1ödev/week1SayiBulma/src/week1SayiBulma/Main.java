package week1SayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMı = false;
		
		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMı = true;
				break;
			}
		}
		
		if(varMı) {
			System.out.println("Sayı var");
		} else {
			System.out.println("Sayı yok");
		}

	}

}
