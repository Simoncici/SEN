package ISUtest;

import java.util.Scanner;

public class LineInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj text");
		String userSt = sc.next();
		System.out.println("Toto je tvoj text: " + userSt);
	}

}
