package ISUtest;

import java.util.Scanner;

public class Dva_Random_IF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Napis cislo");
		int a = sc.nextInt();
		if (a >= 0) {
			System.out.println("WOW je kladne");
		}
		else {
			System.out.println("Neni kladne");
		}
	}

}