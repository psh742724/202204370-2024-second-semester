package operator;

public class DivideByZero {

	public static void main(String[] args) {
		short data1 = 32766;
		short data2 = 1;
		
		// short data3 = data1 + data2; ==> 오류 발생: 선언한 변수와 같은 자료형으로 (자료형)을 계산식 앞에 표기할 것
		
		short data3 = (short) (data1 + data2);
		short data4 = 32766 + 1;
		System.out.println(data3 + " " + data4);
		
		System.out.println(0.0 / 0.0);
		System.out.println(3 / 0.0);
		System.out.println(3 / 0); // 에러(=예외) 발생 : java.lang.ArithmeticException

	}

}
