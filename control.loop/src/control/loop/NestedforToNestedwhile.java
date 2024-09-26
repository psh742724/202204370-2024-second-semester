package control.loop;

public class NestedforToNestedwhile {

	public static void main(String[] args) {
		int i = 1, j = 1;
		
		while (i <= 5 ) {
			while (j <= 9) {
			System.out.printf("%d * %d = %2d   ", i++, j++, (i - 1) *(j - 1));
			}
		System.out.println();
		}
		


	}

}
