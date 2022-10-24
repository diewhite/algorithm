package datastructure;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력 :");
		int count = key.nextInt();
		String  line = key.nextLine();
		System.out.println("문장입력 :");
		line = key.nextLine();
		System.out.println(line);
	}

}
