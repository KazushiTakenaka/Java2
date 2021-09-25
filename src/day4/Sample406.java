package day4;

public class Sample406 {

	public static void main(String[] args) {
		int count = 0;
		while(true) {
			int dice = (int)(Math.random()*100);
			System.out.print(dice + " ");
			count++;
			if (dice >= 90) {
				System.out.println();
				System.out.println("システム終了");
				System.out.println(count + "回ループ処理しました");
				break;
			}
		}
	}

}
