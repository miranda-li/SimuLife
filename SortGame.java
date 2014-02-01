/*==========================================
SortGame class
- a mini game that uses sorting and searching to create a mini game for sorting.
=========================================*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SortGame extends Choose implements ActionListener {

    private JFrame window;
    private JPanel window2;
    private JButton close;
    private JButton done;
    private JTextField textField;
    private JLabel label;

    private int[] numbers;
    private int[] numbers2;
    private JLabel numb;
    private JButton[] ans;
    private int counter;
    public long time;
    public boolean won;


    public SortGame() {

	window = new JFrame( "SORTING MINI GAME" );
	window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	window2 = new JPanel();
	
	ans = new JButton[10];
	for (int i = 0; i < ans.length; i++) {
	    ans[i] = new JButton();
	    ans[i].setEnabled(true);
	    ans[i].addActionListener(this);
	}
	numbers = new int[10];
	for (int i = 0; i < numbers.length; i++) {
	    int random = (int) (Math.random() * 3000);
	    numbers[i] = random;
	    ans[i].setText("" + random);
	}
	
	done = new JButton();
	done.setText("DONE");
	done.addActionListener(this);
	done.setEnabled(false);

	window2.setLayout(new GridLayout( 2, 5 ));
	
	numbers2 = numbers;
	numbers = sort(numbers);
	numb = new JLabel("NUMBERS TO SORT: " + numbers2[0] + " " + numbers2[1] + " " + numbers2[2]+ " " + numbers2[3]+ " " + numbers2[4]+ " " + numbers2[5]+ " " + numbers2[6]+ " " + numbers2[7]+ " " + numbers2[8]+ " " + numbers2[9]);

	window.add( BorderLayout.NORTH, numb );
	window.add( BorderLayout.CENTER, window2 );
	window.add( BorderLayout.SOUTH, done );

	for (int i = 0; i < ans.length; i++)
	    window2.add(ans[i]);

	window.setSize( 500, 400 );
	window.setVisible(true);
	counter = 0;
       	time = System.currentTimeMillis();
	won = false;
	
    }//end constructor
    
    
    
    public void actionPerformed( ActionEvent ae ) {
	JButton source = (JButton)ae.getSource();
	if (source == done) {
	    window.dispose();
	    time = System.currentTimeMillis() - time;
	}
	else if (Integer.parseInt(source.getText()) == (numbers2[counter]))
	    won = won;
	else 
	    won = false;

	counter++;
	source.setEnabled(false);

	if (counter > 9) {
	    for (int i = 0; i<ans.length; i++) {
		ans[i].setEnabled(false);
		done.setEnabled(true);
	    }
	}
    }//end actionPerformed()
    
    

    public int[] sort( int[] array ) {
	int[] ar = array;
	for(int p = 1; p < ar.length; p++){  
	    int t = ar[p];    
	    int i = p;
	    while(i > 0 && t < ar[(i-1)]){      
		ar[i] = ar[i-1];
		i--;
	    }
	    ar[i] = t;
	}
	return ar;
    }//end sort()

    
    public static void main (String[] args) {
	SortGame af = new SortGame();
    }//end main()

}//end class SortGame