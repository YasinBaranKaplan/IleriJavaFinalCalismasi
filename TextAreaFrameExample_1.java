import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrameExample_1 extends JFrame implements ActionListener{
private JTextArea tArea1;
private JTextArea tArea2;
private JButton copyButton;

public TextAreaFrameExample_1() {
	// TODO Auto-generated constructor stub
	super("TextArea Demo");
	Box box = Box.createHorizontalBox();
	
		String demo ="This is a demo string to\n"+
				"illustrate copying text\nfrom one textarea to \n" +
				 "another textarea using an\nexternal event\n";
		
		tArea1 = new JTextArea(demo,10,15);
		box.add(new JScrollPane(tArea1));
		
		copyButton = new JButton("Copy >>>");
		box.add(copyButton);
		copyButton.addActionListener(this);
		
		tArea2 = new JTextArea(10,15);
		tArea2.setEditable(false);
		box.add(new JScrollPane(tArea2));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(425,200);
		setVisible(true);
		
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tArea2.setText(tArea1.getSelectedText());
				
	}
	public static void main(String[] args) {
		new TextAreaFrameExample_1();
	}
}
