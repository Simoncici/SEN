package main;

public class Main {

	public static void main(String[] args) {
		/*
		 * int sucet = 0; int cislo = 1000000; for(int i=0; i<cislo; i++) {
		 * System.out.println(i); sucet = sucet+i; }
		 * System.out.println("Ciselny sucet je:"+sucet);
		 */

		int a = 0;
		int b = 30;
		boolean logickaPremena = true;
		int pocet = 0;
		/*
		 * while(a<b) { b--; System.out.println("Cislo a je mensie ako cislo b"); }
		 */

		while (logickaPremena) {
			System.out.println("Program bezi:ㅤ" + pocet++);
			if (a == b) {
				logickaPremena = false;
				System.out.println("Logicka premena sa nastavila na False");
			}
			a++;
		}

	}
}
