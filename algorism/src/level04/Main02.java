package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main02 {

	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
//		
//		while(scan.hasNext()) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			
//			System.out.println(a + b);
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input="";
		
		while((input = br.readLine()) != null) {
			bw.write(Integer.parseInt(input.split(" ")[0]) 
					+ Integer.parseInt(input.split(" ")[1])+"\n");
		}
		bw.flush();
		bw.close();
	}

}
