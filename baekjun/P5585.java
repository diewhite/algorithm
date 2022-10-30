package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5585 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		P5585 obj = new P5585();		
		int input;
		int[] coin = {500,100,50,10,5,1};
		try {
			input = Integer.parseInt(br.readLine());
			System.out.println(obj.coinQty(coin, input));
			}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
			}finally {
				 try {
					if(br!=null) {
						br.close();
					}	
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
	}
	public int coinQty(int[] arr, int input){
		int result = 0;
		int remain = 1000-input;
		for(int i=0; i<arr.length; i++) {
			result = result + (remain/arr[i]);
			remain = remain%arr[i];
		}
		
		return result;
	}
}
