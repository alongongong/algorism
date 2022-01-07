package level03;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a = 0;
		for(int i=0; i<n; i++) {
			a += i+1;
		}
		System.out.println(a);
	}
}
