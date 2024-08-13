package lec16;

import java.util.Scanner;

public class Substring_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		Substring_length(s1);
		
	}
	public static void Substring_length(String str1) {
		for(int len = 1;len<=str1.length();len++) {
			for (int j = len ; j<=str1.length();j++) {
				int i = j-len;
				System.out.println(str1.substring(i, j));
			}
		}
	}

}
