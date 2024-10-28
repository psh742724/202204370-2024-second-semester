package EndofCh05;

public class Cylinder {
	Circle c;
	double height; // 높이
	
	//생성자
	Cylinder (double radius,double hight){
		c = new Circle(radius);
		this.height = hight;
	}
	
	public double getVolume() {
		return c.getArea() * height;
	}
	
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(2.8,5.6);
		System.out.println("부피 : " + cylinder.getVolume());
	}
}
