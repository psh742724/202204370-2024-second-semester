package array.basic;

public class UsingArray {

	public static void main(String[] args) {
		String name[] = {"C++", "Java", "C#"};
		
		/*
		for (String str : name) { // 방법 1). for each 문
			System.out.print(str + " ");
		}
		System.out.println();
		*/
		
		for (int i = 0; i < name.length; i++) { // 방법 2). for 문
			String str = name[i];
			System.out.print(str + ", ");
		}
		
		String data[][] = {{"홍", "길동"}, {"최", "경", "주"}, {"Tiger", "Woods"}};
		
		for (String ary[] : data) {
			for (String value : ary) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
