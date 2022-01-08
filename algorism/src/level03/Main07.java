package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			String a = br.readLine();
			
			bw.write("Case #"+i+": "+(Integer.parseInt(a.split(" ")[0])+Integer.parseInt(a.split(" ")[1]))+"\n");
		}
		bw.flush();
		bw.close();
	}

}
