package search;

import java.util.Scanner;

public class SequenceSearchTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] arr = {77,19,22,23,7,4,5};
		int searchValue = key.nextInt();
		int result = search(arr, searchValue);
		if(result==-1) {
			System.out.println("찾는 데이터가 없습니다.");
		}else {
			System.out.println("데이터의 위치:"+result);
		}
		
	}
	//요소의 위치를 리턴, 없으면 -1
	public static int search(int[] arr, int searchValue) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			if(searchValue == arr[i]) {
				result = i; //찾으면 인덱스를 리턴
				break;
			}
			result = -1;
		}
		return result;
	}
}
