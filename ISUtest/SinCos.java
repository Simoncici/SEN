package ISUtest;

import java.util.Iterator;
import java.util.Scanner;

public class SinCos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj stupeň");
        double dg = sc.nextDouble(); 
        double rd = Math.toRadians(dg); 
 
        double sinValue = Math.sin(rd); 
        double cosValue = Math.cos(rd); 
  
        System.out.println("cos(" + dg + ") = " + cosValue);
        System.out.println("sin(" + dg + ") = " + sinValue); 
	}
}
