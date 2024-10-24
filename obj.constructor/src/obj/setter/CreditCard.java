package obj.setter;

public class CreditCard {
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	//메소드 - 카드 사용
	public void use(int amount) {
		balance += amount;
	}
	
	//메소드 - 카드 비용 지불
	public void payBill(int amount) {
		balance -= amount;
		addPoint(amount);
	}
	
	//메소드 - 카드 포인트 추가
	
	private void addPoint(int amount) {
		point += amount / 1000;
	}
	
	
	//setter, getter
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {
		//this.number = number;
		if (number < 1000_0000_0000_0000L) {
			System.err.println("잘못된 카드 번호입니다.");	
		}
		
		this.number = number;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
