package palindrom;

import java.util.Scanner;

public class Help {
	
	Scanner sc = new Scanner(System.in);
	String otocenyText = "";
	

	public void zistiPalindrom () {
		String slovoZKlavesnice = ziskajPalindrom();
		String otoceneSlovo = otocSlovo(slovoZKlavesnice);
		
		//porovnaj povodne s otocenym slovom
		
		if (slovoZKlavesnice.equals(otoceneSlovo)) {
			System.out.println("Dane slovo: " + slovoZKlavesnice + " " + otocenyText);
			System.out.println("Slovo: " + slovoZKlavesnice + " je palindrom");
		} else {
			System.out.println("Dane slovo: " + slovoZKlavesnice + " " + otocenyText);
			System.out.println("Slovo: " + slovoZKlavesnice + " nie je palindrom");
		}
	}
	
	private String ziskajPalindrom () {
		System.out.println("Zadaj slovo");
		return sc.nextLine().toLowerCase();
	}
	
	private String otocSlovo (String slovo) {
		for (int i = slovo.length()-1; i >= 0; i--) {
			otocenyText = otocenyText + slovo.charAt(i);
		}
		return otocenyText;
	}

}
