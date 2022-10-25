package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = Integer.parseInt(str);
		for (int i=1;i<=count;i++) {
			String line = br.readLine();
			String[] resultarr = line.split(" ");
			System.out.println(Integer.parseInt(resultarr[0])+Integer.parseInt(resultarr[1]));
		}
	}
}
