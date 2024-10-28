package Chapter4End;

public class Eight {

	public static void main(String[] args) {
		int arr[][] = {{78, 48, 78, 98}, {99, 92}, {29, 64, 83}, {34,78,92,56}};
		int sum = 0;
		
		for(int tmp[] : arr) {
			for(int i : tmp) {
				System.out.print(i + " ");
				sum += i;
			
			}
			System.out.println("\t 합 : " + sum + ", 평균 : " + (double) sum / tmp.length);
			sum = 0;
		}

	}

}
