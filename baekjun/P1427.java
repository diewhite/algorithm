package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		P1427 obj = new P1427();		
		String input;
		String[] strarr;
		int[] numarr;
		try {
			input = br.readLine();
			numarr = new int[input.length()];
			strarr = input.split("");
			int size = numarr.length;
			for(int i=0; i<size; i++) {
				numarr[i] = Integer.parseInt(strarr[i]);
			}
			int[] result = obj.sort(numarr);
			for(int data : result) {
				System.out.print(data);
			}
			}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
	}
	public int[] sort(int[] arr) {
		int[] result = arr;
		int size = arr.length;
		for(int i = size-1; i>-1; i--) {
			int minIndex = i;
			for(int j=i-1; j>-1; j--) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			int temp = result[i];
			result[i] = result[minIndex];
			result[minIndex] = temp;
		}
		return result;
	}
}
