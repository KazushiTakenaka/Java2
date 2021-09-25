package day4;

public class Sample402 {

	public static void main(String[] args) {
		for(int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				int c = a * b;
				System.out.print(a + "×" + b + "=" + c + " ");
				if(c <= 9) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
