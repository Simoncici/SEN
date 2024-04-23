package ISUtest;

import java.util.Scanner;
import java.lang.Math;

public class ISU_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();		
		
		int c = sc.nextInt();
		
		double D = (b*b) - (4 * a * c);
		
		double x1, x2;
		
		if (D < 0) {
			System.out.println("Nema korene" + "Diskriminant je zaporny");
		}
		else if  (D > 0){
				System.out.println("Diskriminant je kladny");
				//x1 = b/(2*a)-Math.sqrt(D)/(2*a);
				//x2 = b/(2*a)+Math.sqrt(D)/(2*a);
				
				x1 = (-b + Math.sqrt(D)) / 2*a;
				x2 = (-b - Math.sqrt(D)) / 2*a;
				
				System.out.println("Riesenie ma dva rozne / Prvy " + x1);
				System.out.println("Druhy je " + x2);
			}
		else if (D == 0) {
			System.out.println("Diskriminant je rovny 0");
			x1 = b/(2*a);
			System.out.println("Ma jeden dvojnasobny koren " + x1);
		}
		System.out.println(D);
	}
	
	

}
