import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date start=new Date();
	int whacked=0;
	int missed=0;
	int times=0;

	public static void main(String[] args) {
		Whack run = new Whack();
		Random r = new Random();
		int n = r.nextInt(23);
		
		
		run.drawButtons(n);
	}

	
	public void drawButtons(int molenum) {
		frame=new JFrame();
		panel=new JPanel();
		
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setPreferredSize(new Dimension(240, 320));
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i==molenum) {
				button.setText("mole");
			}
		}

		frame.pack();
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

			JButton buttonClicked = (JButton) e.getSource();
if (buttonClicked.getText().equals("mole")) {
	Random r = new Random();
	int n = r.nextInt(23);
	this.drawButtons(n);
	speak("Good Job");
	whacked++;
	times++;
}
if (buttonClicked.getText().equals("mole")==false) {
	speak("You missed");
	missed++;
	times++;
}
if (times==10) {
	endGame(start, whacked );
	
}
if (missed==5) {
	endGame(start, whacked);
	speak("you are so bad how did you miss 5 moles");
}
		
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd= new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

}