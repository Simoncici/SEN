package ISUtest;

import java.util.Scanner;

public class HadaniePismena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Napíš písmeno ktore si myslím");
		
		char cH = sc.next().charAt(0);
		
		if (cH=='a') {
			System.out.println("Uhadol si");
		}
		else {
			System.out.println("Neuhadol si, skús znova");
		}
	}

}
