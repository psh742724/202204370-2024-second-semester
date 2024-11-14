package inheritance.abstractinterface;

public abstract class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void drawCenter() { // 클래스(일반)
		System.out.println("(x, y) = " + x + ", " + y);
	}
	
	public abstract void draw(); // 클래스(추상)

	public static void main(String[] args) {
		// Shape s = new Shape(3.1, 4.5); -- 객체화 오류
	}

}
