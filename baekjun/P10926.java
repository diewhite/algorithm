package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10926 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		try {
			data = br.readLine();
			System.out.println(data+"??!");
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
	}
}
