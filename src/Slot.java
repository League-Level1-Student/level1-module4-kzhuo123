import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot implements ActionListener {
JFrame frame= new JFrame();
JPanel panel= new JPanel();
JLabel label = new JLabel();
JLabel label1;
JLabel label2;
JButton button=new JButton();
	
	
public static void main(String[] args) {
	Slot run = new Slot();
	run.drawslot();
}	
	

public void drawslot() {
	frame=new JFrame();
	panel=new JPanel();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	label=showImage("coin.jpg");
	label1=showImage("cherry.jpg");
	label2=showImage("seven.jpg");
	button.setText("Spin");
	panel.add(label);
	panel.add(label1);
	panel.add(label2);
	panel.add(button);
	frame.add(panel);
	frame.pack();
	button.addActionListener(this);
	
}
private JLabel showImage(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}


@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonClicked = (JButton) e.getSource();
	if (buttonClicked==button) {
		
	}
	
}
}

	
	
	
	
	
	
	

