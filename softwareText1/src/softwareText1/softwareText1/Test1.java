package softwareText1;

import java.util.Scanner;

public class Test1{
	public static void main(String[] args){
		while(true) {
			System.out.print("ÇëÊäÈëÇ®Êı£º");
			Scanner scanner = new Scanner(System.in);
			int count = scanner.nextInt();
			System.out.println(money(count));
		}
	}
	public static String money(int number){
		int []pocket = {50,20,5,5,1,1,1};
		for (int i =0;i<7;i++) {
			if (number>=pocket[i]) {
				number-=pocket[i];
			}
		}
		if (number == 0) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
}