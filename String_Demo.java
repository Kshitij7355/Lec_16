package lec16;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		String s1 = "Hey";
		String s2 = "Singh";
		//s1 = s1+s2;
		s1 = s1.concat(s2);
		
		System.out.println(s1);

	}

}
