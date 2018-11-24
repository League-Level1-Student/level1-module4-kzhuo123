import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField field = new JTextField();
	JTextField field1 = new JTextField();
	int i;
	int j;
	int answer;
	Calculator calculator = new Calculator();

	public static void main(String[] args) {
		CalculatorRunner run = new CalculatorRunner();
		run.makeButtons();
		JOptionPane.showMessageDialog(null, "Enter 2 numbers");
	}

	public void makeButtons() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(field);
		panel.add(field1);
		add.setText("add");
		subtract.setText("subtract");
		multiply.setText("multiply");
		divide.setText("divide");
		add.addMouseListener(this);
		subtract.addMouseListener(this);
		divide.addMouseListener(this);
		multiply.addMouseListener(this);
		field.setPreferredSize(new Dimension(100, 50));
		field1.setPreferredSize(new Dimension(100, 50));
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String a = field.getText();
		String b = field1.getText();
		i = Integer.parseInt(a);
		j = Integer.parseInt(b);
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == add) {
			answer=calculator.add(i, j);
		}
		if (buttonClicked == subtract) {
			answer=calculator.subtract(i, j);
		}
		if (buttonClicked == multiply) {
			answer=calculator.multiply(i, j);
		}
		if (buttonClicked == divide) {
			answer=calculator.divide(i, j);
		}
		JOptionPane.showMessageDialog(null, answer);
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
