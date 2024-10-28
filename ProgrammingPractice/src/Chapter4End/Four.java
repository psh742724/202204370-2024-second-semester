package Chapter4End;

public class Four {

	public static void main(String[] args) {
		double y;
		for (double x = 5 ; x <= 10 ; x += 0.5) {
			
			y = (4 * x * x * x) + (5 * x * x) + x + 2; // y = 4x^3 + 5x^2 + x + 2 
			System.out.println("x= " + x + ", y= " + y);

		}
	}
}
