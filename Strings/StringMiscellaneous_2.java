package Strings;

public class StringMiscellaneous_2 {
 public static void main(String[] args) {
	String s1 = "Hello There";
	char[] charArray = new char[5];
	
	System.out.printf("s1 = %s\n",s1);
	
	//test length method
	System.out.printf("Length of s1: %d\n",s1.length());
	
	//loop through characters in s1 with charAt and display reversed
	System.out.printf("The string reversed is: ");
	for(int i = s1.length()-1 ; i >= 0 ; i--) {
		System.out.print(s1.charAt(i)+" ");
	}
	System.out.println();
	
	//copy characters from string s1 into charArray
	//start to where to finish,which char variable and starting index
	s1.getChars(0, 5, charArray, 0);
	
	for(char karakter : charArray)
		System.out.print(karakter+" ");
}
}
