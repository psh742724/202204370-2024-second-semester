
public class ObjectMath {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
				
		//Math m = new Math(); -- 오류 발생
		System.out.println(Math.PI);
		System.out.println(Math.round(-3.5));
		System.out.println(Math.abs(-3.4));
		System.out.println(Math.pow(3, 4));


	}

}
