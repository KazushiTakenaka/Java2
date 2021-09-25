package day5;

public class Sample503 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];
		int m,n;
		int sum = 0;
		for(m = 1; m < a.length; m++) {
			for(n = 1; n < a[m].length; n++) {
				int nm = m*n;
				sum += nm;
				System.out.print(m + "×" + n + "=" + nm + " ");
				if (nm < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("九九の合計値は" + sum + "です");
	}

}
