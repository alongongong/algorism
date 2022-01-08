package level03;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String star = "*";
		for(int i=1; i<=n; i++) {
			System.out.println(String.format(("%"+n+"s"), star));
			star += "*";
		}
	}

}
