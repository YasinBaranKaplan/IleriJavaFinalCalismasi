import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrameExample_1 extends JFrame implements ActionListener{
	private JButton[] buttons;
	private String[] names = {"one","two","three","four","five","six"};
	private boolean toggle = true;
	private Container container;
	private final GridLayout grid1;
	private final GridLayout grid2;
	
	public GridLayoutFrameExample_1() {
		// TODO Auto-generated constructor stub
		super("GridLayout Demo");
		grid1 = new GridLayout(2,3,5,5);
		grid2 = new GridLayout(3,2);
		container = getContentPane();
		setLayout(grid1);
		
		buttons = new JButton[names.length];
		
		for(int count = 0; count < names.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,200);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(toggle) {
			container.setLayout(grid2);
		}else {
			container.setLayout(grid1);
			
			toggle = !toggle;
			container.validate();
		}
		
	}
 public static void main(String[] args) {
	new GridLayoutFrameExample_1();
}
}
