package day3;

public class Sample304 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*100);
		//score = 30;
		System.out.println("テストの点数は" + score + "点です");
		if(score >= 41 && 100 >= score) {
			if(score >= 81 && 100 >= score) {
				System.out.print("特待生として");
			}
			System.out.println("合格です");
		}
		else {
			System.out.print("不合格です");
		}
	}
	

}
