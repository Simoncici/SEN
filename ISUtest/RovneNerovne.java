package ISUtest;

import java.util.Scanner;

public class RovneNerovne {

	public static void main(String[] args) {
		VypocetDvochAB();
	}

	private static void VypocetDvochAB () {
	Scanner sc = new Scanner(System.in);
	System.out.println("Zadaj dve cisla A & B");
		int a = sc.nextInt();
		int b = sc.nextInt();
			if (a > b) {
					System.out.println("A je väčšie");
			}
			else if (a == b) {
					System.out.println("A je rovne B");
			} 
			else if (a < b) {
					System.out.println("B je väčšie");
			}
	}
}