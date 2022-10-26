package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1000 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String[] strArr;
		int size;
		try {
			input = br.readLine();
			strArr = input.split(" ");
			size = strArr.length;
			int sum = 0;
			for(int i=0; i<size; i++) {
				sum += Integer.parseInt(strArr[i]);
			}
			System.out.println(sum);
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
	}

}
