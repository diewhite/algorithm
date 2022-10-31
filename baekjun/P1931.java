package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Meet implements Comparable<Meet>{
	private int start;
	private int end;
	public Meet() {
		
	}
	public Meet(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String toString() {
		return "Meet [start=" + start + ", end=" + end + "]";
	}
	public int compareTo(Meet obj) {
		int result = 0;
		if(getEnd()==obj.getEnd()) {
			result = getStart() - obj.getStart();
		}else {
			result = getEnd()-obj.getEnd();
		}
		return result;
	}
}

public class P1931 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Meet> time = new ArrayList<Meet>();
		int count;
		String input;
		String[] strarr;
		int result = 0;
		try {
			count = Integer.parseInt(br.readLine());
			for(int i=0; i<count; i++) {
				input = br.readLine();
				strarr = input.split(" ");
				time.add(new Meet(Integer.parseInt(strarr[0]), Integer.parseInt(strarr[1])));
			}
			Collections.sort(time);			
			int ref = 0;
			for(int i=0; i<time.size();i++) {
				if(time.get(i).getStart()>=ref) {
					ref = time.get(i).getEnd();
					result++;
				}
			}
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}