package ISUtest;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Je pismenko veľké???");

		char cH = sc.next().charAt(0);
		
		if (cH >= 'A' && cH <= 'Z') {
			System.out.println("Pismeno je veľké!");
			
		}
		else {
			System.out.println("Pismeno je male!");
		}
	}

}
