package basic;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		while(key.hasNextInt()) {
			System.out.println(key.nextInt()+key.nextInt());
		}
		key.close();
	}

}
