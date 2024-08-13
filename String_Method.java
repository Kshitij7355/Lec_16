package lec16;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str==str1);
		System.out.println(str2==str);//yaha same address hai
		System.out.println(str3==str1);
		System.out.println(str1==str2);
		System.out.println(str.equals(str3));// both content same hai
		String s = "heyhellhowareyou";
		
		System.out.println(s.substring(1, 5));
		System.out.println(s.substring(5));
		System.out.println(s.substring(2, 2));

	}

}
