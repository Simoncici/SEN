package main;

import java.util.Scanner;

public class MainObject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * // cele cislo System.out.println("Zadaj cislo:ㅤ"); int cislo =
		 * scan.nextInt(); System.out.println("Zadal si cislo:ㅤ" + cislo);
		 * 
		 * // desatine cislo System.out.println("Zadaj desatine cislo:ㅤ"); double
		 * desatinCislo = scan.nextDouble();
		 * System.out.println("Zadal si desatine cislo:ㅤ" + desatinCislo);
		 * 
		 * // text System.out.println(""); float = scan.nextFloat();
		 * System.out.println("");
		 * 
		 * // textove premeny System.out.println("Zadaj text:ㅤ"); String text =
		 * scan.nextLine(); System.out.println("Zadany text:ㅤ" + text);
		 */

		// Zadaj 5cisel /priemer
		int sucetCisel = 0;
		int pocetOpakovania = 0;
		System.out.println("Zadaj pocet opakovani:ㅤ");
		pocetOpakovania = scan.nextInt();
		if ((pocetOpakovania == 0) || (pocetOpakovania == 1)) {
			pocetOpakovania = 2;
		}

		for (int i = 0; i < pocetOpakovania; i++) {
			System.out.println("Zadaj cislo:ㅤ");
			sucetCisel = sucetCisel + scan.nextInt();
		}
		System.out.println("Sucet cisel:ㅤ" + sucetCisel / pocetOpakovania);
	}

}
