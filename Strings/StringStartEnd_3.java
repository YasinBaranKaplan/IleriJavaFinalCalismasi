package Strings;



public class StringStartEnd_3 {
	public static void main(String[] args) {
		String[] strings  = {"started","starting","ended","ending"};
		
		System.out.println("test method startsWith()");
		for(String string : strings)
		{
			if(string.startsWith("st"))
				System.out.print(string+" ");
		}
		System.out.println();
		
		System.out.println("test method startsWith starting from position 2 of string");
		for(String myValue : strings)
		{
			if(myValue.startsWith("art",2))
				System.out.print(myValue+" ");
		}
		
		System.out.println();
		
		System.out.println("test method endsWith()");
		for(String last : strings)
		{
			if(last.endsWith("ed"))
				System.out.print(last+" ");
		}
	}
}
