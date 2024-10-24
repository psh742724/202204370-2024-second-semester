package obj.basic;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard yourCard = new CreditCard();
		
		/* 변수 선언과 객체 생성 대입 분리 가능
		CreditCard yourCard;
		yourCard = new CreditCard();
		*/
		
		yourCard.owner = new String("이민정");
		System.out.println(", 카드소유자: " + yourCard.owner);
		
		/*
		yourCard.number = 6953_8723_8643_9836L;
		System.out.print("카드번호: " + yourCard.owner);
		 */
		
		
		yourCard.use(150000);
		yourCard.use(100000);
		yourCard.payBill(100000);
	}

}
