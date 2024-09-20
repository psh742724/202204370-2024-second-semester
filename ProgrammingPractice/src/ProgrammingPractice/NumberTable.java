package ProgrammingPractice;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner og = new Scanner(System.in);
		
		int n = og.nextInt();
		
		System.out.println("8진수\t10진수\t16진수");
		
		for (int i = 1; i <= n; i++) {
			System.out.format("%1$o\t%1$d\t%1$h%n", i);
		}

	}

}
