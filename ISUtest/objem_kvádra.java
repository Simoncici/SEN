package ISUtest;

import java.util.Scanner;

public class objem_kvádra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Zadaj 3 cislice na objem kvadra");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println("Objem kvadra je " + (a * b * c));
		System.out.println("Povrch kvadra je " + (2*(a*b + a*c + b*c)));

	}

}
