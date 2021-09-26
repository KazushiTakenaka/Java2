package original;

public class silvia {
	String s;//型番s
	String engin = "SR";//エンジン型
	int dis;//排気量
	int maxs;//最高速
	String se(String engin) {
		return this.s + engin;
	} 
	void showSpec1(){
		System.out.println(s +"の排気量は" + this.dis + "です");
		System.out.println("最高速は" + this.maxs + "kmです");
	}
	void showSpec2(){
		System.out.println("型番" + this.engin + "エンジン");
	}
}
