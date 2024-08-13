package lec16;

public class CB_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		System.out.println(Substring_length(s));

	}
	public static int Substring_length(String str1) {
		int count =0;
		boolean [] visited  = new boolean[str1.length()];
		for(int len = 1;len<=str1.length();len++) {
			for (int j = len ; j<=str1.length();j++) {
				int i = j-len;
				String s1 = (str1.substring(i, j));
				//String ko int me 
		   //	Integer.parseInt(s1); num wali string ko int me convert
				if (IsCbNumber(Long.parseLong(s1))== true && Isvalid(visited ,i ,j)) {
					count ++;
					for(int k = i;k<j;k++) {
						visited[k]= true;
					}
				}
			}
		}
		return count;
	}
	public static boolean Isvalid(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for(;i<j;i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
	}
	public static boolean IsCbNumber(long num) {
		if(num==0||num==1) {
			return false;
		}
		int []arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i = 0;i<arr.length;i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
		
	}
	
}
