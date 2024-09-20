package ProgrammingPractice;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double kg = in.nextDouble();
		int cm = in.nextInt();
		
		System.out.printf("Weight: %fkg, Height: %dcm", kg, cm);

	}

}

//표준입력 = Scanner 활용