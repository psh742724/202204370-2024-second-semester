package inheritance.control;

import inheritance.access.Account;
import inheritance.access.SavingAccount;

public class CheckAccount extends Account {
	long minimum; // 최소 잔액 금액
	
	public CheckAccount(String name, int number, long minimum) {
		super(name, number);
		this.minimum = minimum;
		super.deposit(minimum); // 또 다른 방법 -- deposit(minimum);
		
	}
	
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name); // 접근 가능
		/* (접근 불가)
		 System.out.println(myAccount.open);
		 System.out.println(myAccount.number);
		 System.out.println(myAccount.balance);
		 */
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 500000);
		cAccount.deposit(250000);
		cAccount.withdraw(50000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name); // 접근 가능
		 System.out.println(cAccount.open); // 접근 가능
		 /* (접근 불가)
		 System.out.println(cAccount.number);
		 System.out.println(myAccount.balance);
		 */

	}

}
