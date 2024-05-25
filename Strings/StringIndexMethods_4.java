package Strings;

public class StringIndexMethods_4 {
	public static void main(String[] args) {
		String letters = "abcdefghijklmabcdefghijklm";
		//test indexOf to locate a character in a string
		System.out.println("'c' is located at index : "+letters.indexOf('c'));
		
		System.out.printf("'a' is located at index : %d\n",letters.indexOf('a', 1));
		
		System.out.println("'$' is located at index : "+letters.indexOf('$'));
		System.out.println();
		
		// test lastIndexOf to find a character in a string
		System.out.println("Last 'c' is located at  index : "+letters.lastIndexOf('c'));
		
		System.out.println("Last 'a' is located at  index : "+letters.lastIndexOf('a',13));
		System.out.println();
		
		//test lastIndexOf to find a substring in a string
		System.out.println("\"def\" is located at index : "+letters.indexOf("def"));
		
		System.out.println("\"def\" is located at index : "+letters.indexOf("def",7));
		
		System.out.println("\"hello\" is located at index : "+letters.indexOf("hello"));
		System.out.println();
		
		// test lastIndexOf to find a substring in a string
		 System.out.printf("Last \"def\" is located at index %d%n",letters.lastIndexOf("def"));
		 
		 System.out.printf("Last \"def\" is located at index %d%n",letters.lastIndexOf("def",25));
		 
		 System.out.printf("Last \"hello\" is located at index %d%n",letters.lastIndexOf("hello"));
		
		
	}
}
