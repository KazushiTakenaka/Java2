package day5;

public class Sample502 {

	public static void main(String[] args) {
		//int n[] = {1,2,3,4,5,6,7,8,9,10};
		String lastName[] = {"うずまき","うちは","奈良"};
		String uz[] = {"ナルト","ヒナタ","ボルト","ひまわり"};
		String uc[] = {"サスケ","サクラ","サラダ",};
		String nr[] = {"シカマル","テマリ","シカダイ"};
		for(int i = 0; i < lastName.length; i++) {
			if(lastName[i] == lastName[0]) {
				for(int j = 0; j < uz.length; j++) {
					System.out.println(lastName[i] + " " + uz[j]);
				}
			}
			if(lastName[i] == lastName[1]) {
				for(int k = 0; k < uc.length; k++) {
					System.out.println(lastName[i] + " " + uc[k]);
				}
			}
			if(lastName[i] == lastName[2]) {
				for(int l = 0; l < nr.length; l++) {
					System.out.println(lastName[i] + " " + nr[l]);
				}
			}
		}
	}

}
