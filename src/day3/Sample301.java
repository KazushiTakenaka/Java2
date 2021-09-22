package day3;

public class Sample301 {

	public static void main(String[] args) {
		int a = -1;
		System.out.println("a=" + a);
		if(a >= 10) {
			System.out.println("aは10以上の数です");
		}
		else if(a >= 0 ) {
			System.out.println("aは0~10です");
		}
		else {
			System.out.println("aは負の数です");
		}
	}

}
