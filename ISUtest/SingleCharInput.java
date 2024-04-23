package ISUtest;

import java.util.Scanner;

public class SingleCharInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj jedno pismeno");
		
		char pis = sc.next() .charAt(0);
		System.out.println("Dal si:" + pis);
	}

}
