package logic;

public class temp {

	public static void main(String[] args) {
		
		//Using string literals
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		
		//String str3 = new String("abc").intern();
		//.intern- defines String in string pool const.
		// equals - compares actual values of values
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));

	}

}
