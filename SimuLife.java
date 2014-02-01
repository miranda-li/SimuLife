/*===================================================
SimuLife Class extends Choose 
- Runs the game and goes through the storyline and uses all the other classes

Instance Variables
- int day: when 5 days are up, the game will end.
- int hours: starts at 8AM.
- Student a: to keep track of the student instance variables.
- Stats b: to display pop up GUI and some text throughout the game.

Methods
- nextHour (runs the day)
- constructor: runs the whole game
===================================================

Schedule
	   1. waking up (clicking buttons) -if you fail to do this you will miss period 1.
	   2. going to school -if you fail at this your health goes down.
	   3. period 1 (test/no test)
	   4. lunch --> options to choose from
	   5. period 2 (test/no test)
	   6. afterschool 
	   7. afterschool - AFTERSCHOOL: increase your social life with a memory game
	   8. afterschool

-Display of stats

Subjects
0 = Math
1 = History
2 = Science

===================================================

LEFT TO DO!!!
nothing! :D

==================================================*/

import java.io.*;
import java.util.*;

public class SimuLife extends Choose {

    //INSTANCE VARIABLES
    //===========================================================================
    public int hours;
    public int day;
    public Student a;
    public Stats b;
    public boolean choicee;
    HistoryTest history;
    ScienceTest science;
    MathTest math;
    Memory hello;
    int ib;
    String ch;
    SortGame boohoo;
    //===========================================================================

    public SimuLife() {
	a = new Student();
	b = new Stats();
	System.out.println ( b.initialDisplay() );
	a.chooseClasses();
	day = 1;	
 	hours = 0; //CHANGE FOR LATER
	cont();

	while (day < 6) {
	    nextHour();
	    day++;
	}
	
	b = new Stats();
	System.out.println( b.finalDisplay( a.average, a.socialStanding, a.health) );
    }//end constructor

    
    /*==========================================================================
      Method NextHour: runs a day of school, calling different methods.
      ========================================================================*/
    public void nextHour() {
	if (hours == 0) { //The Wake up game
	    runWakeUp();
	    nextHour();
	}
	
	else if (hours == 1) {//The going to school game (on subway), sorting
	    runSortGame();
	    hours++;
	    nextHour();
	}
	else if (hours == 2) {//First period class
	    if (a.subject1 == 0) {
		runMathTest();
	    }
	    if (a.subject1 == 1) {
		runHistoryTest();
	    }
	    if (a.subject1 == 2) {
		runScienceTest();
	    }
	    hours++;
	    nextHour();
	}
	else if (hours == 3) {//Lunch
	    runLunch();
	    hours++;
	    nextHour();
	}
	else if (hours == 4) {//Second class
	    if (a.subject2 == 0) {
		runMathTest();
	    }
	    if (a.subject2 == 1) {
		runHistoryTest();
	    }
	    if (a.subject2 == 2) {
		runScienceTest();
	    }
	    hours++;
	    nextHour();
	}
	else if (hours == 5) {//afterschool
	    runAfterSchool();
	    hours++;
	    nextHour();
	}
	else if (hours == 6) {//afterschool
	    runAfterSchool();
	    hours++;
	    nextHour();
	}
	else if (hours == 7) {//afterschool
	    runAfterSchool();
	    hours++;
	    nextHour();
	}

	else if (hours == 8) {//day done!
	    if (a.average > 100)
		a.average = 100;
	    if (a.socialStanding < 0)
		a.socialStanding = 0;
	    if (a.socialStanding > 10)
		a.socialStanding = 10;

	    b = new Stats();
	    b.printOut( b.endDay( a.average, a.socialGetWithString(), a.health, a.subject1, a.subject2, hours, day ) );
	    cont();
	    hours = 0;
	    finishDay();
	}
	
    }//end nextHour()




    /*========================================================================================================
      Methods runMathTest(), runHistoryTest(), and runScienceTest()
      - runs each test based on subject choice.
      - Calls on classes MathTest, HistoryTest, and ScienceTest
      
      Method testDirections()
      -returns a String to make sure the other methods aren't too cluttered.
      =====================================================================================================*/

    public String testDirections() {
	String s = "\n\n\tDirections for taking the test: ";
	s+= "\n\n\t1) The test will contain 5 questions on the subject of the class.  When the GUI window pops up, just click the answer to the question, and the window will automatically dissapear, displaying the one behind it (which contains the next question).";
	s+= "\n\n\t2) Do not press the 'X' of the GUI window unless you want to QUIT THE WHOLE PROGRAM.  If you just want to end the testing, guess all the questions randomly.";
	s+= "\n\n\t3) The average number of questions students get correct is 3 out of 5.  Your average will be raised by your score - 3 (it will be lowered if that is a negative number).  The number correct will be displayed in the terminal after all GUI windows are closed.";
	s+= "\n\n\t4) Good luck and let's begin!\n\n";
	return s;
    }

    public void runMathTest() {
	String s = "\n\n================================================================================";
	s+= "\n\n\tMath CLASS START";
	s+= "\n\n================================================================================";
	if (hours == 2 )
	    s+= "\n\n\tWelcome to your FIRST CLASS OF THE DAY: Math!";
	else
	    s+= "\n\n\tWelcome to your SECOND CLASS of the day: Math!";
	s+= "Every day you have a class, you have a chance of having a test.  You may choose to cheat on the test and get a better grade, or take it!  On the days you don't have tests you may choose to cut class, which will raise your social standing as long as you don't get caught.  If you do, your average will drop!  My advice?  Be brave, be awesome, be smart!";
	System.out.println(s);

	if (Math.random() > 0.3) {
	    System.out.println("\n\n\tOh NO! Your Math teacher is giving you a Test today...You may either cheat, with a 66% chance of getting caught, or take the test.  If you cheat successfully, your average will be raised by 2 points.  If you get caught, however, it will be lowered.  High risk high reward!");
	    System.out.println("\n\n\tKey in:\n\n\t0: for cheating\n\n\t1: for Taking the test");
	    choicee = true;
	    while (choicee) {
		ib = chooseInt(ch);
		if ((ib < 2) && (ib > -1)) {
		    choicee = false;
		    if (ib == 0)
			if (Math.random() < 0.66) {
			    System.out.println("\n\n\tSo you tried to cheat, huh?  Well...OH NO! You were caught cutting in the hall way by Mr Tillman! Your average will be lowered by 2 points");
			    a.average-= 2;
			}
			else {
			    System.out.println("\n\n\tYou successfully cheated! Good job! Your average will be raised by 2 points");
			    a.average+=2;
			}

		    if (ib == 1) {
			System.out.println("\n\n\tLike any good student, you decided to take the test.  Good choice, and get Ready For The Math Test!!! YAY!  A few things to keep in mind: please do not press the close 'X' button because it will stop the program!  (I told you about this in the instructioons at the beginning, so if you actually press it I suggest cheating next time because you obviously do not have the mental capacity to pass the test...\n\n\tWell enough insulting, let's go!");
			cont();
			math = new MathTest(a.testDifficulty);
			int scores= math.answeredright;
			a.average+= (scores - 3);
		    }
		}
	    }
	}

	else {
	    System.out.println("\n\n\tOkay, you don't have a Math test today!  You may cut the class, and hang out with your friends, increasing your social standing, or go to class and increase your average (but if you're got you lose points)...\n\n\t Key in: \n\n\t0 for cutting\n\n\t1 for going to class");
	    choicee = true;
	    while (choicee) {
		ib = chooseInt(ch);
		if ((ib < 2) && (ib > -1)) {
		    choicee = false;
		    if (ib == 0)
			if (Math.random() < 0.66) {
			    System.out.println("\n\n\tTried to cut MATH class, did you?  Well...OH NO! You were caught cutting in the hall by Mr. Tillman, and your average was lowered by 2 points!  Be a good student next time, delinquent!");
			    a.average-= 2;
			}
			else {
			    System.out.println("\n\n\tWell, you successfully cut Math! Good job! Your social standing will be raised by 1 point because you're cool like that.  But WHY ARE you not going to your FREE EDUCATION?  You don't want to have to sit through the class and learn, you say?  You don't want to  learn from your FREE education? #firstworldproblems.");
			    a.socialStanding++;
			}
		    
		    else {
			System.out.println("\n\n\tLike any other good student, you went to class! Your average was raised.  And if you're regretting your choice, here are some wise words from the amazing creators of this game: cutting class is not using your FREE EDUCATION opportunities.  What?  You say that you don't want to learn that much from your FREE education? #firstworldproblems.  Well, you did go to class.  Good job!");
			a.average++;
		    }
		}
	    }
	}
    }//end runMathTest()



    public void runHistoryTest() {
	String s = "\n\n================================================================================";
	s+= "\n\n\tHistory CLASS START";
	s+= "\n\n================================================================================";
	if (hours == 2 )
	    s+= "\n\n\tWelcome to your FIRST CLASS OF THE DAY: History!";
	else
	    s+= "\n\n\tWelcome to your SECOND CLASS of the day: History!";
	s+= "Every day you have a class, you have a chance of having a test.  You may choose to cheat on the test and get a better grade, or take it!  On the days you don't have tests you may choose to cut class, which will raise your social standing as long as you don't get caught.  If you do, your average will drop!  My advice?  Be brave, be awesome, be smart!";
	System.out.println(s);

	if (Math.random() > 0.3) {
	    System.out.println("\n\n\tOh NO! Your History teacher is giving you a Test today...You may either cheat, with a 66% chance of getting caught, or take the test.  If you cheat successfully, your average will be raised by 2 points.  If you get caught, however, it will be lowered.  High risk high reward!");
	    System.out.println("\n\n\tKey in:\n\n\t0: for cheating\n\n\t1: for Taking the test");
	    choicee = true;
	    while (choicee) {
		ib = chooseInt(ch);
		if ((ib < 2) && (ib > -1)) {
		    choicee = false;
		    if (ib == 0)
			if (Math.random() < 0.66) {
			    System.out.println("\n\n\tSo you tried to cheat, huh?  Well...OH NO! You were caught cutting in the hall way by Mr Tillman! Your average will be lowered by 2 points.  Think before you act next time, cheating is bad!");
			    a.average-= 2;
			}
			else {
			    System.out.println("\n\n\tYou successfully cheated! Good job(not that cheating is a good thing)! Your average will be raised by 2 points");
			    a.average+= 2;
			}

		    if (ib == 1) {
			System.out.println("\n\n\tLike any good student, you decided to take the test.  Good choice, and get Ready For The History Test!!! YAY!  A few things to keep in mind: please do not press the close 'X' button because it will stop the program!  (I told you about this in the instructioons at the beginning, so if you actually press it I suggest cheating next time because you obviously do not have the mental capacity to pass the test...\n\n\tWell enough insulting, let's go!");
			cont();
			history = new HistoryTest(a.testDifficulty);
			int scores= history.answeredright;
			a.average+= (scores - 3);
		    }
		}
	    }
	}

	else {
	    System.out.println("\n\n\tOkay, you don't have a test today!  You may cut the class, and hang out with your friends, increasing your social standing, or go to class and increase your average (but if you're got you lose points)...\n\n\t Key in: \n\n\t0 for cutting\n\n\t1 for going to class");
	    choicee = true;
	    while (choicee) {
		ib = chooseInt(ch);
		if ((ib < 2) && (ib > -1)) {
		    choicee = false;
		    if (ib == 0)
			if (Math.random() < 0.66) {
			    System.out.println("\n\n\tTried to cut, did you?  Well...OH NO! You were caught cutting, and your average was lowered by 2 points!  Be a good student next time, delinquent!");
			    a.average-= 2;
			}
			else {
			    System.out.println("\n\n\tWell, you successfully cut HISTORY class! Good job! Your social standing will be raised by 1 point because you're cool like that.  But WHY ARE you not going to your FREE EDUCATION?  You don't want to have to sit through the class and learn, you say?  You don't want to  learn from your FREE education? #firstworldproblems.");
			    a.socialStanding++;
			}
		    else {
			System.out.println("\n\n\tLike any other good student, you went to HISTORY class! Your average was raised.  And if you're regretting your choice, here are some wise words from the amazing creators of this game: cutting class is not using your FREE EDUCATION opportunities.  What?  You say that you don't want to learn that much from your FREE education? #firstworldproblems.  Well, you did go to class.  Good job!");
			a.average++;
		    }
		}
	    }
	}
    }//end runHistoryTest()


    public void runScienceTest() {
	String s = "\n\n================================================================================";
	s+= "\n\n\tScience CLASS START";
	s+= "\n\n================================================================================";
	if (hours == 2 )
	    s+= "\n\n\tWelcome to your FIRST CLASS OF THE DAY: Science!";
	else
	    s+= "\n\n\tWelcome to your SECOND CLASS of the day: Science!";
	s+= "Every day you have a class, you have a chance of having a test.  You may choose to cheat on the test and get a better grade, or take it!  On the days you don't have tests you may choose to cut class, which will raise your social standing as long as you don't get caught.  If you do, your average will drop!  My advice?  Be brave, be awesome, be smart!";
	s+= "\n\n================================================================================";
	System.out.println(s);

	if (Math.random() > 0.3) {
	    System.out.println("\n\n\tOh NO! Your Science teacher is giving you a Test today...You may either cheat, with a 66% chance of getting caught, or take the test.  If you cheat successfully, your average will be raised by 2 points.  If you get caught, however, it will be lowered.  High risk high reward!");
	    System.out.println("\n\n\tKey in:\n\n\t0: for cheating\n\n\t1: for Taking the test");
	    choicee = true;
	    while (choicee) {
		ib = chooseInt(ch);
		if ((ib < 2) && (ib > -1)) {
		    choicee = false;
		    if (ib == 0)
			if (Math.random() < 0.66) {
			    System.out.println("\n\n\tSo you tried to cheat, huh?  Well...OH NO! You were caught cutting in the hall way by Mr Tillman! Your average will be lowered by 2 points.  Next time think before you act...cheating is bad.");
			    a.average-= 2;
			}
			else {
			    System.out.println("\n\n\tYou successfully cheated! Good job (not that cheating is a good thing)! Your average will be raised by 2 points");
			    a.average++;
			    a.average++;
			}

		    if (ib == 1) {
			System.out.println("\n\n\tLike any good student, you decided to take the test.  Good choice, and get Ready For The Science Test!!! YAY!  A few things to keep in mind: please do not press the close 'X' button because it will stop the program!  (I told you about this in the instructioons at the beginning, so if you actually press it I suggest cheating next time because you obviously do not have the mental capacity to pass the test...\n\n\tWell enough insulting, let's go!");
			cont();
			science = new ScienceTest(a.testDifficulty);
			int scores= science.answeredright;
			a.average+= (scores - 3);
		    }
		}
	    }
	}
	
	else {
	    System.out.println("\n\n\tOkay, you don't have a Science test today!  You may cut the class, and hang out with your friends, increasing your social standing, or go to class and increase your average (but if you're got you lose points)...\n\n\t Key in: \n\n\t0 for cutting\n\n\t1 for going to class");
	    choicee = true;
	    while (choicee) {
		ib = chooseInt(ch);
		if ((ib < 2) && (ib > -1)) {
		    choicee = false;
		    if (ib == 0)
			if (Math.random() < 0.66) {
			    System.out.println("\n\n\tTried to cut, did you?  Well...OH NO! You were caught cut, and your average was lowered by 2 points!  Be a good student next time, delinquent!");
			    a.average-= 2;
			}
			else {
			    System.out.println("\n\n\tWell, you successfully cut SCIENCE class! Good job! Your social standing will be raised by 1 point because you're cool like that.  But WHY ARE you not going to your FREE EDUCATION?  You don't want to have to sit through the class and learn, you say?  You don't want to  learn from your FREE education? #firstworldproblems.");
			    a.socialStanding++;
			}
		    else {
			System.out.println("\n\n\tLike any other good student, you went to SCIENCE class! Your average was raised.  And if you're regretting your choice, here are some wise words from the amazing creators of this game: cutting class is not using your FREE EDUCATION opportunities.  What?  You say that you don't want to learn that much from your FREE education? #firstworldproblems.  Well, you did go to class.  Good job!");
			a.average++;
		    }
		}
	    }
	}
    }//end runScienceTest








    /*==================================================================================
      Methods runWakeUp(), runMemory(), and runSortGame()
      - Runs each appropriate method by calling the classes
      ===============================================================================*/


    public void runWakeUp() {
	String s = "\n\n================================================================================";
	s+= "\nWAKEUP GAME START";
	s+= "\n================================================================================";
	if (hours == 0) {
	    s+= "\n\n\tIT'S A NEW DAY!!!!";
	    s+= "\n\n\tThe first game of the day: can you wake up in time?  Your alarm has rung but you are tempted to hit the snooze button.";
	}
    	else  
	    s+= "\n\n\tIt's lunch time and you've decided to sleep! Now, try to wake up to be on time for your next class.";

	s+= "\n\n\tRules: There will be a grid of buttons which say 'Wake Up!'  For a very brief time, a random one will change its text to 'Here'.  When you click that button, you will gain points.  You must get a score of 20 as quickly as possible, because the time you take to do so will determine if you wake up or not (you must finish under 25 seconds!).  Press done when finished.  If you fail this game, you will miss your next period class!\n\n\tAre you ready to begin?  Enter any key to start!\n"; 
	System.out.println(s);
	String t = "";
	t = chooseString(t);

	WakeUp1 hiThere = new WakeUp1();

	System.out.println("Game finished!");
	cont();
	long time = hiThere.getTime();
	boolean won = hiThere.won();
	String eval = "\n\n================================================================================";
	eval+= "\n\nEND GAME WAKE UP.  The time you took was " + time + " milliseconds.";
	eval+= "\n\n================================================================================";
	
	if (!won) {
	    a.average--;
	    a.socialStanding--;
	    if (a.socialStanding < 0)
		a.socialStanding = 0;
	    
	    eval += "\n\n\tSince you spent such a long time (you had to do it under 25 seconds or 25000 milliseconds) you MISSED YOUR NEXT class.  Ouch, your teacher is NOT going to be happy that you're late, so your AVERAGE has dropped.  Since waking up late is not COOL at all, your SOCIAL STANDING also dropped a bit.  You'd better make a note to yourself to wake up properly next time!";
	    
	    if (hours == 0) {
		eval+= "\n\n\tLuckily for you, your parents were kind enough to drive you to school (even though they shouted at you the entire trip there).  You missed your first class but got to school just in time for lunch...";
		hours = 3;
	    }
	    else {
		eval+= "\n\n\tYou wake up, alone, having missed your second class of the day.  School has ended, and you decide to put this behind you and move on with life.";
	    }
	}
	
	else {
	    eval += "\n\n\tCongrats, you did well meaning you resisted your urges to sleep and woke up on time!  Nothing good really comes out of this, but at least you won't be late for your classes and be humiliated.\n\n";
	    hours++;
	}
	System.out.println(eval);
	cont();
    }//end runWakeUp()
    
    



    public void runMemory() {
	String s = "\n\n================================================================================";
	s+= "\nMEMORY GAME START";
	s+= "\n================================================================================";
	System.out.println(s);

	s = "\n\n\tLet's play the memory game!  So you've chosen to hang out with your friends, either after school or during lunch.  Just as the lunch period is about to end, one of your best friends gives you your crush's phone number!  Your friend walks away right after telling it to you, so you have no time to drag him back and question him.  Will you be able to remember it?";
	s+= "\n\n\tRules of the game: in the beginning a window will pop up with your crush's phone number in it.  You have 15 seconds to memorize the phone number, and then you will be prompted to enter it again.  There is no time limit or restraint...but think about this: the more time you spend on it, the less likely you're going to remember!  You only have one shot - if you get it correctly, your social life goes up.  If you're incorrect, however, your social rating will drop and all your hopes and dreams will be dashed (JK).";
	s+= "\n\n\tPlease do not press the Close 'X' of the GUI.  You will be able to press the Done button once you have entered 10 digits.  Now press enter to begin.";
	System.out.println(s);
	cont2();

	hello = new Memory();
	cont();

	boolean won = hello.wonOrNot();
	String eval = "\n\n================================================================================";
	eval+= "\n\nEND MEMORY GAME.";
	eval+= "\n\n================================================================================";

	if (won) {
	    eval += "\n\n\tCongralutions, you have very good memory, which is an admirable trait.  You call your crush based on the number your friend gave you, and it turns out it was a fake!  However, everyone gets a good laugh out of it and your social standing is raised by two points!";
	    a.socialStanding+= 2;
	}
	else {
	    eval+= "\n\n\tUh Oh, you did not get the right number.  You frantically try to persuade your friend to give you the number again, but your crush walks by and you embarass yourself.  Social standing it dropped by 2 points!\n\n";
	    a.socialStanding-= 2;
	}
	System.out.println(eval);

    }//end runMemory()




    public void runSortGame() {
	String s = "\n\n================================================================================";
	s+= "\nSORTING GAME START";
	s+= "\n================================================================================";
	if (hours < 3)
	    s+= "\n\n\tYou're either on the subway to school or with your friends after school and you start to think about life.  You're already a high school student and your childhood has passed so quickly.  It's a challenge to think about what you're going to become in the future, and you try to sort yourself out.";
	s+= "\n\n\tRules of the sorting game: once you start the game, you will see a list of numbers at the top of the GUI window.  That is the list of numbers you're trying to sort out.  You must place them in order from LEAST TO GREATEST using the buttons below.  You must finish in under a minute and a half to win.  After sorting all the numbers, press the DONE button.  Do not press the close 'X' of the GUI window, because that will stop the program.\n";
	
	System.out.println(s);
	cont();
	boohoo = new SortGame();

	long time = boohoo.time;
	boolean won = boohoo.won;
	if (time > 90000)
	    won = false;

	cont();

	String eval = "\n\n================================================================================";
	eval+= "\n\nEND SORTING GAME.";
	eval+= "\n\n================================================================================";

	if (won) {
	    eval+= "\n\n\tYou managed to sort such a complicated list in under a minute and a half, congratulations!  Your thoughts gave you much more insight into yourself and the world around you.  You think through them and understand your purpose in life...just a bit more than before.  All your stats are raised by a point!  Good job, philosopher! :)";
	    a.average++;
	    a.health++;
	    a.socialStanding+=2;
	}
	else {
	    eval+= "\n\n\tUnfortunately for you, the complicated world has made you confused or slow, and you sorted the list incorrectly or too slowly.  Your mind has been quite confused by your efforts to understand yourself, and your average is lowered.  Try to be more philosophical next time!";
	    a.average --;
	}
	System.out.println(eval);
    }//end runSortGame()






    /*=====================================================================
      Methods for Lunch and Afterschool
      -runLunch: calls lunch options
      -runAfterschool: calls afterschool options
      ===================================================================*/

    public void runLunch() {

	String s = "\n\n================================================================================";
	s+= "\n\n\tIT'S LUNCHTIME";
	s+= "\n\n================================================================================";

	s+="You may either sleep (increase health), study(increase average), copy homework(increase average by more than studying), or socialize(increase social standing). Key in:\n0 for an attempt at sleeping\n1 for an attempt at studying\n2 for an attempt at copying\n3 for an attempt at socializing ";
	System.out.println(s);
	String wham = "";
	int toDo = chooseInt(wham);
	if (toDo == 0) {
	    a.health++;
	    System.out.println("\nYou had a nice nap and increased your health! Good for you.");
	}
	if (toDo == 1) {
	    a.study();
	    System.out.println("\n\nYou studied for the period, and increased your average and knowledge");
	}
	if (toDo == 2){
	    if (Math.random() > 0.5) {
		a.average+=2;
		System.out.println("\n\nYou successfully copied homework!");
	    }
	    else {
		a.average-=2;
		a.socialStanding--;
		System.out.println("\n\nMr. Rubinstein was walking past you and noticed you were copying someone's homework. He confiscated both, making your friend very angry at you, decreasing your social standing and average.");
	    }
	}
	if (toDo == 3) {
	    runMemory();
	}
	/*use Lunch class
	  use study() method in student
	  can call WakeUp() if you decide to go to sleep
	  when you print stuff out to the screen make sure it looks pretty and stuff!
	*/
    }

    public void runAfterSchool() {

	String s = "\n\n================================================================================";
	s+= "\n\n\tIT'S AFTERSCHOOL";
	s+= "\n\n================================================================================";
	s+= "\nYou're at home and have to decide what to do. You may either sleep (increase health), study(increase average) or go outside, find your friends and socialize(increase social standing). Key in:\n0 for sleeping\n1 for studying\n2 for an attempt at socializing";
	System.out.println(s);
	String t = "";
	int toDo = chooseInt(t);
	if (toDo == 0) {
	    a.health++;
	    System.out.println("\n\nYou had a nice nap and increased your health! Good for you.");
	}
	if (toDo == 1) {
	    a.study();
	    System.out.println("\n\nYou studied for about an hour, and increased your average and knowledge! That sounds very exciting, keep up the good work!");
	}
	if (toDo == 2){
	    System.out.println("\n\nChoose what socializing game you want to play. You may pick: \n0 for Memory\n1 for Sorting");
	    int too = chooseInt(t);
	    if (too == 0) {
		runMemory();
	    }
	    else if (too == 1) {
		runSortGame();
	    }
	    else a.socialStanding++;
	}

    }


    
    /*=================================================================
      Method finishDay()
      - prompts to finish the day!
      ==============================================================*/
    public void finishDay() {
	boolean done = false;
	while (!done) {
	    System.out.println( "\n\nReady for the next day?  Enter 'yes' if so!\n" );
	    String t = "";
	    t = chooseString(t);
	    if ( t.toUpperCase().equals("YES") )
		done = true;
	    else 
		System.out.println("\nPlease enter 'yes' because we know you're ready...");
	}
    }//end finishDay()


    //MAIN METHOD - where all the good stuff happens.   
    public static void main(String[] args) {
	//SimuLife wee = new SimuLife();

	SimuLife h = new SimuLife();

    }//end main()
    
}//end class SimuLife