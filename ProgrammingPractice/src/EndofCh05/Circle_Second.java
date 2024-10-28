package EndofCh05;

public class Circle_Second {
	public double radius; // 원의 반지름
	public static double PI = 3.141592; // 원주율
	
	//생성자 구현
	public Circle_Second(double radius) {
		this.radius = radius;
	}
	
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;
	}

}
