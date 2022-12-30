package report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] intarr;
		int count;
		String input;
		String[] strarr;
		int result = 0;
		try {
			count = Integer.parseInt(br.readLine());
			intarr = new int[count][2];
			for(int i=0; i<count; i++) {
				input = br.readLine();
				strarr = input.split(" ");
				intarr[i][0] = Integer.parseInt(strarr[0]);
				intarr[i][1] = Integer.parseInt(strarr[1]);
			}
			//회의 종료 시간이 빠른거 부터 오름차순정렬
			//Sort하기 위해서 Comparator객체를 사용
			//정렬하려고 하는 객체를 직접 수정할 수 없는 경우에 정렬기준을 정의하기 위한 객체
			//배열에 다른 객체가 저장되어 있고 이 객체의 정렬 기준을 정의하고 싶은 경우
			//Comparator 인터페이스를 상속하는 객체를 만들어서 작업을 해야 하나 일회성 작업인 경우
			//이름이 없는 Comparator인터페이스의 하위 클래스를 바로 정의해서 생성할 수 있다.- 익명이너클래스(Anonymous Inner Class)
			//-------------
			//new Comparator<t>()
			//class 클래스명 implements Comparator{
			//}와 동일
			//빠른 작업을 위해 객체를 생성하면서 바로 정의해서 사용할 수 있다.

			Arrays.sort(intarr, new Comparator<int[]>() {
				@Override
				public int compare(int[] obj, int[] otherObj) { //obj가 기준, otherObj는 비교대상
					//return obj[0]-otherObj[0]; //{1,4}{3,5}{0,6}{5,7}{3,8} 첫번째 요소를 기준으로 오름차순
					//return otherObj[0]-obj[0]; //{1,4}{3,5}{0,6}{5,7}{3,8} 첫번째 요소를 기준으로 내림차순
					return obj[1]-otherObj[1]; //{1,4}{3,5}{0,6}{5,7}{3,8} 두번째 요소를 기준으로 오름차순
					//return otherObj[1]-obj[1]; //{1,4}{3,5}{0,6}{5,7}{3,8} 두번째 요소를 기준으로 내림차순
				}
			});
			int ref = 0;
			for(int i=0; i<intarr.length; i++) {
				for(int j=0; j<intarr[i].length; j++) {
					if(intarr[i][0]>=ref) {
						result++;
						ref = intarr[i][1];
					}	
				}
			}
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}