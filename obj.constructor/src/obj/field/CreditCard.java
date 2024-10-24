package obj.field;

public class CreditCard {
	private long number; // 카드번호 - 16자리
	public String owner; // 소유자

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "유 재석";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);

	}

}
