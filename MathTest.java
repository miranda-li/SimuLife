/* need a constructor that creates the different questions
 * after use question remove it from arraylist
 * keep track of right answers and do 5 questions per test
 * methods: testIt will put a question up, when its answered it will disappear, but keep track of if it was right
 * variables for answered right so that we can then add or subtract from the                                                                                              
 */

import java.io.*;
import java.util.*;


public class MathTest extends Tests{
    public Matha hQuestions;
    public int answeredright;
    Question[] questionstobeused;
    public int on;
  
    public MathTest(int difficulty) {
	hQuestions = new Matha();
	questionstobeused = new Question[5];
	if (difficulty == 0)
	    for (int i = 0; i < 5; i++) {
		questionstobeused[i] = hQuestions.mQuestionsLevel0.remove(i);
    }
    if (difficulty ==1) {
      int random0 = (int)(Math.random() * 5);
      int random1 = (int)(Math.random() * 4);
      int random2 = (int)(Math.random() * 3);
      int random3 = (int)(Math.random() * 5);
      int random4 = (int)(Math.random() * 4);
      questionstobeused[0] = hQuestions.mQuestionsLevel1.remove(random0);
      questionstobeused[1] = hQuestions.mQuestionsLevel1.remove(random1);
      questionstobeused[2] = hQuestions.mQuestionsLevel1.remove(random2);
      questionstobeused[3] = hQuestions.mQuestionsLevel0.remove(random3);
      questionstobeused[4] = hQuestions.mQuestionsLevel0.remove(random4);
    }
    if (difficulty ==2) {
      int random0 = (int)(Math.random() * 5);
      int random1 = (int)(Math.random() * 4);
      int random2 = (int)(Math.random() * 5);
      int random3 = (int)(Math.random() * 4);
      int random4 = (int)(Math.random() * 5);
      questionstobeused[0] = hQuestions.mQuestionsLevel2.remove(random0);
      questionstobeused[1] = hQuestions.mQuestionsLevel2.remove(random1);
      questionstobeused[2] = hQuestions.mQuestionsLevel1.remove(random2);
      questionstobeused[3] = hQuestions.mQuestionsLevel1.remove(random3);
      questionstobeused[4] = hQuestions.mQuestionsLevel0.remove(random4);
    }
    for (int i = 0; i < 5; i++)
	testIt(i);
    cont(); 
    

  }
    
  //constructor
  
    public void testIt(int i){
	Question hi = questionstobeused[i];
	Test hiTest = new Test(hi.question[0], hi.question[1], hi.question[2], hi.question[3], hi.question[4], hi.question[5], this);
    }
    
    
    public static void main(String[] args) {
	MathTest a = new MathTest(1);
    }
}

