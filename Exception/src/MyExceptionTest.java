

//class 새 예외이름 extends Exception {
class MyException extends Exception {
	//생성자: msg = 예외의 메시지 이름
	public MyException(String msg) {
		super(msg);
	}
	
}

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			doException(true);
			
		} catch (MyException e) {
			System.out.println("e: " + e);
			System.out.println("e.getMessage(): " + e.getMessage());
		}
		
		/*다른 방법
		 public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName(doException(true)));
		 */

	}
	
	
	//메소드 doException()은 새로 만든 MyException을 발생
	public static void doException(boolean bool) throws MyException {
		if (bool) {
			//실제 예외 발생 부분 -- throw 사용
			throw new MyException("내가 만든 예외");
		}
	}
}
