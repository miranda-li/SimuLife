SimuLife
========

High school simulation game run in command line.

SimuLife Game

TO RUN: In command line, run SimuLife.java



Names: Miranda Li, Dina Levy-Lambert
Period 10

Description of Project

Our project is a role-playing simulation game of a week at school (5 days) of a Stuyvesant student.  In the beginning of the game, the user reads an intro of the game and then chooses two out of three classes to take (Math, History, or Science).  The game then runs through the daily schedule 5 times.

There are a few statistics in this game: average, health, and socialStanding (which also includes an analysis).  These are contained in the Student class (but can be accessed from anywhere).

Daily schedule:
1) Waking Up - a GUI game in which there is an array of buttons, each saying 'Wake Up!'  Every 0.9 seconds the program chooses a random place on the 2D array of buttons to change the text to 'Here!'  The user must click on a 'Here' button 20 times before 25 seconds are up to win.  If the user wins, then the day continues on as normal.  If he loses, then he is late to school and misses his first period class.

2) Sort Game - a GUI game in which there is a randomly generated array of integers.  It is displayed as a JLabel, and each number is on a button.  The program sorts the list of integers and prompts the user to do the same, manually, checking to see if the order in which the user clicks the buttons is correct.  If it is correct, then all the statistics increase.  If not, then average decreases.

3) First Period - subject1 class.  There is a probability of having a test in the subject1 class.
a) If there is a test, the user can try to cheat or take the test, which is another GUI mini-game with 5 questions.
b) If there isn't, the user can choose to cut class to take the class

4) Lunch - the user is presented with some simple textbased options, some of which lead to a GUI game.

5) Second Period - subject2 class.  Same as first period.

6-8) Afterschool - the user is presented with some simple textbased options, some of which lead to GUI games
a) Memory game: the user is given a phone number of randomly generated 10 digits to remember and later reinput, in another GUI window.



The constructor of SimuLife calls the daily schedule 5 times (each being a day).  At the end of every day the Statistics are printed out in a GUI window (using the Stats class).  At the end of the week, a text-based analysis of the user's future is given.

Throughout the game the user is presented with various options and choices to make through keyboard input (the Choose class does this).  Many times the user is prompted to press "enter" simply because we don't want GUIs to overlap, and keyboard input is a way to separate things.



Bugs
- Sometimes you must enter something twice for keyboard input.  We are not sure why this happens because when we run the same .class file multiple times, sometimes we must enter something twice and sometimes we don't.
- This is not much of a bug as a warning: If you press the close 'X' on any GUI window it will quit the program (this is also mentioned many times in the in-game instructions).  Every GUI should close by itself (or if you press "done").


Special compiling issues: None.



How To

The program runs when you run the SimuLife class.  The SimuLife class contains methods that call upon other classes.  It sets up the daily schedule and has Student and Stats instance variables.  SimuLife also sets up the text around GUIs (including directions and evaluations).

The Student class contains all of the statistical information (average, health, subjects, etc) and the Stats class contains some lengthy text for introductions, conclusions, and GUI pop up windows.

Short descriptions of other classes:
- Choose: used for keyboard input (everything extends this)
- Memory, WakeUp1, SortGame: GUI games.  Their constructors run the games and they are called in different methods in SimuLife.
- Test: has the GUI part of the subject testing.  It is used in MathTest, ScienceTest, and HistoryTest.
- Question: contains the basic question array, to be used in classes containing questions and answers for the subject tests in the game.
- Matha, Science, History: contains all the test questions and answers in their respective subjects, and uses Question.
- MathTest, ScienceTest, HistoryTest extends Tests: what is actually run in the game.  Uses Matha, Science, History, and Test to put the testing part together.
- Tests: contains a few simple instance variables.


Overall, the game is run through SimuLife as it calls on the other classes based on the hours instance variable (see method nextHour() ).

The program should go through an introduction, and then prompt the user to start the game by choosing classes.  It then runs through 5 consecutive days and provides a final evaluation.



List of Files:
SimuLife.java
Student.java
Stats.java
Choose.java
Test.java
Tests.java
Question.java
History.java
Science.java
Matha.java
ScienceTest.java
MathTest.java
HistoryTest.java
Memory.java
SortGame.java
WakeUp1.java
