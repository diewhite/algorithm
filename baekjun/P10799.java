package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10799 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		char[] charArr;
		Stack<Character> stack = new Stack<Character>();
		int result = 0;
		int size;
		try {
			input = br.readLine();
			charArr = input.toCharArray();
			size = charArr.length;
			for(int i=0; i<size; i++) {
				switch(charArr[i]) {
						case '(':
						stack.push(charArr[i]);
						break;
						
						case ')':
							if(charArr[i-1]=='(') {
								stack.pop();
								result += stack.size();								
							}else{
								stack.pop();
								result ++;
							}
						break;
					}
			}
			
			System.out.println(result);
		}catch(IOException e){
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
	}

}
