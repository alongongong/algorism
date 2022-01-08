package level04;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 0;
		int temp = a;
		int c = -1;
		int count = 0;
		
		while(a != c) {
			if(temp >= 10) {
				b = temp%10 + (temp-(temp%10))/10;
				temp = b%10 + temp%10*10;
			} else {
				b = 0 + temp;
				temp =  b + temp%10*10;
			}
			
			c = temp;
			
			count++;
		} // while
		
		System.out.println(count);
	}

}
