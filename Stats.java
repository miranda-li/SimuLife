/*=======================================
Class Stats implements ActionListener
- Gives the stats in GUI form, using information from the SimuLife game driver.
- Also includes some text to be printed using the game driver.
- Includes the final storyline of the game.
==========================================*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stats extends Choose implements ActionListener {

    private JFrame window;
    private JPanel panel;
    private JLabel[] labels;
    private JButton close;
    private JLabel label;

    public Stats() {

	window = new JFrame("GAME WINDOW");
	window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	window.setSize(2000, 300);
	window.setVisible(false);

	labels = new JLabel[6];
	for ( int i = 0; i < labels.length; i++ )
	    labels[i] = new JLabel("default");

	label = new JLabel("");

	panel = new JPanel();
	close = new JButton("CLOSE");
	close.setEnabled(true);
	close.addActionListener(this);

	panel.setLayout( new GridLayout(3, 2) );
	for ( int i = 0; i < labels.length; i++ )
	    panel.add( labels[i] );
	
	window.add(BorderLayout.NORTH, label);
	window.add(BorderLayout.CENTER, panel);
	window.add(BorderLayout.SOUTH, close);

	//window.pack();

    }//end constructor: instantiates the basic elements of GUI and sets it up


    public void clearLabels()  {
	for ( int i = 0; i < labels.length; i++ )
	    labels[i].setText("");
	label.setText("");
    }//end clearLabels(): clears the ArrayList labels for reuse
    

    public void printOut( String s ) {
	label.setText(s);
	window.setVisible(true);
    }//end printOut(): displays a GUI based on an entered string

    public void actionPerformed( ActionEvent ae ) {
	if ( ae.getSource() == close ) {
	    window.dispose();
	    clearLabels();
	}
    }//end actionPerformed(): hides the GUI window if close is clicked


    public String displayStats(int average, String social, int health, int s1, int s2, int hours, int day) {
	labels[0].setText("Grade: " + average);
	labels[1].setText("Social Life Rating: " + social);
	labels[2].setText("Health: " + health);
	labels[3].setText("Subjects: " + Student.subject[s1] + ",  " + Student.subject[s2] );
	labels[4].setText("Hour of the day: " + hours);
	labels[5].setText("Day of the week: " + day);

	return "Here are your Stats!";
    }//end displayStats(): sets the JLabels appropriately to display the stats.


    public String startDay(int average, String social, int health, int s1, int s2, int hours, int day) {
	String s = "It's a new day!  Day " + day;
	displayStats(average, social, health, s1, s2, hours, day);
	return s;
    }//end startDay()


    public String endDay(int average, String social, int health, int s1, int s2, int hours, int day) {
	String s = "Congratulations, you finished day " + day;
	displayStats(average, social, health, s1, s2, hours, day);
	return s;
    }//end endDay()




/*==================================================================
THE INITIAL AND FINAL DISPLAYS at the very beginning and end of the game.  InitialDisplay() gives you the basic info of the game, and finalDisplay() will give you a small story based on your final stat points.
===================================================================*/


    public String initialDisplay() {
	String s = "\n\n\n================================================================================================================================================================";   //perfect 2 lines of '=' signs

s+= "\n\n\n\tWelcome to SimuLife, a role playing simulation of a week at school of an average Stuyvesant High School student!";

	s+= "\n\n\tIn this game, you will play as a student, take classes, build (or destroy) your social life, maintain your GPA, and try to stay healthy at the same time!";

	s+= "\n\n\tIt will not be an easy task.  As the famous Principal Mr. Teitel once said, 'In Stuyvesant students try to get sleep, a social life, and a good average all at the same time.  This is impossible...you can only have two of the three!'";

	s+="\n\n\tTry to prove him wrong!\n\n\n\n\nHere is a bit of information about how the game works:";

	s+= "\n\n\tYou have three stats you must keep track of: grade, health, and social life.  The starting stats are grade = 83, health = 90, and social life = 0.  Your social life will also get an analysis.";

	s+= "\n\n\tThe goal of the game is to increase all three stats by interacting with other people and doing well on tests and mini-games.";

	s+= "\n\n\tYour day begins at 8AM, and the hour is recorded and displayed after each activity.  At the beginning and end of every day, you will see your stats.";

	s+= "\n\n\tThe game ends at the after a week of school, and you will get a rating and a little story about your future.";

	s+= "\n\n\nGood luck!  Read the following important information, then begin by choosing your classes.";

	s+= "\n\n================================================================================================================================================================";

	s+= information();
	return s;
    }//end initialDisplay()


    public String information() {
	String s = "\n\n\n===============================================================================================================================================================";

s+= "\n\n\n\nHere is some important information for you to know: ";

	s+= "\n\n\t1) When a GUI window opens, do NOT press the 'X' mark.  Instead, press the 'CLOSE' button when done with the mini-game or pop-up window.  Tests should close automatically.  If you do not do this VERY bad things will happen :(!";

	s+= "\n\n\t2) If, however, you want to quit the game at any time, either press the 'X' button on a GUI screen or enter Ctrl-C in terminal.";

	s+= "\n\n\t3) When you are taking tests for your classes, do NOT press the 'X' mark of the GUI or bad things will happen that you cannot solve.";

	s+= "\n\n\t4) After a GUI pops up, sometimes you might be prompted to press enter to go to the next step.  Do so.";
	
	s+= "\n\n\nOkay, enought rules, let's begin!";

	s+= "\n\n\n===============================================================================================================================================================\n\n" ;
	return s;
    }//end information()





    //FINAL DISPLAY

    public String finalDisplay(int average, int social, int health) {
	String s = "\n\n\n===============================================================================================================================================================";
	s+= "\n\n\tCongratulations, you finished the game!  Let's see how you did...It's now ten years later and this is how your life went:";

	if (average<=80)
	    s+= "\n\n\tYou were transferred to the worst high school in the city, Bronx Science, due to your poor grades. You fit in perfectly there and even became valedictorian, during your fifth year!";
	else if (average <= 85)
	    s+= "\n\n\tYou attended SUNY, and were an average student there.  You reminisce your days at Stuyvesant, regretting not having done better.";
	else if (average <= 90)
	    s+= "\n\n\tThough you could have done better, you still did pretty well and got into NYU.  Even so, one day you visited your three long lost childhood friends and found out they all got into top Ivy League colleges, making you feel incompetent and a bit scared.";
	else if (average <=95)
	    s+= "\n\n\tYou went on to attend Cornell University and graduated at the top of the class. An amazing accomplishment for a dedicated scholar.  Later you started your own business and became $$rich$$.";
	else if (average <=97)
	    s+= "You attended Harvard University in Boston, surrounded by people just like you, smart and successful. You graduated with honors and later won two Nobel Prizes, one in medicine and one in peace.";
	else //average from 98 - 100
	    s+= "You attended the best College in the US, drum roll please......Borough of Manhattan Community College, or BMCC, the college where dreams come true!";


	if (social < 2)
	    s+= "\n\n\tIn high school, you had no friends. You still don't have any. You live at home, with your parents, who are secretely planning to abandon you. You want to change, but aren't making enough of an effort to really do so.  To make it up to yourself you create facebook accounts and add them as friends, so at least you can see that you have 500 'friends' on facebook.";
	else if (social < 4) 
	    s+= "\n\n\tYou didn't have many friends throughout your years at Stuy, but you did find your niche in college, where you made some good friends. You later got married to your Sophomore year college biology lab partner.  You had a rocky relationship but managed to get married and have some kids.";
	else if (social < 6)
	    s+= "\n\n\tYou've always had a small group of close friends, and maintained one throughout college. You've had good relationships not only with them, but great ones with all members of your family. You moved in with your long term partner, married, and had two children.  This is the dream of many people in America, but somehow - just somehow - your life seems a bit too boring for you.  Oh well, nothing can change anymore.";
	else if (social < 8)
	    s+= "\n\n\tYour social life is probably just right.  You have a large group of faithful and dedicated friends who helped you jumpstart your career and buy a house.  You've had a good number of boyfriends/girlfriends, but in the end the person you married was love-at-first-sight to you.  Your good fortune, however, made some of your friends jealous, so they turned their backs on you.  Who else do you think caused that fire in your house the second you bought it, before having insurance?  Yep, it was your crazy friend Sarah.";
	else 
	    s+= "\n\n\tYou are almost too popular for your own good.  You and your date become Prom King and Queen in high school and college, and you later had a different boyfriend/girlfriend every month.  You have guys AND girls chasing after you (and of course you've had the occasional gay/lesbian relationship)... In the end you never settle down but you have a very fun and exciting social life.";


	if (health <= 85)
	    s+= "\n\n\tBecause you never got enough sleep in high school and were stressed out all the time, you have acquired some sleeping disorders and died at age 30, diagnosed with heart disesase, skin cancer, acquired diabetes, and overall disease.";
	else if (health <=90)
	    s+= "\n\n\tYou used to pull the occasional all nighter, but overall you were somewhat healthy. Even so, you've never been really smart when it comes to health. You die at age 40, when you took a drug whose side effects included headaches, nausea, irregular sleep, craziness, and death.  Looks like ALL of the side effects were pretty accurate!";
	else if (health <=95)
	    s+= "\n\n\tYou're a pretty healthy person!  You swam in the summer and skied in the winter, consistently, all the way until you were 50 years od!  Everyone in your family is impressed with your endurance and overall good health.  You might have lived even longer than to 90 if you had not volunteered at a doctors without borders camp in Africa and caught a mysterious long term disease that ate away at your insides.";
	else 
	    s+= "\n\n\tYou'd never pulled an all nighter, and never planned to. Your Health was always most important to you and you are now a healthy human being.  You die at age 150, the oldest age a person has ever lived.  Well, that is until one year after your death some scientists discovered the Cure to Old Age.";

	return s;
    }//end finalDisplay()




    public static void main( String[] args ) {
	Stats a = new Stats();
	a.printOut ( a.startDay( 23, "Antisocial: nobody likes you, you suck too much!", 90, 0 , 2, 7, 5 ));
	a.printOut ( a.startDay( 23, "Antisocial: nobody likes you, you suck too much!", 90, 0 , 2, 7, 5 ));
    }//end main()
   

}//end class Stats