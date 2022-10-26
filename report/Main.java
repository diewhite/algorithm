package report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main obj = new Main();		
		int size1 = 0;
		int size2 = 0;
		String num1 = "";
		String num2 = "";
		String[] str1Arr;
		String[] str2Arr;
		int[] num1Arr;
		int[] num2Arr;
		try {
			size1 = Integer.parseInt(br.readLine());
			num1 = br.readLine();
			size2 = Integer.parseInt(br.readLine());
			num2 = br.readLine();
			str1Arr = num1.split(" ");
			str2Arr = num2.split(" ");
			num1Arr = new int[size1];
			num2Arr = new int[size2];
			for(int i=0; i<size1; i++) {
				num1Arr[i] = Integer.parseInt(str1Arr[i]);
			}
			for(int i=0; i<size2; i++) {
				num2Arr[i] = Integer.parseInt(str2Arr[i]);
			}
			Arrays.sort(num1Arr);
			for(int i=0; i<size2; i++) {
				System.out.println(obj.search(num1Arr, num2Arr[i]));
				}
			}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
	}
	public int search(int[] arr, int searchValue) {
		int searchIdx = 0;
		int startIdx = 0;
		int endIdx = arr.length-1;
		int midIdx = 0;
		while(startIdx<=endIdx) {
			midIdx = (startIdx+endIdx)/2;
//			System.out.println(startIdx+","+midIdx+","+endIdx);
			if(arr[midIdx]==searchValue) {
				searchIdx = 1;
				break;
			}else if(arr[midIdx]>searchValue){
				endIdx = midIdx-1;
			}else{
				startIdx = midIdx+1;
			}
		}
		return searchIdx;
	}
}
