package array.basic;

public class Arraycopy {

	public static void main(String[] args) {
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		/*
		for (int i = 0; i < copyFrom.length; i++) { // 코드 #1 - 원본
			System.out.print(copyFrom[i] + " ");
		}
		System.out.println();
		*/
		
		for (int value : copyFrom) {
			System.out.print(value + " "); // 코드 #1 - 축약본
		}
		System.out.println();
		
		for (int i = 0, value; i < copyTo.length; i++) {
			value = copyTo[i];
			System.out.print(value + " "); // 원본
		}
		
		/* 
		for (int value : copyTo) {
			System.out.print(value + " "); // 축약본
		}
		*/
	}

}
