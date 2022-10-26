package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		int size = 0;
		int temp = 0;
		try {
			size = Integer.parseInt(br.readLine());
			for(int i=1; i<=size; i++) {
				queue.add(i);	
			}
			while(queue.size()>1) {
				queue.poll();
				temp = queue.peek();
				queue.offer(temp);
				queue.poll();
			}
			System.out.println(queue.peek());
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
	}
}
