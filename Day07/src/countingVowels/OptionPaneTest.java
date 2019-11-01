package countingVowels;

import javax.swing.*;

public class OptionPaneTest {
	
	JFrame f;
	OptionPaneTest() {
		f = new JFrame();
	}
	void showMessage(String message) {
		JOptionPane.showMessageDialog(f,  message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionPaneTest object = new OptionPaneTest();
		String m = JOptionPane.showInputDialog("Your input: ", "Enter your input here");
		System.out.println(m);
		object.showMessage("Custom message: " + m);

	}

}
