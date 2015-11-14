import javax.swing.*;
import java.awt.event.*;

public class SwingObservers {
	JFrame frame;

	public static void main (String[] args){
		SwingObservers example = new SwingObservers();
		example.go();
	}

	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(button);

		frame.pack();
		frame.setVisible(true);
	}

	class AngelListener implements ActionListener {
		public void actionPerformed (ActionEvent event){
			System.out.println("Don't do it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed (ActionEvent event){
			System.out.println("Do It!!!");
		}
	}
}
