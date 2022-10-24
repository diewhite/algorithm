package datastructure;

import java.util.Stack;

public class StackAPITest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//스택에 데이터 저장하기
		stack.push("java");
		stack.push("servlet");
		stack.push("jsp");
		System.out.println("스택에 저장된 요소의 갯수:"+stack.size());
		System.out.println("스택에 요소가 없나?"+stack.empty());//스택에 요소가 '없을 경우'에 true 반환.
		System.out.println("스택에 마지막으로 저장된 요소를 확인:"+stack.peek());
		System.out.println("스택에서 데이터 꺼내기:"+stack.pop());
		System.out.println("스택에서 데이터 꺼내기:"+stack.pop());
		System.out.println("스택에서 데이터 꺼내기:"+stack.pop());
		System.out.println("스택에 저장된 요소의 갯수:"+stack.size());
		System.out.println("스택에 요소가 없나?"+stack.empty());
		System.out.println("스택에 마지막으로 저장된 요소를 확인:"+stack.peek());//스텍이 비어있는데 peek을 하면 EmptyStackException이 발생
	}

}
