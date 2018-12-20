import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot implements ActionListener {
JFrame frame= new JFrame();
JPanel panel= new JPanel();
JLabel label = new JLabel();
JLabel label1;
JLabel label2;
JButton button=new JButton();
ImageIcon coin;
ImageIcon cherry;
ImageIcon seven;


	
public static void main(String[] args) {
	Slot run = new Slot();
	run.drawslot();
}	
	

public void drawslot() {
	try {
		coin=new ImageIcon(ImageIO.read(this.getClass().getResource("coin.jpg")));
		cherry=new ImageIcon(ImageIO.read(this.getClass().getResource("cherry.jpg")));
		seven=new ImageIcon(ImageIO.read(this.getClass().getResource("seven.jpg")));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
	Random r = new Random();
	Random r1= new Random();
	Random r2= new Random();
	JButton buttonClicked = (JButton) e.getSource();
	if (buttonClicked==button) {
		int n = r.nextInt(3);
		int n1= r1.nextInt(3);
		int n2= r2.nextInt(3);
		if (n==0) {
			label.setIcon(coin);
		}
		if (n==1) {
			label.setIcon(cherry);
		}
		if (n==2) {
			label.setIcon(seven);
		}
		if (n1==0) {
			label1.setIcon(coin);
		}
		if (n1==1) {
			label1.setIcon(cherry);
		}
		if (n1==2) {
			label1.setIcon(seven);
		}
		if (n2==0) {
			label2.setIcon(coin);
		}
		if (n2==1) {
			label2.setIcon(cherry);
		}
		if (n2==2) {
			label2.setIcon(seven);
		}
		if (n==n1&&n==n2) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
	}
	
}
}

	
	
	
	
	
	
	

