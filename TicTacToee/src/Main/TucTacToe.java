package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TucTacToe implements ActionListener{
	
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
	
	
	TucTacToe() {

		frame.setTitle("TucTacToe"); //title of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit of application
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Hall Of Fame");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));
		
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	public void firstTurn()
	{
		
		
	}
	 public void check() 
	 {
		 
	 }
	 
	 public void player1Wins(int a,int b, int c) {
		 
	 }
	 public void player2Wins(int a,int b,int c)
	 {
		 
	 }
}
