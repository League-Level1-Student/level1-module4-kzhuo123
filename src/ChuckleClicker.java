import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements MouseListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	 static JButton button= new JButton();
	 static JButton button1= new JButton();

	 public static void main(String[] args) {
ChuckleClicker run= new ChuckleClicker();
run.makeButtons();



}










public void makeButtons() {
	frame.setVisible(true);
	 frame.add(panel);
	 panel.add(button);
	 panel.add(button1);
	button.setText("Joke");
	button1.setText("Punchline");
button.addMouseListener(this);
button1.addMouseListener(this);
	
	
	
	
}










@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton buttonClicked= (JButton) e.getSource();
	if (buttonClicked==button) {
JOptionPane.showMessageDialog(null, "What do you call a fish with no eyes?");
		
	}
	if (buttonClicked==button1) {
		JOptionPane.showMessageDialog(null, "fsh");
	}
	}











@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}










@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}










@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}










@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}












}
