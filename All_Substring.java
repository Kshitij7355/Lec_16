package lec16;
import java.util.*;
public class All_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		PrintSubstring(s1);
		
	}
	public static void PrintSubstring(String str) {
		for(int i =0;i<str.length();i++) {
			for(int j = i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
