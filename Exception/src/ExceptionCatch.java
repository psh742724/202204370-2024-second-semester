
public class ExceptionCatch {

	public static void main(String[] args) {
		int data = 0;
		
		//catch 여러 개 구성
		try {
			data = Integer.parseInt("1123.45");
		} catch (ClassCastException e) {
			System.out.println("예외 발생 1 : " + e);
			System.out.println("e.getMessage(): " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("예외 발생 2 : " + e);
			//예외이서 주로 이용하는 메소드 -- getMessage(), printStackTrace()
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
			
		}
		
		System.out.printf("data = %d %n", data);

	}

}
