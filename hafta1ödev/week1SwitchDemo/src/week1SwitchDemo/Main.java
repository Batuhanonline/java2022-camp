package week1SwitchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'C';
		
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel : Geçti");
				break;
			case 'B':	
				System.out.println("Güzel : Geçti");
				break;
			case 'C':	
				System.out.println("İyi : Geçti");
				break;
			case 'D':	
				System.out.println("Fena Değil : Geçti");
				break;
			case 'F':	
				System.out.println("Maalesef Kaldınız");
				break;
			default:
				System.out.println("Geçersiz Not Girdiniz");
		}
		

	}

}
