package sort;

public class SelectionSortTest {
	public static void main(String[] args) {
		int[] arr = {77, 19, 22, 23, 7, 4, 5};
		display(arr);
		for(int i=0; i<arr.length; i++) {
			//순서대로 앞에서 부터 작은 값을 위치할 것이므로 i값을 min index로 정의하고 작업
			int minIndex = i;//최초작업은 minIndex=0
			for(int j=i+1; j<arr.length; j++) {//기준값을 제외한 나머지 값들과 반복해서 비교
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}//최종작업이 완료되면 minIndex에는 제일 작은 값이 있는 index가 저장됩니다.
			//swap
			int temp = arr[i];//i번(기준값)요소의 값을 임시변수에 저장
			arr[i] = arr[minIndex];//최소값을 앞으로 이동
			arr[minIndex] = temp;//기준값을 최소값자리로 이동
			display(arr);
		}
		System.out.println("=========================================");
		display(arr);
	}

	public static void display(int[] myarr) {
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i]+"\t");
		}
		System.out.println();
	}
}
