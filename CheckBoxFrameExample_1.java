import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrameExample_1 extends JFrame  implements ItemListener{
	private JTextField txtfield;
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;
	
	public CheckBoxFrameExample_1() {
		// TODO Auto-generated constructor stub
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		txtfield = new JTextField("Watch the font style change",20);
		txtfield.setFont(new Font("Serif",Font.PLAIN,14));
		add(txtfield);
		
		boldCheckBox = new JCheckBox("Bold");
		italicCheckBox = new JCheckBox("Italic");
		add(boldCheckBox);
		add(italicCheckBox);
		boldCheckBox.addItemListener(this);
		italicCheckBox.addItemListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(275,100);
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Font font = null;
		if(boldCheckBox.isSelected() && italicCheckBox.isSelected())
			font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		else if(boldCheckBox.isSelected())
			font = new Font("Serif",Font.BOLD,14);
		else if(italicCheckBox.isSelected())
			font = new Font("Serif",Font.ITALIC,14);
		else
			font = new Font("Serif",Font.PLAIN,14);
		
		txtfield.setFont(font);
		
	}
public static void main(String[] args) {
	new CheckBoxFrameExample_1();
}
}
