package somvecsi;

import java.util.Scanner;

public class Help {
	
	Scanner sc = new Scanner(System.in);
	
	public int zistiCiJeCisloKladne (int cislo) {
		if (cislo <= 0) {
			System.out.println("cislo: " + cislo + " je menise ako 0 zadaj nove cislo");
			cislo = ziskajCislo();
		} else {
			System.out.println("cislo: " + cislo + " je vacsie ako 0");
		}
		return cislo;
	}
	
	public int ziskajCislo () {
		System.out.println("Zadaj cislo: ");
		int cisloZKlavesnice =sc.nextInt();
		return zistiCiJeCisloKladne(cisloZKlavesnice);
	}
}
