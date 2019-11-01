package calculatorapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class CalculatorActionListener implements ActionListener {

	String value1 = "";
	String value2 = "";
	String operator = "";

	private JTextField textField;

	public String calculate(String first, String second, String operator) {

		if(operator == "+") {
			return Integer.toString(Integer.parseInt(first) + Integer.parseInt(second));
		} else if(operator == "-") {
			return Integer.toString(Integer.parseInt(first) - Integer.parseInt(second));
		} else if(operator == "x") {
			return Integer.toString(Integer.parseInt(first) * Integer.parseInt(second));
		} else if(operator == "/") {
			if(Integer.parseInt(second) == 0) {
				return "Error.";
			} else {
				return Integer.toString(Integer.parseInt(first) / Integer.parseInt(second));
			}
		} else if(operator == "%") {
			if(Integer.parseInt(second) == 0) {
				return "Error.";
			} else {
				return Integer.toString(Integer.parseInt(first) % Integer.parseInt(second));
			} 
		} else {
			return "Error";
		}
	}

	public CalculatorActionListener (JTextField textField) {
		this.textField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand().charAt(0)) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			if(operator == "") {
				value1 += e.getActionCommand().charAt(0);
				textField.setText(value1);
			} else {
				value2 += e.getActionCommand().charAt(0);
				textField.setText(value2);
			}
			break;
		case '+':
			operator = "+";
			textField.setText("");
			break;
		case '-':
			operator = "-";
			textField.setText("");
			break;
		case 'x':
			operator = "x";
			textField.setText("");
			break;
		case '/':
			operator = "/";
			textField.setText("");
			break;
		case '%':
			operator = "%";
			textField.setText("");
			break;
		case '=':
			if(calculate(value1, value2, operator) == "Error.") {
				textField.setText(calculate(value1, value2, operator));
				value1 = "";
				value2 = "";
				operator = "";
			} else {
					value1 = calculate(value1, value2, operator);
					value2 = "";
					textField.setText(value1);
			}
			break;
		case 'C': 
			textField.setText("");
			value1 = "";
			value2 = "";
			operator = "";
			break;
		case 'U':
			if(operator == "") {
				value1 = Integer.toString((Integer.parseInt(value1)*(-1)));
				textField.setText(value1);
			} else {
				value2 = Integer.toString((Integer.parseInt(value2)*(-1)));
				textField.setText(value2);
			}
			break;
		}
	}
}
