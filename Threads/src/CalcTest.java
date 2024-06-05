import java.sql.Time;

public class CalcTest {
	
	public static void main(String[] args) {
		
		CalculatorRunnable calcObj=new CalculatorRunnable(5);		
		Thread threadObj=new Thread(calcObj);
		threadObj.setName("MyThread-1");
		threadObj.start();
		
		
		while(threadObj.isAlive())
		{
			System.out.println(threadObj.getName()+ " is active");
			
		}
		
		System.out.println("Thread's work is completed...");
	}

}
