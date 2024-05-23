import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class MouseTrackerFrameExample_1 extends JFrame implements MouseInputListener{
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseTrackerFrameExample_1() {
		super("Demonstrating Mouse events");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel,BorderLayout.CENTER);
		mousePanel.addMouseListener(this);
		
		statusBar= new JLabel("Mouse otside JPanel");
		add(statusBar,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Clicked at X: %d, Y: %d", e.getX(),e.getY()));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Pressed at X: %d, Y: %d", e.getX(),e.getY()));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Released at X: %d, Y: %d", e.getX(),e.getY()));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse entered at X: %d, Y: %d", e.getX(),e.getY()));
		mousePanel.setBackground(Color.GREEN);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Mouse outside JPanel");
		mousePanel.setBackground(Color.WHITE);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Dragged at X: %d, Y: %d", e.getX(),e.getY()));
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Moved at X: %d, Y: %d", e.getX(),e.getY()));
		
	}
	
	public static void main(String[] args) {
		new MouseTrackerFrameExample_1();
	}
}
