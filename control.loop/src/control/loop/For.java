package control.loop;

public class For {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int sum = 0;
		for (i = 1, sum = 0; i <= 10; sum += i, i++); // 나쁜 예시
		
		System.out.printf("합: %d%n", sum);
		

		for (int j = 1, total = 0; j <= 5; j++) {  // 좋은 예시
			total += j;
			System.out.printf("1에서 %d까지 합은 %d입니다.%n", j, total);
		}
		
	}

}
