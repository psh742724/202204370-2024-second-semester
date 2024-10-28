package EndofCh05;

public class Student_1 {
	String department;
	int class_num;
	
	Student_1 (String d, int c){
		department = d;
		class_num = c;
	}
	
	public void print() {
		System.out.println("학과 : " + department);
		System.out.println("학번 : " + class_num);
	}
	
	public static void main(String[] args) {
			Student_1 s = new Student_1("정보통신공학과",20150000);
		s.print();
	}

}
