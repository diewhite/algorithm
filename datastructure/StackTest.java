package datastructure;

import java.util.Scanner;

class MyStack{
	private int[] mystack;//MyStackŬ���� ���ο��� �����͸� �����ϱ� ���� ����(����ó�� Ȱ��)
	private int top_position;//������ top�� ��ġ���� ����
	public MyStack(int size) {
		this.mystack = new int[size];
		top_position = 0;
	}
	//pop,push,top,empty,size�޼ҵ带 ����
	public void push(String value) {
		this.mystack[top_position] = Integer.parseInt(value);
		top_position++;		
	}
	public void pop() {
		if(top_position>0) {
			System.out.println(mystack[top_position-1]);
			mystack[top_position-1] = 0;
			top_position--;
		}else {
			System.out.println("-1");
		}
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
	public void empty() {
		if(this.top_position==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
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
		//1. ��ĳ���ǰ�ü����
		//2. MyStack��ü����
		//3.
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		MyStack stack = new MyStack(5);
		for(int i=0; i<=count; i++) {
			//����Ƚ����ŭ ���� push, pop, top, empty, size �Է� - �Էµ������� ���� ó�� �Է�
			String line = sc.nextLine();
			String[] cmd = line.split(" ");//2�� �Է� line[0], line[1]�߻�, 1�� �Է� line[0] �߻�
			switch(cmd[0]) {
				case "push":
					stack.push(cmd[1]);
				break;
				
				case "pop":
					stack.pop();
				break;
				
				case "top":
					System.out.println(stack.top());
				break;
				
				case "empty":
					stack.empty();
				break;
				
				case "size":
					System.out.println(stack.size());
				break;
			}
		}
		sc.close();
	}
}
