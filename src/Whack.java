import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

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
}
	}
}