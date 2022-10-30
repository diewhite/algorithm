package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class P9012 {
	public String checkVPS(String data) {
		String result="";
		Stack<Character> stack = new Stack<Character>();
		char[] chararr = data.toCharArray();
		int size = chararr.length;
		for(int i=0; i<size; i++) {
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int count;
		P9012 obj = new P9012();
		try {
			count = Integer.parseInt(br.readLine());
			for(int i=0; i<count; i++) {
				input = br.readLine();
				try{
					System.out.println(obj.checkVPS(input));
				}catch(EmptyStackException e) {
					System.out.println("NO");
				}
			}
		} catch (IOException e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
