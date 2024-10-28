package obj.basic;

public class Const {

	public static void main(String[] args) {
		final int maxSize = 5; // (int maxSize = 5;) -- 필수
		
		// maxsSize = 8 -- 오류 발생(더 이상 수정 불가)
		
		int data[] = new int[maxSize];
		
		System.out.println("배열 크기: " + data.length);
		System.out.println("배열 크기: " + maxSize);
	}

}
