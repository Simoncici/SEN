package ISUtest;

import java.util.Scanner;

public class Objem_Obsah_Gule {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		double r = sc.nextDouble();
		
		System.out.println("obsah je " + obsah(r));
		System.out.println("obvod je " + obvod(r));
		
	}
	
	private static double obsah (double r) {
		return 4 * Math.PI *r*r ;
	}
	
	private static double obvod (double r) {
		return (4/3) * (Math.PI * r * r * r);
	}

}
