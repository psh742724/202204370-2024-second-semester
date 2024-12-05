
public class PropagateCheckedException {
	// 메소드 선언에서 다시 예외 ClassNotFoundException의 발생 전달
	public static void main(String[] args) throws ClassNotFoundException{
		//메소드 Class.forName()을 사용 시 반드시 예외처리를 해야 함
		System.out.println(Class.forName("java.lang.Object")); //철자 오류 = 예외 발생

	}

}
