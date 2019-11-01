package swingexamples;

import java.awt.Color;

import javax.swing.*;

public class SwingGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("GUI Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		
		JButton button = new JButton(" Press ");
		button.setBackground(Color.red);
		frame.getContentPane().add(button);
		frame.setVisible(true);

	}

}
