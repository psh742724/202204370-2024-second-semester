package Chapter4End;

public class Six {

	public static void main(String[] args) {
		for(int c = -60 ; c < 140 ; c += 20) {
			System.out.println("섭씨온도(C) : " + c + ", 화씨온도(F) : " + (int) ((9.0 / 5.0) * c + 32));
		}

	}

}
