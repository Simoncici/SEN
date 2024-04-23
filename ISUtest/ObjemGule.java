package ISUtest;

import java.util.Scanner;

public class ObjemGule {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Zadaj a: ");
	double a = sc.nextDouble();
	System.out.println("Zadaj b: ");
	double b = sc.nextDouble();
	System.out.println("Zadaj c: ");
	double c = sc.nextDouble();
	
	double obsah = funobsahu(a,b,c);
	double objem = funobjemu(a,b,c);
	System.out.println("Obsah kvadra je: " + obsah);
	System.out.println("Objem kvadra je: " + objem);
	}
	public static double funobsahu(double a, double b, double c) {
		return 2*(a*b+a*c+b*c);
	}
	public static double funobjemu(double a, double b, double c) {
	    return a*b*c;
	}
}
