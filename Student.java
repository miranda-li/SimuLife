/*========================================================
  Student Class
  Information of Student
  chooseClasses method
Study, 
  ========================================================*/

import java.util.*;
import java.io.*;

public class Student extends Choose{
    
    /*=========================================
      INSTANCE VARIABLES
      ========================================*/
    public int average;
    public int socialStanding;
    public int health;
    public int testDifficulty;
    public int subject1;
    public int subject2;
    public final static String subject[] = {"Math", "History", "Science"};
    
    private boolean classChoice;
    
    public final String[] SOCIAL = {"Antisocial, the cat lady across the street is more social than you are! ", "You're a cat lady and are working on bettering your social awkwardness. ", "You consider some people your friends, but do they consider you one? ", "You have lots of friends and are a well respected member of the Stuy community! ", "Everyone knows who you are at school, you're popular! "};//5 options
    

    public Student(){
	average = 83;
	socialStanding = 0;
	health = 90;
	classChoice = true;
	testDifficulty = 2;
    }//end constructor
    

    /*==========================================
      CHOOSING CLASSES
      =========================================*/

    public void chooseClasses(){
	int ib = 0;
	String i = "";
	while (classChoice) {
	    System.out.println("\n In this game, you will have 2 subjects... \n Choose your first subject... \n \t  0: Math \n \t  1: History \n \t  2: Science ");
	    ib = chooseInt(i);
	    if ((ib < 3) && (ib > -1)) {
		classChoice = false;
		subject1 = ib;
	    }
	}
	classChoice = true;
	
	while (classChoice) {
	    System.out.println(" \n Choose your second subject... \n \t 0: Math \n \t 1: History \n \t 2: Science ");
	    ib = chooseInt(i);
	    if ((ib < 3)&& (ib!= subject1) && (ib > -1)) {
		classChoice = false;
		subject2 = ib;
	    }
	    if (ib == subject1)
		System.out.println("You chose the same subject, chose again");
	}
	System.out.println("\n You chose " +subject[subject1] + " and " + subject[subject2] + " !");
    }//choose your classes
    
    //===========================================================


    public void study(){
	if (testDifficulty > 1)
	    testDifficulty--;
	else average++;
	average++;
    }//study method, raises average and lowers test difficulty

    public String socialGetWithString(){
	String s =  socialStanding + " : " + SOCIAL[socialStanding/2];
	return s;
    }//use for the stat window




    /*===========================================
      Get Methods
      ============================================*/
    public void lowerAverage(int points){
	average-= points;
    }//lowers average

    public void raiseAverage(int points) {
	average+= points;
    }//raises average if do something good! :)

    public int getAverage(){
	return average;
    }//returns the average

    public int getSocial(){
	return socialStanding;
    }//returns social number

    public void raiseSocial(int points){
	socialStanding+= points;
    }//raises socialStanding by certain number

    public void lowerSocial(int points){
	socialStanding-= points;
    }//lowers socialStanding by certain number

    public int getHealth(){
	return health;
    }//returns health

    public void raiseHealth(int n) {
	health += n;
    }//end raises health

    public void lowerHealth(int n) {
	health -= n;
    }//end lowers health

    public int getDifficulty(){
	return testDifficulty;
    }//returns testsdifficulty 

    public int getSubject1(){
	return subject1;
    }//returns subject1

    public int getSubject2(){
	return subject2;
    }//returns subject2

    /*==========================================
      END
      ========================================*/


    public static void main(String[] args) {
	Student a = new Student();
	a.chooseClasses();
    }//end main()

}//end class Student	
