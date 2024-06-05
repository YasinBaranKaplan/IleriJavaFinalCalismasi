import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringThread extends Thread {
	
	private List list;
	private String word;
	Lock lock =new ReentrantLock();
	
	
	public StringThread(List list, String word)
	{
		this.list=list;
		this.word=word;
	}
	
	public void run()
	{
		//synchronized (list) {
		lock.lock();
			for (int i=0;i<word.length();i++)
			{
				list.add(word.charAt(i));
			}
			
			System.out.println("List:"+list);
	   lock.unlock();
			
		//}
		
		
	}
	
	
	

}
