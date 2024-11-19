package inheritance.overloading;

public class MyMath {
	double x, y;
	
	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double multiply() {
		return x * y;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
		/*
		return x * y; // 에러 발생
		return this.x * this.y; // 에러 발생
		*/
	}
	
	public static void main(String[] args) {
		MyMath math = new MyMath(3.4, 6.7);
		System.out.println(math.multiply());
		System.out.println(MyMath.multiply(3.4, 6.7));
		

	}

}
