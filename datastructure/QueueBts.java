package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBts {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		String data = "";
		String[] strArr;
		int member;
		int pick;
		int temp = 0;
		try {
			data = br.readLine();
			strArr = data.split(" ");
			member = Integer.parseInt(strArr[0]);
			pick = Integer.parseInt(strArr[1]);
			for(int i=1; i<=member; i++) {
				queue.add(i);
			}
			while(queue.size()>1) {
				for(int i=1; i<pick; i++) {
					temp = queue.poll();
					queue.offer(temp);	
				}
				queue.poll();
			}
			System.out.println("설거지 당첨자는 "+queue.peek()+"번 입니다.");
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
	}
}
