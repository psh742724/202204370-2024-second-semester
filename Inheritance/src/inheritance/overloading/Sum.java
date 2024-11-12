package inheritance.overloading;

public class Sum {
	public int add(int a, int b) { // add_int_int()
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int add(int a[], int n) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Sum adder = new Sum();
		
		System.out.println(adder.add(3, 6)); // add_int_int(3,6)
		System.out.println(adder.add(3, 6, 9));
		System.out.println(adder.add(new int[] {3, 6, 9, 12}, 4));
	}

}
