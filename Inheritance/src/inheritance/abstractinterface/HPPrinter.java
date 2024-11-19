package inheritance.abstractinterface;

public class HPPrinter extends Device implements Connectable {
	//클래스 Device -- 추상 메소드 구현
	public void print() {
		System.out.println("HP 프린터입니다.");
		
	}
	
	//인터페이스 Connectable -- 추상 메소드 구현
	public void connect() {
		System.out.println(name + ", HP 프린터를 연결합니다.");
	}

}
