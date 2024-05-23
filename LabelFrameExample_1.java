import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class LabelFrameExample_1 extends JFrame{
	private  JLabel label1;
	private  JLabel label2;
	private  JLabel label3;
	
	public LabelFrameExample_1()
	{
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is Label1");
		add(label1);
		
		Icon girl = new ImageIcon(getClass().getResource("mood-changes.png"));
		label2 = new JLabel("Label with text and icon",girl,SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		add(label2);
		
		label3= new JLabel();
		label3.setText("Label with icon and text at bottom");
		label3.setIcon(girl);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is Label3");
		add(label3);
	
	}
	
	
public static void main(String[] args) {
	LabelFrameExample_1 labelFrame = new LabelFrameExample_1();
	labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	labelFrame.setSize(260,180);
	labelFrame.setVisible(true);
  }
}

