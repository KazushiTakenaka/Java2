package original;

public class model {

	public static void main(String[] args) {
		silvia s13,s14,s15;
		s13 = new silvia();
		s14 = new silvia();
		s15 = new silvia();
		s13.s = "S13";
		//s13.engin = "SR";
		s13.dis = 1800;
		s13.maxs = 100;
		s13.showSpec1();
		s13.showSpec2();
		s14.s = "S14";
		//s14.engin = "Sr";
		s14.dis = 1900;
		s14.maxs = 200;
		s14.showSpec1();
		s14.showSpec2();
		s15.s = "S15";
		//s15.engin = "sr";
		s15.dis = 2000;
		s15.maxs = 300;
		s15.showSpec1();
		s15.showSpec2();
	}

}
