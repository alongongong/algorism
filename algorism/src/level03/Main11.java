package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(a.nextToken());
		int x = Integer.parseInt(a.nextToken());
		
		StringTokenizer b = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			int y = Integer.parseInt(b.nextToken()); 
			if(y < x) {
				bw.write(y+" ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
