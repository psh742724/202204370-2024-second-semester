package Chapter4End;

public class Seven {

	public static void main(String[] args) {
		int n = 1; // 정수 -- 초기화
		int sum = 0; // 정수의 합 -- 초기화
		
		while (true) {
			sum += n; // 정수의 합 계산
			
			if(sum > 5000) {
				sum -= n;
				n -= 1;
				break;
			}
			
			else {
				n++;
			}
		}
		System.out.println("n : " + n + ", sum : " + sum);

	}

}
