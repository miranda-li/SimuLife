/*=========================================
MEMORY GAME

A class for a social game.
=========================================*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Memory extends Choose implements ActionListener {

    private JFrame window1;
    private JFrame window;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label;
    private JLabel label2;

    private JButton[] numbers;
    private int[] phone;
    private int numEntered;
    private int[] recordedNum;
    private int upTo;
    private String phonen;
    private String s;

    private JButton done;
    private JButton close;

    private boolean correct;

    public Memory() {
	upTo = 1;
	correct = true;
	numEntered = 0;
	panel1 = new JPanel();
	window = new JFrame("MEMORY GAME");
	window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	window.setVisible(false);

	done = new JButton("DONE");
	close = new JButton("CLOSE");
	done.setEnabled(false);
	close.setEnabled(false);
	done.addActionListener(this);
	close.addActionListener(this);

	s = "Numbers entered so far: ";
	label = new JLabel(s);
	numbers = new JButton[12];
	phone = new int[10];
	for ( int i = 0; i < 9; i++ ) {
	    numbers[i] = new JButton();
	    numbers[i].setText("" +(1 + i));
	    numbers[i].setEnabled(true);
	    numbers[i].addActionListener(this);
	}
	numbers[10] = new JButton();
	numbers[10].setText("0");
	numbers[10].setEnabled(true);
	numbers[10].addActionListener(this);

	numbers[9] = new JButton();
	numbers[9].setText("");
	numbers[9].setEnabled(false);
	numbers[11] = new JButton();
	numbers[11].setText("");
	numbers[11].setEnabled(false);
	    
	phonen = "";
	for (int i = 0; i<phone.length; i++) {  //creates random phone number
	    phone[i] = (int)(Math.random() * 10);
	    phonen += phone[i];
	}

	window.setSize(500, 500);
	window.add( BorderLayout.NORTH, label );

	panel1.setLayout ( new GridLayout(4, 3) ); //panel 1 contains the buttons
	for (int i = 0; i < numbers.length; i++) {
	    panel1.add (numbers[i]);
	}

	window.add( BorderLayout.CENTER, panel1 );
	window.add( BorderLayout.SOUTH, close );
	window.add( BorderLayout.WEST, done );



	window1 = new JFrame("REMEMBER THIS");
	window1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	label2 = new JLabel("Remember this phone number!  Quick!");
	label1 = new JLabel("                                             " + phonen);
 
	window1.add( BorderLayout.NORTH, label2 );
	window1.add( BorderLayout.SOUTH, label1 );
	window1.setSize(400, 100);

	window1.setVisible(true);
	try { Thread.sleep(15000);
	}
	catch (InterruptedException ie) {
	    System.out.println("sleep was interrupted");
	}
	label1.setText("                                Now, enter it on the next screen!");
	try { Thread.sleep(3000);
	}
	catch (InterruptedException ie) {
	    System.out.println("sleep was interrupted");
	}


	window1.dispose();
	window.setVisible(true); 
	correct = true;

	//runGame();
    }//end constructor



	    /*public void runGame() {
so far game runs in constructor
	      }//end runGame()*/
	    
    public void actionPerformed ( ActionEvent ae ) {


	if ( ae.getSource() == done ) {
	    window.dispose();
	    System.out.println("\n\n\tThe correct number was " + phonen + ".  Lets see if you got it right...");
	    cont();
	}

	if ( ae.getSource() == close )
	    window.dispose();

	JButton source = (JButton)ae.getSource();

	if (  source.equals(numbers[0])  ||source.equals(numbers[1])  ||source.equals(numbers[2])  ||source.equals(numbers[3])  ||source.equals(numbers[4])  ||source.equals(numbers[5])  ||source.equals(numbers[6])  ||source.equals(numbers[7])  ||source.equals(numbers[8])  ||source.equals(numbers[10])  ) {
		int but= Integer.parseInt(((JButton)ae.getSource()).getText());
		if (! (but == phone[upTo-1]) )
		    correct = false;
		upTo++;
		s+= but;
		label.setText(s);
		if (upTo > 10) {
		    done.setEnabled(true);
		    for (int i = 0; i < numbers.length; i++)
			numbers[i].setEnabled(false);
		}
	    }
	
    }//end actionPerformed
    
    
    public boolean wonOrNot() {
	return correct;
    }//end wonOrNot()
    
    
    public static void main( String[] args ) {//for testing purposes only
	Memory a = new Memory();
    }//end main()

}//end class Memory