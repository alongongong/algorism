package level04;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while(a!=0 || b!=0) {
			System.out.println(a+b);
			
			a = scan.nextInt();
			b = scan.nextInt();
		}
	}

}
