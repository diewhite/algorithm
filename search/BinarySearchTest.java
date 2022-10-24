package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] arr = {77,19,22,23,7,4,5};
		int searchValue = key.nextInt();
		Arrays.sort(arr);
		display(arr);
		int result = search(arr, searchValue);
		if(result==-1) {
			System.out.println("찾는 데이터가 없습니다.");
		}else {
			System.out.println("데이터의 위치:"+result);
		}
		
	}
	//요소의 위치를 리턴, 없으면 -1
	public static int search(int[] arr, int searchValue) {
		int searchIdx = -1;
		//시작Idx,중간Idx,끝Idx
		int startIdx = 0;
		int endIdx = arr.length-1;
		int midIdx = 0;
		while(startIdx<=endIdx) {
			midIdx = (startIdx+endIdx)/2;
			System.out.println(startIdx+","+midIdx+","+endIdx);
			if(arr[midIdx]==searchValue) {
				searchIdx = midIdx;//원하는 값을 찾았다!!!!
				break;
			}else if(arr[midIdx]>searchValue){
				//중간인덱스 앞의(왼쪽) Idx를 endIdx로 이동
				endIdx = midIdx-1;
			}else{
				//찾는 값보다 중간값이 작으면 앞의 요소는 검색하지 않아도 되므로 시작idx를 중간idx의 다음(오른쪽 옆)으로 idx이동
				startIdx = midIdx+1;
			}
		}
		return searchIdx;
	}
	
	public static void display(int[] myarr) {
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i]+"\t");
		}
		System.out.println();
	}
}
