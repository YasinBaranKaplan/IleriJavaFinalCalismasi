
public class Cal1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		CalculatorRunnable calcObj=new CalculatorRunnable(426376456);		
		Thread threadObj=new Thread(calcObj);
	    threadObj.start();
	    threadObj.join(100000000);;
	    System.exit(0);
		
	}

}
