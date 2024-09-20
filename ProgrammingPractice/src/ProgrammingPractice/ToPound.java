package ProgrammingPractice;

import java.util.Scanner;

public class ToPound {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kg = in.nextInt();
		double lb = kg * 2.2;
		
		System.out.printf("%flb", lb);

	}

}
