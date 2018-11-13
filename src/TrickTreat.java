import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickTreat implements ActionListener, MouseListener {
	JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JButton button= new JButton();
	 JButton button1= new JButton();
	 public static void main(String[] args) {
		TrickTreat run= new TrickTreat();
		run.run();
	}
	  public void run() {

	 frame.add(panel);
	 panel.add(button);
	 
	 frame.setVisible(true);
	 panel.add(button1);
	button.addActionListener(this);
	button1.addActionListener(this);
	button.setText("Trick");
	button1.setText("Treat");
	button.addMouseListener(this);
	
	  }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				JButton buttonClicked= (JButton) e.getSource();
				if (buttonClicked==button) {
					showPictureFromTheInternet("dog.jpg");
					
				}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
