import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrameExample_1 extends JFrame implements ListSelectionListener {
	private JList<String> colorJlist;
	private String[] colorNames = {"Black", "Blue", "Cyan","Dark Gray","Gray",
			"Green", "Light Gray", "Magenta","Orange",
			 "Pink", "Red","White","Yellow"};
	
	private Color[] colors = {Color.BLACK, Color.BLUE,Color.CYAN, Color.DARK_GRAY,
			Color.GRAY, Color.GREEN,Color.LIGHT_GRAY,
			Color.MAGENTA, Color.ORANGE, Color.PINK,
			Color.RED, Color.WHITE, Color.YELLOW};
	
	public ListFrameExample_1() {
		super("List Test");
		setLayout(new FlowLayout());
		
		colorJlist = new JList<String>(colorNames);
		colorJlist.setVisibleRowCount(5);
		
		colorJlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(colorJlist));
		colorJlist.addListSelectionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,150);
		setVisible(true);
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		getContentPane().setBackground(colors[colorJlist.getSelectedIndex()]);
		
	}
	public static void main(String[] args) {
		new ListFrameExample_1();
	}
}
