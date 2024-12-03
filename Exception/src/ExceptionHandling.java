public class ExceptionHandling {
	static int num[];
	
	public static void main(String[] args) {
		String str[] = {"안녕하세요!", "Hello!"};
		
		try {
			System.out.println(str[0]);
			System.out.println(num.length);
			System.out.println(str[2]);
			
		} catch (Exception e) { // -- 다른 방법: IndexOutOfBoundsException e (try문 내에서만 실행 가능)
			System.out.println("예외 발생: " + e);
			
		} finally {
			System.out.println("try 실행");
			
		}
		
		System.out.println("프로그램이 정상적으로 종료됩니다.");

	}

}
