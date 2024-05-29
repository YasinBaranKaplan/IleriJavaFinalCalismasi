package StringBuilders;

public class StringBuildersChars_3 {
	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("Hello There");
		System.out.printf("buufer = %s%n",buffer);
		System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n",buffer.charAt(0),buffer.charAt(4));
		
		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.print("The characters are: ");
		for(char character : charArray) {
			System.out.print(character+" ");
		}	
		System.out.println();
		
			buffer.setCharAt(0, 'T');
			buffer.setCharAt(6, 'H');
			System.out.println("buffer = "+buffer.toString());
			
			buffer.reverse();
			System.out.println("buffer = "+buffer.toString());
		
	}
}
