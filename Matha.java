import java.io.*;
import java.util.*;


public class Matha {
  ArrayList<Question> mQuestionsLevel0;
  ArrayList<Question> mQuestionsLevel1;
  ArrayList<Question> mQuestionsLevel2;
  
  public Matha() {
  Question a = new Question();
  Question b = new Question();
  Question c = new Question();
  Question d = new Question();
  Question e = new Question();
  Question f = new Question();
  Question g = new Question();
  Question h = new Question();
  Question i = new Question();   
  Question j = new Question();
  Question k = new Question();
  Question l = new Question();   
  Question m = new Question();
  Question n = new Question();
  Question o = new Question();  
  //create the questions
  mQuestionsLevel0 = new ArrayList<Question>();
  mQuestionsLevel1 = new ArrayList<Question>();
  mQuestionsLevel2 = new ArrayList<Question>();
  //create QUestion arraylists
  mQuestionsLevel0.add(a);
  mQuestionsLevel0.add(b);
  mQuestionsLevel0.add(c);
  mQuestionsLevel0.add(d);
  mQuestionsLevel0.add(e);
  mQuestionsLevel1.add(f);
  mQuestionsLevel1.add(g);
  mQuestionsLevel1.add(h);
  mQuestionsLevel1.add(i);
  mQuestionsLevel1.add(j); 
  mQuestionsLevel2.add(k);
  mQuestionsLevel2.add(l);
  mQuestionsLevel2.add(m);
  mQuestionsLevel2.add(n);
  mQuestionsLevel2.add(o);
  //add the questions
  
  mQuestionsLevel0.get(0).setQuestion("The mean of a set of numbers is the");
  mQuestionsLevel0.get(1).setQuestion("if 3x = 0, what is the value of 1 + x + x^2 ?");
  mQuestionsLevel0.get(2).setQuestion("If k+n < k, what is true?");
  mQuestionsLevel0.get(3).setQuestion("P, R, T are integer digits of PRT. What is the decimal value of PRT x 10^(-2) ?");
  mQuestionsLevel0.get(4).setQuestion(" y = 3^x. what is the value of x in terms of y?");
  //level0 questions
  
  mQuestionsLevel1.get(0).setQuestion("3x^2 = 4y = 12. What is the value of (x^2)y?");
  mQuestionsLevel1.get(1).setQuestion("A salesperson's commission is k percent of the selling price of a car. Which of the following represents the commission on 2 cars that sold for 14000 dollars each ?");
  mQuestionsLevel1.get(2).setQuestion("3a + 4b = b. which is equal to 6a + 6b ?");
  mQuestionsLevel1.get(3).setQuestion("An infinite geometric series' first term is 1, and the second term is 1/2, what is the sum of that series?");
  mQuestionsLevel1.get(4).setQuestion("An arithmetic series of 10 terms starts with 1 and ends with 10. what is the sum of that series?");
  //level1 questions
  
  mQuestionsLevel2.get(0).setQuestion("If the length of a rectangle is increased by 30% and the width of the same rectangle is decreased by 30%, what is the effect on the area of the rectangle?"); 
  mQuestionsLevel2.get(1).setQuestion("The inequality |2x – 1| > 5 must be true in which one of the following cases? \nI. x < -5     \nII. x > 7     \nIII. x > 0? ");
  mQuestionsLevel2.get(2).setQuestion("What is the closest approximation of the solution of the equation 2x – 1 = 3x + 1?");
  mQuestionsLevel2.get(3).setQuestion("What is the range of (x – y) if 3 < x < 4 and -2 < y< -1?");
  mQuestionsLevel2.get(4).setQuestion("Find the domain of the function f(x) = √( -x) / [(x - 2)(x + 2)]?");
 //level2 questions
  
  mQuestionsLevel0.get(0).setAnswer1("average");
  mQuestionsLevel0.get(1).setAnswer1("3");
  mQuestionsLevel0.get(2).setAnswer1("k>0");
  mQuestionsLevel0.get(3).setAnswer1("0.0PRT");
  mQuestionsLevel0.get(4).setAnswer1("3");
  
  mQuestionsLevel1.get(0).setAnswer1("12");
  mQuestionsLevel1.get(1).setAnswer1("140k");
  mQuestionsLevel1.get(2).setAnswer1("0");
  mQuestionsLevel1.get(3).setAnswer1("1");
  mQuestionsLevel1.get(4).setAnswer1("100");
  
  mQuestionsLevel2.get(0).setAnswer1("It is unchanged");
  mQuestionsLevel2.get(1).setAnswer1("II only");
  mQuestionsLevel2.get(2).setAnswer1("-4.42");
  mQuestionsLevel2.get(3).setAnswer1("4< x-y <5");
  mQuestionsLevel2.get(4).setAnswer1("(-∞ , -2) U ( -2 , 0)");
  
  mQuestionsLevel0.get(0).setAnswer2("mode");
  mQuestionsLevel0.get(1).setAnswer2("2/3");
  mQuestionsLevel0.get(2).setAnswer2("k=0");
  mQuestionsLevel0.get(3).setAnswer2("0.PRT");
  mQuestionsLevel0.get(4).setAnswer2("5");
  
  mQuestionsLevel1.get(0).setAnswer2("24");
  mQuestionsLevel1.get(1).setAnswer2("280k");
  mQuestionsLevel1.get(2).setAnswer2("12");
  mQuestionsLevel1.get(3).setAnswer2("2");
  mQuestionsLevel1.get(4).setAnswer2("60");
  
  mQuestionsLevel2.get(0).setAnswer2("It is increased by 60%");
  mQuestionsLevel2.get(1).setAnswer2("III only");
  mQuestionsLevel2.get(2).setAnswer2("-5.81");
  mQuestionsLevel2.get(3).setAnswer2("1< x-y <5");
  mQuestionsLevel2.get(4).setAnswer2("(-∞ , -2) U ( -2 , 0]");
  
  mQuestionsLevel0.get(0).setAnswer3("first number");
  mQuestionsLevel0.get(1).setAnswer3("1");
  mQuestionsLevel0.get(2).setAnswer3("k<0");
  mQuestionsLevel0.get(3).setAnswer3("P.RT");
  mQuestionsLevel0.get(4).setAnswer3("log(y) 3");
  
  mQuestionsLevel1.get(0).setAnswer3("36");
  mQuestionsLevel1.get(1).setAnswer3("14000k");
  mQuestionsLevel1.get(2).setAnswer3("2b");
  mQuestionsLevel1.get(3).setAnswer3("1.5");
  mQuestionsLevel1.get(4).setAnswer3("55");
  
  mQuestionsLevel2.get(0).setAnswer3("It is decreased by 15%");
  mQuestionsLevel2.get(1).setAnswer3("I, II, and III");
  mQuestionsLevel2.get(2).setAnswer3("-3.22");
  mQuestionsLevel2.get(3).setAnswer3("1< x-y <3");
  mQuestionsLevel2.get(4).setAnswer3("(-∞ , 2) U ( 2 , 0)");
  
  mQuestionsLevel1.get(0).setAnswer4("48");
  mQuestionsLevel1.get(1).setAnswer4("28000k");
  mQuestionsLevel1.get(2).setAnswer4("12b");
  mQuestionsLevel1.get(3).setAnswer4("O");
  mQuestionsLevel1.get(4).setAnswer4("1");
  
  mQuestionsLevel0.get(0).setAnswer4("last number");
  mQuestionsLevel0.get(1).setAnswer4("2/5");
  mQuestionsLevel0.get(2).setAnswer4("n<0");
  mQuestionsLevel0.get(3).setAnswer4("PR.T");
  mQuestionsLevel0.get(4).setAnswer4("log3 (y)");
  
  mQuestionsLevel2.get(0).setAnswer4("It is decreased by 9%");
  mQuestionsLevel2.get(1).setAnswer4("I and II only");
  mQuestionsLevel2.get(2).setAnswer4("4.93");
  mQuestionsLevel2.get(3).setAnswer4("4< x-y <6");
  mQuestionsLevel2.get(4).setAnswer4("(-∞ , 2) U ( 2 , 0]");
  
  mQuestionsLevel0.get(0).setAnswer("average");
  mQuestionsLevel0.get(1).setAnswer("1");
  mQuestionsLevel0.get(2).setAnswer("n<0");
  mQuestionsLevel0.get(3).setAnswer("P.RT");
  mQuestionsLevel0.get(4).setAnswer("log3 (y)");
  
  mQuestionsLevel1.get(0).setAnswer("12");
  mQuestionsLevel1.get(1).setAnswer("280k");
  mQuestionsLevel1.get(2).setAnswer("0");
  mQuestionsLevel1.get(3).setAnswer("2");
  mQuestionsLevel1.get(4).setAnswer("55");
  
  mQuestionsLevel2.get(0).setAnswer("It is decreased by 9%");
  mQuestionsLevel2.get(1).setAnswer("I and II only");
  mQuestionsLevel2.get(2).setAnswer("-4.42");
  mQuestionsLevel2.get(3).setAnswer("4< x-y <6");
  mQuestionsLevel2.get(4).setAnswer("(-∞ , -2) U ( -2 , 0]");
  }
}
