/*=========================================
Test Class

A superclass for all the test games, involves GUI
=========================================*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends Choose implements ActionListener{

    public JFrame window;
    public JPanel window2;
    public JPanel window3;
    public JButton[] choices;
    public JButton quit;
    public String answer;
    public JLabel questionLabel;
    public JButton actionStuff;
    public boolean answered;
    public boolean right;
    private Tests caller;
    private JPanel panelo;
    public boolean over;

    
    public Test(String putquestion, String answer0, String answer1, String answer2, String answer3, String answeryes, Tests caller) {
	window = new JFrame();
	window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	this.caller = caller;
	answered = false;
	window2 = new JPanel();
	window3= new JPanel();
	JLabel questiontext = new JLabel("                                                                                                                                                                " + putquestion);
	choices = new JButton[4];

	panelo = new JPanel();
	panelo.setLayout (new GridLayout (2, 2) );
	
	for ( int i = 0; i < choices.length; i++ ) {
	    answer = answeryes;
	    if (i == 0)
		choices[i] = new JButton(answer0);
	    if (i == 1)
		choices[i] = new JButton(answer1);
	    if (i == 2)
		choices[i] = new JButton(answer2);
	    if (i == 3)
		choices[i] = new JButton(answer3);
	    
	    choices[i].setVisible(true);
	    choices[i].setEnabled(true);
	    choices[i].addActionListener(this);
	    panelo.add(choices[i]);
	}
	
	questionLabel = new JLabel("");
	window.setVisible(true);
	window.add(window2);
	window.add(window3);
	JLabel temp = new JLabel("'At high school age, you can tell who is best at taking tests and going to school, but you can't tell who the best people are. That worries the hell out of me.' - Barnaby C. Keeny");

	window.add( BorderLayout.SOUTH, temp );
	window.add( BorderLayout.CENTER, panelo );
	window.add( BorderLayout.NORTH, questiontext );
	
	window.setSize( 1100, 200 );
    }//end constructor
    
    public void actionPerformed( ActionEvent ae ) {
	actionStuff = (JButton)ae.getSource();
	if ((actionStuff.getText()).equals(answer)) {
	    right = true;
	    caller.accountForSuccessfulTest();
	}
	else right = false;
	answered = true;
	caller.on += 1;
	if (caller.on == 5) {
	    System.out.println("\n\nYou just finished the test and received a score of: " + caller.answeredright + " out of 5. \n\n\nPRESS ENTER TO CONTINUE");
	    window.dispose();
	    cont2();
	    over = true;
	    
	}
	if (over){
	    window.dispose();
	}
	if (answered) {
	    endGame();
	}
    }//end actionPerformed()
    
    public void setTextButton(JButton HELLO, String text) {
	HELLO.setText(text);
    }
    
    public void endGame() {
	window.dispose();
    }//end endGame()
    
    public static void main(String[] args) {
    }//end main()
    
}//end class Test
