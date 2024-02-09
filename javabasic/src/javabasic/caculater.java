package javabasic;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class caculater implements ActionListener{

	    private Frame frame;
	    private TextField inputField;
	    private Button addButton, subtractButton, multiplyButton, divideButton, equalsButton;
	    private double firstNumber, secondNumber;
	    private char operator;

	    public caculater() {
	        frame = new Frame("Simple Calculator");

	        inputField = new TextField();
	        inputField.setBounds(40, 40, 230, 30);
	        frame.add(inputField);

	        addButton = new Button("+");
	        addButton.setBounds(20, 80, 50, 30);
	        addButton.addActionListener(this);
	        frame.add(addButton);

	        subtractButton = new Button("-");
	        subtractButton.setBounds(80, 80, 50, 30);
	        subtractButton.addActionListener(this);
	        frame.add(subtractButton);

	        multiplyButton = new Button("*");
	        multiplyButton.setBounds(140, 80, 50, 30);
	        multiplyButton.addActionListener(this);
	        frame.add(multiplyButton);

	        divideButton = new Button("/");
	        divideButton.setBounds(200, 80, 50, 30);
	        divideButton.addActionListener(this);
	        frame.add(divideButton);

	        equalsButton = new Button("=");
	        equalsButton.setBounds(20, 120, 230, 30);
	        equalsButton.addActionListener(this);
	        frame.add(equalsButton);

	        frame.setLayout(null);
	        frame.setSize(270, 200);
	        frame.setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == addButton) {
	            operator = '+';
	            firstNumber = Double.parseDouble(inputField.getText());
	            inputField.setText("");
	        } else if (e.getSource() == subtractButton) {
	            operator = '-';
	            firstNumber = Double.parseDouble(inputField.getText());
	            inputField.setText("");
	        } else if (e.getSource() == multiplyButton) {
	            operator = '*';
	            firstNumber = Double.parseDouble(inputField.getText());
	            inputField.setText("");
	        } else if (e.getSource() == divideButton) {
	            operator = '/';
	            firstNumber = Double.parseDouble(inputField.getText());
	            inputField.setText("");
	        } else if (e.getSource() == equalsButton) {
	            secondNumber = Double.parseDouble(inputField.getText());
	            double result = 0;

	            try {
	                switch (operator) {
	                    case '+':
	                        result = firstNumber + secondNumber;
	                        break;
	                    case '-':
	                        result = firstNumber - secondNumber;
	                        break;
	                    case '*':
	                        result = firstNumber * secondNumber;
	                        break;
	                    case '/':
	                        if (secondNumber != 0)
	                            result = firstNumber / secondNumber;
	                        else
	                            throw new ArithmeticException("Cannot divide by zero!");
	                        break;
	                }

	                inputField.setText(String.valueOf(result));
	            } catch (NumberFormatException ex) {
	                inputField.setText("Invalid input");
	            } catch (ArithmeticException ex) {
	                inputField.setText(ex.getMessage());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        new caculater();
	    }
	}
	