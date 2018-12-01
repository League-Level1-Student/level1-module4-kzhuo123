import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig implements ActionListener {
JFrame frame =new JFrame();
JPanel panel= new JPanel();
JButton translate= new JButton();
JTextField field = new JTextField();
JLabel field1 = new JLabel();
PigLatinTranslator n =new PigLatinTranslator();

public static void main(String[] args) {
	Pig run=new Pig();
	run.makeButtons();
}
	
public void makeButtons() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(field);
	panel.add(translate);
	panel.add(field1);

	translate.setText("Translate");
	translate.addActionListener(this);
	field.setPreferredSize(new Dimension(100, 25));
	field1.setPreferredSize(new Dimension(100, 25));
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

@Override
public void actionPerformed(ActionEvent e) {
	String a = field.getText();
	String b = field1.getText();
	JButton buttonClicked = (JButton) e.getSource();
	if (buttonClicked==translate) {
		String s= n.translate(a);
		field1.setText(s);
		frame.pack();
	}
}
	
	
	
	
	
	
}
