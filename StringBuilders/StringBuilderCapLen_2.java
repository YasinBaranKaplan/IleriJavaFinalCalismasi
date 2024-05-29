package StringBuilders;

public class StringBuilderCapLen_2 {
	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("Hello, How Are You?");
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n",buffer,buffer.length(),buffer.capacity());
		
		buffer.ensureCapacity(75);
		System.out.printf("New capacity = %d%n%n",buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("New length = %d%nbuffer = %s%n",buffer.length(),buffer.toString());
		
	}

}
