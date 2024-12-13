package synchronize;

import java.util.Random;

class BankAccount {
	int balance = 0;


	//메소드 전체의 동기화 처리
	public synchronized void withdraw(int money) {
	if (money > 0 && balance >= money) {
		balance -= money;
		System.out.printf("%d 인출하여 현재잔고 %d입니다. %n", money, balance);	
		}
	else if (balance < money) {
		System.out.println("잔고가 부족하여 인출할 수 없습니디.");
		}
	}
	
	public void deposit(int money) {
		synchronized (this) {
			if (money > 0) {
				balance += money;
				System.out.printf("%d 입금하여 현재잔고 %d입니다. %n", money, balance);
			}
		}
	}
	
}	
	

public class SyncTest implements Runnable {
	BankAccount act = new BankAccount();
	
	
	public void run() {
		//while (true) {
		for (int i = 0; i < 3; i++) {
			int amount = new Random().nextInt(10000);
			amount = amount % 10 * 1000;
			System.out.printf("[%s] 금액 = %d %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);
			act.withdraw(amount * 2);
			
			if (act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " => 오류 종료");
				return;
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Runnable r = new SyncTest();
		new Thread(r).start();
		new Thread(r).start();

	}

}
