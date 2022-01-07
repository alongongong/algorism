package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main04 {

	public static void main(String[] args) throws IOException {
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for(int i=0; i<n; i++) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			
//			System.out.println(a+b);
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i<n; i++) {
			String k = br.readLine();
			bw.write(Integer.parseInt(k.split(" ")[0])+Integer.parseInt(k.split(" ")[1])+"\n");
		}
		bw.flush();
		bw.close();
	}

}
