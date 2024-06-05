
public class ThreadTestSum {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 threadObj1=new Thread1();
		threadObj1.start();
		threadObj1.join();
		
		Thread2 threadObj2=new Thread2();
		threadObj2.start();
		
	}

}
