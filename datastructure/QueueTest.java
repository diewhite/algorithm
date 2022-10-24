package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);//저장공간이 있으면 true 없으면 Exception을 발생
		queue.offer(2);//삽입성공 - true, 삽입실패 - false
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.poll());//front의 요소를 조회하고 제거(비어있으면 null)
		System.out.println(queue.remove());//front의 요소를 조회하고 제거(비어있으면 Exception발생)
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		
	}

}
