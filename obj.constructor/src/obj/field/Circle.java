package obj.field;

public class Circle {
	public double radius;
	public static final double PI = 3.141592;
	
	//생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//반지름 - 면적 구하기 메소드
	public double getArea() {
		return radius * radius * PI;
	}
	
	//반지름 - 둘레 구하기 메소드
	public double getCircumference() {
		return 2 * radius * PI;
	}
	
	//출력
	public void print() {
		System.out.printf("반지름이 %.2f인 원의 면적은 %.2f이고,", radius, getArea());
		System.out.printf(" 둘레 길이는 %.2f이다. %n", getCircumference());
	}
	
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2.78);
		c1.print();
		
		Circle c2 = new Circle(5.25);
		c2.print();

	}

}
