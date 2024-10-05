package control.ifcondition;

import java.util.Scanner;

public class GradeIfelse {

	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		System.out.print("성적 입력: ");
		int point = score.nextInt();
		char grade;
		
		if (90 <= point) {
			grade = 'A';
		}
		else if (80 <= point) {
			grade = 'B';
		}

		else if (70 <= point) {
			grade = 'C';
		}

		else if (60 <= point) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("학점: " + grade);
		
		score.close();

	}

}
