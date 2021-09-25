package day6;

public class Sample602 {

	public static void main(String[] args) {
		SampleClass01 silvia13,silvia14,silvia15;
		silvia13 = new SampleClass01();
		silvia14 = new SampleClass01();
		silvia15 = new SampleClass01();
		silvia13.n = 100;
		silvia14.n = 200;
		silvia15.n = 300;
		silvia13.s = "ABC";
		silvia14.s = "あいう";
		silvia15.s = "123";
		System.out.println(silvia13.add("DEF"));
		System.out.println(silvia14.add("えお"));
		System.out.println(silvia15.add("456"));
		silvia13.showNum();
		silvia14.showNum();
		silvia15.showNum();
	}

}
