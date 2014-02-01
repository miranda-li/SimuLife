import java.util.*;

public class Science {
  ArrayList<Question> sQuestionsLevel0;
  ArrayList<Question> sQuestionsLevel1;
  ArrayList<Question> sQuestionsLevel2;
  
  public Science() {
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
  sQuestionsLevel0 = new ArrayList<Question>();
  sQuestionsLevel1 = new ArrayList<Question>();
  sQuestionsLevel2 = new ArrayList<Question>();
  //create QUestion arraylists
  sQuestionsLevel0.add(a);
  sQuestionsLevel0.add(b);
  sQuestionsLevel0.add(c);
  sQuestionsLevel0.add(d);
  sQuestionsLevel0.add(e);
  sQuestionsLevel1.add(f);
  sQuestionsLevel1.add(g);
  sQuestionsLevel1.add(h);
  sQuestionsLevel1.add(i);
  sQuestionsLevel1.add(j); 
  sQuestionsLevel2.add(k);
  sQuestionsLevel2.add(l);
  sQuestionsLevel2.add(m);
  sQuestionsLevel2.add(n);
  sQuestionsLevel2.add(o);
  //add the questions
  
  sQuestionsLevel0.get(0).setQuestion("What is the centre of an atom called?");
  sQuestionsLevel0.get(1).setQuestion("H2O is also known as...?");
  sQuestionsLevel0.get(2).setQuestion("Botany is the study of?");
  sQuestionsLevel0.get(3).setQuestion("A single piece of coiled DNA is known as...?");
  sQuestionsLevel0.get(4).setQuestion("When light bends as it enters a different medium the process is known as?");
  //level0 questions
  
  sQuestionsLevel1.get(0).setQuestion("The elements of the first family in the periodic table are called...?");
  sQuestionsLevel1.get(1).setQuestion("What can you measure pressure with?");
  sQuestionsLevel1.get(2).setQuestion("Light Year is related to?");
  sQuestionsLevel1.get(3).setQuestion("Oncology is the study of?");
  sQuestionsLevel1.get(4).setQuestion("The periodic table is arranged in order of?");
  //level1 questions
  
  sQuestionsLevel2.get(0).setQuestion("During trajectory, what remains constant?"); 
  sQuestionsLevel2.get(1).setQuestion("Velocity is a?");
  sQuestionsLevel2.get(2).setQuestion("What is the fluid inside of a cell called?");
  sQuestionsLevel2.get(3).setQuestion("The most reactive element is");
  sQuestionsLevel2.get(4).setQuestion("How many moles of H2O are produced when reacting 2 moles of H and 1 mole of O");
 //level2 questions
  
  sQuestionsLevel0.get(0).setAnswer1("nucleus");
  sQuestionsLevel0.get(1).setAnswer1("hydrogen");
  sQuestionsLevel0.get(2).setAnswer1("botas");
  sQuestionsLevel0.get(3).setAnswer1("a piece of DNA");
  sQuestionsLevel0.get(4).setAnswer1("diffraction");
  
  sQuestionsLevel1.get(0).setAnswer1("alkaline earth");
  sQuestionsLevel1.get(1).setAnswer1("manometer");
  sQuestionsLevel1.get(2).setAnswer1("time");
  sQuestionsLevel1.get(3).setAnswer1("oncs");
  sQuestionsLevel1.get(4).setAnswer1("neutrons");
  
  sQuestionsLevel2.get(0).setAnswer1("horizontal component of velocity");
  sQuestionsLevel2.get(1).setAnswer1("distance");
  sQuestionsLevel2.get(2).setAnswer1("gooey");
  sQuestionsLevel2.get(3).setAnswer1("F");
  sQuestionsLevel2.get(4).setAnswer1("4");
  
  sQuestionsLevel0.get(0).setAnswer2("cloud");
  sQuestionsLevel0.get(1).setAnswer2("oxygen");
  sQuestionsLevel0.get(2).setAnswer2("animals");
  sQuestionsLevel0.get(3).setAnswer2("chromosome");
  sQuestionsLevel0.get(4).setAnswer2("refraction");
  
  sQuestionsLevel1.get(0).setAnswer2("transition");
  sQuestionsLevel1.get(1).setAnswer2("thermometer");
  sQuestionsLevel1.get(2).setAnswer2("temperature");
  sQuestionsLevel1.get(3).setAnswer2("pigs");
  sQuestionsLevel1.get(4).setAnswer2("atomic mass");
  
  sQuestionsLevel2.get(0).setAnswer2("acceleration");
  sQuestionsLevel2.get(1).setAnswer2("speed");
  sQuestionsLevel2.get(2).setAnswer2("water");
  sQuestionsLevel2.get(3).setAnswer2("H");
  sQuestionsLevel2.get(4).setAnswer2("3");
  
  sQuestionsLevel0.get(0).setAnswer3("electron");
  sQuestionsLevel0.get(1).setAnswer3("water");
  sQuestionsLevel0.get(2).setAnswer3("plants");
  sQuestionsLevel0.get(3).setAnswer3("nucleus");
  sQuestionsLevel0.get(4).setAnswer3("breaking");
  
  sQuestionsLevel1.get(0).setAnswer3("halogens");
  sQuestionsLevel1.get(1).setAnswer3("telephone");
  sQuestionsLevel1.get(2).setAnswer3("age");
  sQuestionsLevel1.get(3).setAnswer3("humans");
  sQuestionsLevel1.get(4).setAnswer3("atomic number");
  
  sQuestionsLevel2.get(0).setAnswer3("vertical component of velocity");
  sQuestionsLevel2.get(1).setAnswer3("vector");
  sQuestionsLevel2.get(2).setAnswer3("cytoplasm");
  sQuestionsLevel2.get(3).setAnswer3("N");
  sQuestionsLevel2.get(4).setAnswer3("2");
  
  sQuestionsLevel0.get(0).setAnswer4("neutron");
  sQuestionsLevel0.get(1).setAnswer4("helium");
  sQuestionsLevel0.get(2).setAnswer4("people");
  sQuestionsLevel0.get(3).setAnswer4("electron");
  sQuestionsLevel0.get(4).setAnswer4("reflection");
  
  sQuestionsLevel1.get(0).setAnswer4("alkali metals");
  sQuestionsLevel1.get(1).setAnswer4("fingers");
  sQuestionsLevel1.get(2).setAnswer4("distance");
  sQuestionsLevel1.get(3).setAnswer4("cancer");
  sQuestionsLevel1.get(4).setAnswer4("atoms");
  
  sQuestionsLevel2.get(0).setAnswer4("horizontal component of velocity and acceleration");
  sQuestionsLevel2.get(1).setAnswer4("foot");
  sQuestionsLevel2.get(2).setAnswer4("cell fluid");
  sQuestionsLevel2.get(3).setAnswer4("O");
  sQuestionsLevel2.get(4).setAnswer4("1");
  
  sQuestionsLevel0.get(0).setAnswer("nucleus");
  sQuestionsLevel0.get(1).setAnswer("water");
  sQuestionsLevel0.get(2).setAnswer("plants");
  sQuestionsLevel0.get(3).setAnswer("chromosome");
  sQuestionsLevel0.get(4).setAnswer("refraction");
  
  sQuestionsLevel1.get(0).setAnswer("alkali metals");
  sQuestionsLevel1.get(1).setAnswer("manometer");
  sQuestionsLevel1.get(2).setAnswer("distance");
  sQuestionsLevel1.get(3).setAnswer("cancer");
  sQuestionsLevel1.get(4).setAnswer("atomic number");
  
  sQuestionsLevel2.get(0).setAnswer("horizontal component of velocity and acceleration");
  sQuestionsLevel2.get(1).setAnswer("vector");
  sQuestionsLevel2.get(2).setAnswer("cytoplasm");
  sQuestionsLevel2.get(3).setAnswer("F");
  sQuestionsLevel2.get(4).setAnswer("1");
  }
}
