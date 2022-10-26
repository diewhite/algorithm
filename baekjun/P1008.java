package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1008 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String[] strArr;
		int size;
		try {
			input = br.readLine();
			strArr = input.split(" ");
			size = strArr.length;
			double result = 0;
			result = (double)Integer.parseInt(strArr[0])/Integer.parseInt(strArr[1]);
			System.out.println(result);
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
	}

}
