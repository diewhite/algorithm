package datastructure;

import java.util.Scanner;

class MyStack{
	private int[] mystack;//MyStack클래스 내부에서 데이터를 저장하기 위한 공간(스텍처럼 활용)
	private int top_position;//스텍의 top의 위치값을 저장
	public MyStack(int size) {
		this.mystack = new int[size];
		top_position = 0;
	}
	//pop,push,top,empty,size메소드를 구현
	public void push(String value) {
		this.mystack[top_position] = Integer.parseInt(value);
		top_position++;		
	}
	public int pop() {
		int result = 0;
		if(top_position>0) {
			result = mystack[top_position-1];
			mystack[top_position-1] = 0;
			top_position--;
			
		}else {
			result = -1;
		}
		return result;
	}
	public int top() {
		int val = mystack[top_position];
		if(top_position>0) {
			val = mystack[top_position-1];	
		}else {
			val = -1;
		}
		return val;
	}
	public int empty() {
		int result = 0;
		if(this.top_position==0) {
			result = 1;
		}else {
			result = 0;
		}
		return result;
	}
	public int size() {
		int size = 0;
		for(int i=0; i<this.mystack.length; i++) {
			if(this.mystack[i]!=0) {
				size++;
			}
		}
		return size;
	}
	public int[] getMystack() {
		return mystack;
	}
	public void setMystack(int[] mystack) {
		this.mystack = mystack;
	}
	public int getTop_position() {
		return top_position;
	}
	public void setTop_position(int top_position) {
		this.top_position = top_position;
	}
	
}

public class StackTest {
	public static void main(String[] args) {
		//1. 스캐너의객체생성
		//2. MyStack객체생성
		//3.
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();//nextInt를 이용해서 int데이터를 읽고 누른 Enter키까지 모두 읽고 완료
		MyStack stack = new MyStack(count);
		for(int i=0; i<=count; i++) {
			//실행횟수만큼 직접 push, pop, top, empty, size 입력 - 입력데이터의 예시처럼 입력
			String line = sc.nextLine();
			String[] cmd = line.split(" ");//2개 입력 line[0], line[1]발생, 1개 입력
			switch(cmd[0]) {
				case "push":
					stack.push(cmd[1]);
				break;
				
				case "pop":
					System.out.println(stack.pop());
				break;
				
				case "top":
					System.out.println(stack.top());
				break;
				
				case "empty":
					System.out.println(stack.empty());
				break;
				
				case "size":
					System.out.println(stack.size());
				break;
			}
		}
		sc.close();
	}
}
