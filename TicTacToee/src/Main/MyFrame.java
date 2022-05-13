/*package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	MyFrame(){
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBackground(Color.green);
		playerPanel.setBounds(0,0,20,50);
		
		
		
		JLabel label = new JLabel();
		label.setText("Hall of fame"); // set text of label
		label.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		label.setVerticalAlignment(JLabel.TOP); // set vertical position
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position
		label.setBounds(145,20,250,70);
		
		
		this.setTitle("TucTacToe"); //title of the window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit of application
		this.setSize(800,800); 
		this.setVisible(true);
		
		
		this.getContentPane().setBackground(Color.yellow); //change color of background
		this.add(label);
		this.add(playerPanel);
	}


}
*/