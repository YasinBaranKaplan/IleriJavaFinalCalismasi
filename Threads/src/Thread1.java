import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Thread1 extends Thread {
	
	public void run()
	{
		Random r=new Random();
		int firstNumber=r.nextInt(9), secondNumber=r.nextInt(9);
		int sum=firstNumber+secondNumber;
		
		String message=firstNumber+"+"+secondNumber+"="+sum;
		System.out.println(message);
		
		try
		{
			File f=new File("C:\\Users\\kapla\\eclipse-workspace\\Lab14_Cuma_2023-24_2\\src\\MyFile");
		    FileWriter fWriter=new FileWriter(f, true);
		    BufferedWriter bWriter=new BufferedWriter(fWriter);
		    bWriter.append(message+"\n");
		    bWriter.close();
		}
		catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
	    
	
	}
	
	

}
