import java.util.ArrayList;
import java.util.List;

public class StringThreadTest {
	
	public static void main(String[] args) {
		
		List list=new ArrayList<>();
		String word="Java";
		String word2="Weka";
		
		StringThread stringObj=new StringThread(list, word);
		stringObj.start();
		
		StringThread stringObj2=new StringThread(list, word2);
		stringObj2.start();
		
	}

}
