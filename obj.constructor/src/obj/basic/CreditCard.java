package obj.basic;

public class CreditCard {
	private long number; //카드번호 16자리
	public String owner; //소유자
	private int point; //포인트
	private int balance; //지금까지 사용액
	
	
	//카드 사용 메소드
	public void use(int amount) {
		balance += amount;
		System.out.println("현재 카드 사용액: " + balance);
	}
	
	//카드 비용 지불 메소드
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액: " + amount + ", 지불 잔액: " + balance);
		addPoint(amount);
	}
	
	//카드 포인트 추가 메소드
	private void addPoint(int amount) {
		point += amount / 1000;
		System.out.println("보너스 포인트: " + point);
	}
	
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_7654_9765_5647L;
		myCard.owner = "이수강";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);

	}

}
