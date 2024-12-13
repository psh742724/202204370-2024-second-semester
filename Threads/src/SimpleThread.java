class MyThread extends Thread {
	//스레드 기능 구현을 위한 메소드 재정의
	
	public void run() { //user thread
		//기능 구현
		for (int i = 1; i < 10; i++) {
			System.out.println(getName() + ": " + i);
		}
	}
}


public class SimpleThread { // user thread
	public static void main(String[] args) { // main thread
		MyThread th = new MyThread(); //스레드 생성
		th.start(); //스레드 시작 메소드 호출

	}

}
