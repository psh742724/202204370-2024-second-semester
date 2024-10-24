package obj.defaultconstructor;

public class Student {
	public String name;
	
	//기본 생성자 구현
	public Student() {
		
	}
	
	//이름 지정 생성자 구현
	public Student(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("학생이름: " + this.name);
	}

	public static void main(String[] args) {
		

	}

}
