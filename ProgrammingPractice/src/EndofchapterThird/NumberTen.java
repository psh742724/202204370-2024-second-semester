package EndofchapterThird;

import java.util.Scanner;

public class NumberTen {

	public static void main(String[] args) {
		Scanner chip = new Scanner(System.in);
		
		System.out.print("금액 입력: ");
		int money = chip.nextInt();
		
		int fifty = money / 50000;
		int ten = (money - (50000 * fifty)) / 10000;
		int five = (money - ((50000 * fifty) + (ten * 10000))) / 5000;
		int one = (money - ((50000 * fifty) + (ten * 10000) + (five * 5000))) / 1000;
		
		if (money % 1000 == 0) {
			System.out.printf("50000원군 %d개, 10000원권 %d개, 5000원권 %d개, 1000원권 %d개", fifty, ten, five, one);
		}
		else {
			System.err.println("최소 1000원 단위로 입력해야 함.");
		}
		
		chip.close();
	}

}
