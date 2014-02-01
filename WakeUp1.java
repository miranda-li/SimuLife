/*=========================================
WakeUp game class
- a mini game, with a grid of buttons that become enabled and disabled.
========================================*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WakeUp1 extends Choose implements ActionListener {
    
    private JFrame window;
    private JPanel window2;
    
    private JPanel buttonsGrid;
    private JButton[][] buttons;
    
    private JButton close;
    private JButton done;
    private JLabel label;
    
    private int score;
    private long time;
    
    public WakeUp1() {

	window = new JFrame( "WAKE UP MINI GAME" );
	window.setSize( 700, 700 );
	window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	buttonsGrid = new JPanel();
	buttonsGrid.setLayout( new GridLayout(5, 5) );

	buttons = new JButton[5][5];
	for ( int i = 0; i < buttons.length; i++ )
	    for ( int e = 0; e < buttons[i].length; e++ ) {
		buttons[i][e] = new JButton("Wake Up!");
		buttons[i][e].setEnabled(true);
		buttons[i][e].addActionListener(this);
		buttonsGrid.add( buttons[i][e] );
	    }
	
	close = new JButton("CLOSE");
	done = new JButton("DONE");
	close.addActionListener(this);
	done.addActionListener(this);
	close.setEnabled(false);
	done.setEnabled(false);
	
	label = new JLabel("Score: ");
	
	window.add( BorderLayout.NORTH, label );
	window.add( BorderLayout.CENTER, buttonsGrid );
	window.add( BorderLayout.SOUTH, close );
	window.add( BorderLayout.WEST, done );
	
	window.setVisible(true);
	score = 0;
	runGame();
    }//end constructor
    
    
    public void runGame() {
	time = System.currentTimeMillis();
	
	while ( score < 20 ) {  //CHANGE FOR LATER
	    
	    int a = (int)( Math.random() * 5 );
	    int b = (int)( Math.random() * 5 );
	    buttons[a][b].setText("Here");
	    
	    try {
		Thread.sleep(900);
            } 
	    catch (InterruptedException ie) {
		System.out.println("sleep was interrupted");
            }
	    buttons[a][b].setText("Wake Up!");
	}
	time = System.currentTimeMillis() - time;
	
	done.setEnabled(true);

    }//end runGame()
   
    
    public void actionPerformed( ActionEvent ae ) {
	/*if ( ae.getSource() == close ) {
	    window.dispose();
	    }*/
	
	if ( ae.getSource() == done ) {
	    window.dispose();
	}
	
	for ( int i = 0; i < buttons.length; i++ )
	    for ( int e = 0; e < buttons[i].length; e++ )
		if ( ((JButton)(ae.getSource())).getText().equals("Here")) {
		    score++;
		    label.setText("Score : " + score);
		    ((JButton)ae.getSource()).setText("Wake Up!");
		}
	
    }//end actionPerformed
    

    public boolean won() {
	if ( time < 25000 )   //CHANGE FOR LATER
	    return true;
	return false;
    }//end won()

    public long getTime() {
	return time;
    }//end getTime()
    

    public static void main (String[] args) {
	WakeUp1 a = new WakeUp1();
	System.out.println( a.time );
    }//end main()
    
}//end class WakeUp