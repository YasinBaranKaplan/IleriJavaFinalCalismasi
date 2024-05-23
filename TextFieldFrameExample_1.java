import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.Object;

public class TextFieldFrameExample_1 extends JFrame{
private JTextField textfield1;
private JTextField textfield2;
private JTextField textfield3;
private JPasswordField passwordField;

public TextFieldFrameExample_1() {
	super("Testing JTextField and JPasswordField");
	setLayout(new FlowLayout());
	
	textfield1 = new JTextField("10");// construct text field with 10 columns
	add(textfield1);
	
	
	textfield2 = new JTextField("Enter text here");
	add(textfield2);
	
	textfield3 = new JTextField("uneditable text field",21);
	textfield3.setEditable(false);
	add(textfield3);
	
	passwordField = new JPasswordField("Hidden Text");
	add(passwordField);
	
	TextFieldHandler handler = new TextFieldHandler();
	textfield1.addActionListener(handler);
	textfield2.addActionListener(handler);
	textfield3.addActionListener(handler);
	passwordField.addActionListener(handler);
	
	
	
    
}
private class TextFieldHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String string ="";
		
		if(e.getSource()==textfield1)
			string = String.format("textfield1: %s", e.getActionCommand());
		else if(e.getSource()==textfield2)
			string = String.format("textfield2: %s", e.getActionCommand());
		else if(e.getSource()==textfield3)
			string = String.format("textfield3: %s", e.getActionCommand());
		else if(e.getSource()==passwordField)
			string = String.format("passwordField: %s", e.getActionCommand());
		
		JOptionPane.showMessageDialog(null, string);
	
	}
	
	
}
public static void main(String[] args) {
	TextFieldFrameExample_1 exp = new TextFieldFrameExample_1();
	exp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 exp.setSize(350, 100); 
	 exp.setVisible(true); 
}
}

