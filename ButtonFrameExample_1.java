import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrameExample_1 extends JFrame implements ActionListener{
	private JButton plainButton;
	private JButton fancyButton;
	
	public ButtonFrameExample_1() {
		super("Test Button");
		setLayout(new FlowLayout());
		
		plainButton = new JButton("Plain Button");
		add(plainButton);
		
		Icon bug = new ImageIcon(getClass().getResource("mood.png"));
		Icon bug2 = new ImageIcon(getClass().getResource("mood-changes.png"));
		fancyButton = new JButton("Fancy Button",bug);
		fancyButton.setRolloverIcon(bug2);
		add(fancyButton);
		
		
		fancyButton.addActionListener(this);
		plainButton.addActionListener(this);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,String.format("You pressed: %s", e.getActionCommand()));
		
	}
	
	public static void main(String[] args) {
		ButtonFrameExample_1 exp = new ButtonFrameExample_1();
		exp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exp.setSize(275,110);
		exp.setVisible(true);
		
	}

}
