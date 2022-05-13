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
		
		for(int i = 0; i < 9; i++)
		{
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("Comic Sans MS",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		
		firstTurn();
	}
	public void actionPerformed(ActionEvent e)
	{
		for(int i = 0; i < 9; i++)
		{
			if(e.getSource()==buttons[i])
			{
				if(player1_turn)
				{
					if(buttons[i].getText()=="");
					{
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("Player 2 turn");
						check();
							
					}
				}
				else
				{
					if(buttons[i].getText()=="");
					{
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("Player 1 turn");
						check();
							
					}
				}
			}
		}
	}
	public void firstTurn()
	{
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		if(random.nextInt(2)==0) {
			player1_turn = true;
			textfield.setText("Player 1 turn");
			
		}
		else
		{
			player1_turn=false;
			textfield.setText("Player 2 turn");
		}
		
			
		
	}
	public void check() 
	{
	if((buttons[0].getText()=="X") &&
		    (buttons[1].getText()=="X") && 
		    (buttons[2].getText()=="X")
		    )
		 {
			 player1Wins(0,1,2);
		 }
		 

		 if((buttons[3].getText()=="X") &&
		    (buttons[4].getText()=="X") && 
		    (buttons[5].getText()=="X")
		    )
		 {
			 player1Wins(3,4,5);
		 } 

		 if((buttons[6].getText()=="X") &&
		    (buttons[7].getText()=="X") && 
		    (buttons[8].getText()=="X")
		    )
		 {
			 player1Wins(6,7,8);
			 
		 }

		 if((buttons[0].getText()=="X") &&
		    (buttons[3].getText()=="X") && 
		    (buttons[6].getText()=="X")
		    )
		 {
			 player1Wins(0,3,6);
		 }
		 

		 if((buttons[1].getText()=="X") &&
		    (buttons[4].getText()=="X") && 
		    (buttons[7].getText()=="X")
		    )
		 {
			 player1Wins(1,4,7);
		 }

		 if((buttons[2].getText()=="X") &&
		    (buttons[5].getText()=="X") && 
		    (buttons[8].getText()=="X")
		    )
		 {
			 player1Wins(2,5,8);
		 }

		 if((buttons[0].getText()=="X") &&
		    (buttons[41].getText()=="X") && 
		    (buttons[8].getText()=="X")
		    )
		 {
			 player1Wins(0,4,8);
		 }

		 if((buttons[2].getText()=="X") &&
		    (buttons[4].getText()=="X") && 
		    (buttons[6].getText()=="X")
		    )
		 {
			 player1Wins(2,4,6);
		 }
		 if((buttons[0].getText()=="O") &&
				    (buttons[1].getText()=="O") && 
				    (buttons[2].getText()=="O")
				    )
				 {
					 player2Wins(0,1,2);
				 }
				 

				 if((buttons[3].getText()=="O") &&
				    (buttons[4].getText()=="O") && 
				    (buttons[5].getText()=="O")
				    )
				 {
					 player2Wins(3,4,5);
				 } 

				 if((buttons[6].getText()=="O") &&
				    (buttons[7].getText()=="O") && 
				    (buttons[8].getText()=="O")
				    )
				 {
					 player2Wins(6,7,8);
					 
				 }

				 if((buttons[0].getText()=="O") &&
				    (buttons[3].getText()=="O") && 
				    (buttons[6].getText()=="O")
				    )
				 {
					 player2Wins(0,3,6);
				 }
				 

				 if((buttons[1].getText()=="O") &&
				    (buttons[4].getText()=="O") && 
				    (buttons[7].getText()=="O")
				    )
				 {
					 player2Wins(1,4,7);
				 }

				 if((buttons[2].getText()=="O") &&
				    (buttons[5].getText()=="O") && 
				    (buttons[8].getText()=="O")
				    )
				 {
					 player2Wins(2,5,8);
				 }

				 if((buttons[0].getText()=="O") &&
				    (buttons[4].getText()=="O") && 
				    (buttons[8].getText()=="O")
				    )
				 {
					 player2Wins(0,4,8);
				 }

				 if((buttons[2].getText()=="O") &&
				    (buttons[4].getText()=="O") && 
				    (buttons[6].getText()=="O")
				    )
				 {
					 player2Wins(2,4,6);
				 }
	 }
	 
	 public void player1Wins(int a,int b, int c) 
	 {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i = 0; i < 9; i++)
		{
			buttons[i].setEnabled(false);
		}
		textfield.setText("Player 1 wins");
	 }
	 public void player2Wins(int a,int b,int c)
	 {
		 buttons[a].setBackground(Color.GREEN);
		 buttons[b].setBackground(Color.GREEN);
		 buttons[c].setBackground(Color.GREEN);
			
		for(int i = 0; i < 9; i++)
		{
			buttons[i].setEnabled(false);
		}
		textfield.setText("Player 2 wins");
	 }
}
