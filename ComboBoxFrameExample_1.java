import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ComboBoxFrameExample_1 extends  JFrame implements ItemListener {
	private JComboBox<String> imagesJComboBox;
	private JLabel label;
	private String[] names = {"mood.png","mood-changes.png","sad.png","sword.png"};
	
	private Icon[] icons = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3]))
	};
	
	public ComboBoxFrameExample_1() {
		// TODO Auto-generated constructor stub
		super("Testing JComboBox");
		setLayout(new FlowLayout());
		
		imagesJComboBox = new JComboBox<String>(names);
		imagesJComboBox.setMaximumRowCount(3);
		imagesJComboBox.addItemListener(this);
		add(imagesJComboBox);
		label= new JLabel(icons[0]);
		add(label);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,150);
		setVisible(true);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED)
			label.setIcon(icons[
			                    imagesJComboBox.getSelectedIndex()]);
		
	}
	public static void main(String[] args) {
		new ComboBoxFrameExample_1();
	}
}
