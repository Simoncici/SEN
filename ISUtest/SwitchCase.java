package ISUtest;

import java.util.Scanner;

public class SwitchCase {
	
	static Functions fln = new Functions();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
		case 1: {
			fln.Rano();
			break;
		}
		case 2: {
			fln.Obed();
			break;
		}
		case 3: {
			fln.Vecer();
			break;
		}
		default:
			System.out.println("Neni taka moznost");;
		}
		sc.close();
	}

}
