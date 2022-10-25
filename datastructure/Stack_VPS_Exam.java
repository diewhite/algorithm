package datastructure;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_VPS_Exam {
	public String checkVPS(String data) {
		String result="";
		Stack<Character> stack = new Stack<Character>();
		//입력데이터로 전달된 괄호문자열을 체크 - ()((()))()))
		//입력데이터 String -> 스택에 저장할 데이터는 Character
		//String클래스의 메소드를 적절하게 활용
		//charAt(index) -> index번째 문자
		//toCharArray() -> 전체문자열의 각 문자를 char[]에 저장해서 리턴
		char[] chararr = data.toCharArray();
		int size = chararr.length;
		for(int i=0; i<size; i++) {
			//전달된 괄호문자열을 스택을 이용해서 유효성체크
			if(chararr[i]=='(') {
				stack.push(chararr[i]);
			}else if(chararr[i]==')') {
				stack.pop();
			}
		}
		if(stack.size()<0 | stack.size()>0) {
			result="NO";
		}else if(stack.size()==0){
			result="YES";
		}
		return result;
	}
	public static void main(String[] args) {
		//Scanner로 입력데이터의 갯수를 입력
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		Stack_VPS_Exam obj = new Stack_VPS_Exam();
		for(int i=0; i<count; i++) {
			//for문을 이용해서 입력데이터 읽기
			//읽은 데이터를 checkVPS메소드의 매개변수로 전달하면서 valid체크(결과 YES! NO! 가 전달)
			//받은 결과 출력하기
			String data = sc.nextLine();
			try{
				System.out.println(obj.checkVPS(data));
			}catch(EmptyStackException e) {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
