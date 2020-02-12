package complexcalculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;         

public class UserInterface extends JFrame {
	
	static JTextArea display;

//	static JTextArea display;
	
	UserInterface() {
//	JFrame frame = new JFrame();
	JPanel buttonPanel = new JPanel();
	JPanel displayPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	final int DISPLAY_WIDTH = 10;
	final int DISPLAY_HEIGHT = 1;
	//JTextArea
	display = new JTextArea(DISPLAY_HEIGHT, DISPLAY_WIDTH);
	displayPanel.add(display);
	
	// buttonPipe implements the formula for parallel resistors
	JButton buttonPi = buttonSetup("Pi"), buttonE = buttonSetup("e"), buttonI = buttonSetup("i"), buttonPipe = buttonSetup("||");
	JButton button7 = buttonSetup("7"), button8 = buttonSetup("8"), button9 = buttonSetup("9"), buttonDiv = buttonSetup("/");
	JButton button4 = buttonSetup("4"), button5 = buttonSetup("5"), button6 = buttonSetup("6"), buttonTimes = buttonSetup("*");
	JButton button1 = buttonSetup("1"), button2 = buttonSetup("2"), button3 = buttonSetup("3"), buttonMinus = buttonSetup("-");
	JButton buttonEquals = buttonSetup("="), button0 = buttonSetup("0"), buttonDot = buttonSetup("."), buttonPlus = buttonSetup("+");

	buttonPanel.setLayout(new GridLayout(5, 4));

	buttonPanel.add(buttonPi); buttonPanel.add(buttonE); buttonPanel.add(buttonI); buttonPanel.add(buttonPipe);
	buttonPanel.add(button7); buttonPanel.add(button8); buttonPanel.add(button9); buttonPanel.add(buttonDiv);
	buttonPanel.add(button4); buttonPanel.add(button5); buttonPanel.add(button6); buttonPanel.add(buttonTimes);
	buttonPanel.add(button1); buttonPanel.add(button2); buttonPanel.add(button3); buttonPanel.add(buttonMinus);
	buttonPanel.add(buttonEquals); buttonPanel.add(button0); buttonPanel.add(buttonDot); buttonPanel.add(buttonPlus);

	mainPanel.add(displayPanel, BorderLayout.NORTH);
	mainPanel.add(buttonPanel, BorderLayout.CENTER);
	this.add(mainPanel);

	initialize(this);
	}
	
	class ButtonListener implements ActionListener
	{
		String output;
		public void actionPerformed(ActionEvent event)
		{
			UserInterface.display.append(output);
		}
		
		private void setOutput(String newOutput)
		{
			output = String.valueOf(newOutput);
		}
	}
	
/*	static void displayOutput(String output)
	{
		display.append(output);
	}*/

	JButton buttonSetup(String value)
	{
		JButton tempButton = new JButton(value);
		ButtonListener wasClicked = new ButtonListener();
		wasClicked.setOutput(value);
		return tempButton;
	}

	static void initialize(JFrame frame)
	{
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 300;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("AC Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
		
}
