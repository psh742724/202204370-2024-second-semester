package enumeration;

public class EnumTest {
	public enum p1 {c, cpp, java, csharp};
	
	public static void main(String[] args) {
		p1 clang = p1.c; // 정의한 열거 유형: 하나의 자료 유형으로 이용
		System.out.println(clang); // 저장된 상수 문자열 출력
		
		clang = p1.csharp;
		switch(clang) {
			case csharp:
				System.out.println(clang + ": C# 언어 ");
				
		}
		
		for (p1 p : p1.values()) {
			System.out.print(p + " ");
			
		}
		System.out.println();

	}

}
