package day5;

public class Sample501 {

	public static void main(String[] args) {
		
		double [] d = new double[4];
		d[0] = 1.2;
		d[1] = 1.3;
		d[2] = 1.4;
		d[3] = 1.5;
		double sum = 0.0;
		for (int i = 0; i <= d.length; i++) {
			System.out.print(d[i] + " ");
			sum += d[i];
		}
		System.out.println();
		System.out.print(sum);
	}

}
