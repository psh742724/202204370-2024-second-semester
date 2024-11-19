package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable {
	//클래스 Device -- 추상 메소드 구현
	public void print() {
		System.out.println("삼성 USB 메모리입니다.");
		
	}
	
	//인터페이스 Connectable -- 추상 메소드 구현
	public void connect() {
		System.out.println(name + ", USB 메모리를 연결합니다.");
	}

}
