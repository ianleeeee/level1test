package level1test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorTeacher implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton yellow;
	JButton blue;
	JButton red;
	JButton green;

	public static void main(String[] args) {
		colorTeacher x = new colorTeacher();
	}

	colorTeacher() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		yellow = new JButton();
		blue = new JButton();
		red = new JButton();
		green = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		red.setBackground(Color.red);
		red.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		green.setBackground(Color.green);
		green.setOpaque(true);
		frame.pack();
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==yellow) {
			speak("yellow");
		}
		if (e.getSource()==red) {
			speak("red");
		}
		if (e.getSource()==blue) {
			speak("blue");
		}
		if (e.getSource()==green) {
			speak("green");
		}

	}

	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " +words);
			}
		catch(IOException e){
			e.printStackTrace();
		}
		}


}
