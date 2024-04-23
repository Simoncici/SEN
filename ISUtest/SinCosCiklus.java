package ISUtest;

public class SinCosCiklus {

	public static void main(String[] args) {
		for (int angle = 0; angle <= 360; angle++) {
			double radius = Math.toRadians(angle);
			double sinV = Math.sin(radius);
			double cosV = Math.cos(radius);
				
			System.out.println("angle" + angle + "degress");
			System.out.println("Sin" + sinV);
			System.out.println("Cos" + cosV);
		} 
	}
}
