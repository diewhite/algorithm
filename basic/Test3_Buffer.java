package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test3_Buffer {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String data = br.readLine();
			if(data==null) {
				break;
			}
			String [] strarr = data.split(" ");
			System.out.println(Integer.parseInt(strarr[0])+Integer.parseInt(strarr[1]));
			br.close();
		}
	}
}
