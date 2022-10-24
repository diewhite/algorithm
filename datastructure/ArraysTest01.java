package datastructure;

import java.util.Arrays;

//Arrays는 배열을 다루기 위해 만들어진 클래스
//-> 배열을 다루기 위한 다양한 메소드가 포함
//-> 많은 메소드가 static메소드
public class ArraysTest01 {
	public static void main(String[] args) {
		int[] myarr = {10, 30, 33, 5, 88, 12};
		display(myarr);
		
		//배열의 모든 데이터를 오름차순으로 정렬
		//매개변수로 정렬할 배열을 전달,
		Arrays.sort(myarr);
		display(myarr);
		
		//배열의 복사
		int[] otherArr = Arrays.copyOfRange(myarr, 2, 4);
		display(otherArr);
		
		//전달받은 배열에서 특정 값의 위치값을 반환
		//=> 이진 검색 알고리즘을 사용하여 검색
		//	 이진 검색 알고리즘을 사용하기 때문에 사용전에 정렬이 되어 있어야 제대로 동작
		System.out.println(Arrays.binarySearch(myarr, 88));
		
	}
	public static void display(int[] myarr) {
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i]+"\t");
		}
		System.out.println();
	}
}
