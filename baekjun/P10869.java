package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10869 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		String[] strArr;
		int num1;
		int num2;
		try {
			data = br.readLine();
			strArr = data.split(" ");
			num1 = Integer.parseInt(strArr[0]);
			num2 = Integer.parseInt(strArr[1]);
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
	}
}
