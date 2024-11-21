import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("pascal");    list.addLast(1);
		list.add("java");      list.addLast(3.4);
		list.addFirst("algol");    list.addFirst(0.87);
		list.add(3, null);     list.addLast(5.8);
		
		Iterator it = list.iterator();
		print(it);
		print(list.descendingIterator());
		
		//배열로 반환 -- 모든 원소 출력
		for (Object e : list.toArray()) {
			System.out.print(e + " ");
			
		}
		System.out.println();

	}
	
	public static void print (Iterator it) {
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
			
		}
		System.out.println();
		
	}

}
