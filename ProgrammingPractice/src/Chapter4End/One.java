package Chapter4End;

public class One {

	public static void main(String[] args) {
		int count = 0; // 숫자 세기
		int k = 0; // 띄어쓰기 제어
		// 띄어쓰기 제어 변수가 없으면 10의 배수 개의 출력 수부터 다음 출력 수가 나올때까지 계속 \n된다. 
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.print(i + " ");
				count++;
				k = 1;
			}
			if(count % 10 == 0 && k == 1) {
				System.out.println();
				k = 0;
			}
		}

	}

}
