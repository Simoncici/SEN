package ISUtest;

public class Array {

	public static void main(String[] args) {
		int [] numbers = new int [5];
		int [] cisla = {1, 2, 3, 4, 5};
		
		cisla[0] = 5;
		cisla[1] = 10;
		cisla[2] = 20;
		cisla[3] = 30;
		cisla[4] = 40;
		
		for (int i = 0; i < cisla.length; i++) {
			System.out.println(" " + i + " " + cisla[i]);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" " + i + " " + numbers[i]);
		}
	}

}
