
public class CheckedExceptiom {

	public static void main(String[] args) {
		//메소드 Class.forName()을 사용 시 반드시 예외처리를 해야 함
		System.out.println(Class.forName("java.lang.Object"));
	}

}
