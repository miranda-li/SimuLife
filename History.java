import java.io.*;
import java.util.*;

public class History {
  ArrayList<Question> hQuestionsLevel0;
  ArrayList<Question> hQuestionsLevel1;
  ArrayList<Question> hQuestionsLevel2;
  
  public History() {
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
  hQuestionsLevel0 = new ArrayList<Question>();
  hQuestionsLevel1 = new ArrayList<Question>();
  hQuestionsLevel2 = new ArrayList<Question>();
  //create QUestion arraylists
  hQuestionsLevel0.add(a);
  hQuestionsLevel0.add(b);
  hQuestionsLevel0.add(c);
  hQuestionsLevel0.add(d);
  hQuestionsLevel0.add(e);
  hQuestionsLevel1.add(f);
  hQuestionsLevel1.add(g);
  hQuestionsLevel1.add(h);
  hQuestionsLevel1.add(i);
  hQuestionsLevel1.add(j); 
  hQuestionsLevel2.add(k);
  hQuestionsLevel2.add(l);
  hQuestionsLevel2.add(m);
  hQuestionsLevel2.add(n);
  hQuestionsLevel2.add(o);
  //add the questions
  
  hQuestionsLevel0.get(0).setQuestion("In what year did Columbus ''discover'' the Americas?");
  hQuestionsLevel0.get(1).setQuestion("Which statement about the Neolithic Revolution is an opinion rather than a fact?");
  hQuestionsLevel0.get(2).setQuestion("The concept of zero, the expansion of the caste system, and the creation of the decimal system are most closely associated with the");
  hQuestionsLevel0.get(3).setQuestion("During the European Middle Ages, guilds were created to");
  hQuestionsLevel0.get(4).setQuestion("What was one effect of the Columbian exchange on European society?");
  //level0 questions
  
  hQuestionsLevel1.get(0).setQuestion("Which political leader gained power as a result of the failing economy of the Weimar Republic?");
  hQuestionsLevel1.get(1).setQuestion("During the Cold War, nations that adopted a policy of nonalignment believed they should");
  hQuestionsLevel1.get(2).setQuestion("The use of the Marshall Plan in Western Europe after World War II strengthened the forces of");
  hQuestionsLevel1.get(3).setQuestion("The southern edge of the Sahara is expanding in a process called");
  hQuestionsLevel1.get(4).setQuestion("Which idea is correctly paired with a document that supports it?");
  //level1 questions
  
  hQuestionsLevel2.get(0).setQuestion("The imaginary line that divided the Western European countries from the Eastern European countries after World War II was known as the"); 
  hQuestionsLevel2.get(1).setQuestion("Which geographic condition contributed to the defeat of Napoleon’s troops during the invasion of Russia?");
  hQuestionsLevel2.get(2).setQuestion("One way in which Akbar the Great, Ivan the Terrible, and Louis XIV are similar is that they were all");
  hQuestionsLevel2.get(3).setQuestion("The French Revolution is most important for having changed subjects to citizens. This statement emphasizes the shift from");
  hQuestionsLevel2.get(4).setQuestion("During the first Global Age (A.D. 1450–1770), European countries obtained both a source of raw materials and a reliable market for their finished goods by developing");
  //level2 questions
  
  hQuestionsLevel0.get(0).setAnswer1("1492");
  hQuestionsLevel0.get(1).setAnswer1("Early	peoples	made	greater	cultural advancements than did people of later civilizations.");
  hQuestionsLevel0.get(2).setAnswer1("Inca Empire");
  hQuestionsLevel0.get(3).setAnswer1("obtain better working conditions in factories");
  hQuestionsLevel0.get(4).setAnswer1("Migration to the Americas declined.");
  
  hQuestionsLevel1.get(0).setAnswer1("Adolf Hitler");
  hQuestionsLevel1.get(1).setAnswer1("be exempt from United Nations decisions");
  hQuestionsLevel1.get(2).setAnswer1("communism");
  hQuestionsLevel1.get(3).setAnswer1("desertification");
  hQuestionsLevel1.get(4).setAnswer1("colonialism — The Prince");
  
  hQuestionsLevel2.get(0).setAnswer1("prime meridian");
  hQuestionsLevel2.get(1).setAnswer1("Harsh Winter");
  hQuestionsLevel2.get(2).setAnswer1("theocratic rulers");
  hQuestionsLevel2.get(3).setAnswer1("religious traditions to secular values");
  hQuestionsLevel2.get(4).setAnswer1("the policy of mercantilism");
  
  hQuestionsLevel0.get(0).setAnswer2("1776");
  hQuestionsLevel0.get(1).setAnswer2("The Neolithic Revolution resulted in changes for nomadic peoples.");
  hQuestionsLevel0.get(2).setAnswer2("Tokugawa shogunate");
  hQuestionsLevel0.get(3).setAnswer2("standardize goods and prices");
  hQuestionsLevel0.get(4).setAnswer2("Horses were acquired for the first time.");
  
  hQuestionsLevel1.get(0).setAnswer2("Charles de Gaulle");
  hQuestionsLevel1.get(1).setAnswer2("restrict trade with neighboring countries");
  hQuestionsLevel1.get(2).setAnswer2("isolationism");
  hQuestionsLevel1.get(3).setAnswer2("annexation");
  hQuestionsLevel1.get(4).setAnswer2("militarism — Sadler Report");
  
  hQuestionsLevel2.get(0).setAnswer2("line of demarcation");
  hQuestionsLevel2.get(1).setAnswer2("Drought");
  hQuestionsLevel2.get(2).setAnswer2("elected rulers");
  hQuestionsLevel2.get(3).setAnswer2("divine right rule to people’s participation in government");
  hQuestionsLevel2.get(4).setAnswer2("forts along the Silk Roads");
  
  hQuestionsLevel0.get(0).setAnswer3("1389");
  hQuestionsLevel0.get(1).setAnswer3("New technology was developed during the Neolithic Revolution.");
  hQuestionsLevel0.get(2).setAnswer3("Song dynasty");
  hQuestionsLevel0.get(3).setAnswer3("regulate the money supply");
  hQuestionsLevel0.get(4).setAnswer3("The population increased with the introduction of new foods.");
  
  hQuestionsLevel1.get(0).setAnswer3("Benito Mussolini");
  hQuestionsLevel1.get(1).setAnswer3("reject international environmental treaties");
  hQuestionsLevel1.get(2).setAnswer3("democracy");
  hQuestionsLevel1.get(3).setAnswer3("conglomerazation");
  hQuestionsLevel1.get(4).setAnswer3("capitalism — Wealth of Nations");
  
  hQuestionsLevel2.get(0).setAnswer3("Iron Curtain");
  hQuestionsLevel2.get(1).setAnswer3("Typhoons");
  hQuestionsLevel2.get(2).setAnswer3("enlightened despots");
  hQuestionsLevel2.get(3).setAnswer3("private property ownership to government ownership");
  hQuestionsLevel2.get(4).setAnswer3("trade cooperatives");
  
  hQuestionsLevel0.get(0).setAnswer4("1562");
  hQuestionsLevel0.get(1).setAnswer4("Agricultural developments resulted in the establishment of permanent settlements.");
  hQuestionsLevel0.get(2).setAnswer4("Gupta Empire");
  hQuestionsLevel0.get(3).setAnswer4("increase competition");
  hQuestionsLevel0.get(4).setAnswer4("The Christian Church was divided intoRoman Catholic and Orthodox.");
  
  hQuestionsLevel1.get(0).setAnswer4("Francisco Franco");
  hQuestionsLevel1.get(1).setAnswer4("follow a course independent of the super-powers");
  hQuestionsLevel1.get(2).setAnswer4("autocracy");
  hQuestionsLevel1.get(3).setAnswer4("desalination");
  hQuestionsLevel1.get(4).setAnswer4("monotheism — The Communist Manifesto");
  
  hQuestionsLevel2.get(0).setAnswer4("Berlin Wall");
  hQuestionsLevel2.get(1).setAnswer4("Floods");
  hQuestionsLevel2.get(2).setAnswer4("absolute rulers");
  hQuestionsLevel2.get(3).setAnswer4("rural lifestyles to urban lifestyles");
  hQuestionsLevel2.get(4).setAnswer4("laissez-faire principles");
  
  hQuestionsLevel0.get(0).setAnswer("1492");
  hQuestionsLevel0.get(1).setAnswer("Early	peoples	made	greater	cultural advancements than did people of later civilizations.");
  hQuestionsLevel0.get(2).setAnswer("Gupta Empire");
  hQuestionsLevel0.get(3).setAnswer("standardize goods and prices");
  hQuestionsLevel0.get(4).setAnswer("The population increased with the introduction of new foods.");
  
  hQuestionsLevel1.get(0).setAnswer("Adolf Hitler");
  hQuestionsLevel1.get(1).setAnswer("follow a course independent of the super-powers");
  hQuestionsLevel1.get(2).setAnswer("democracy");
  hQuestionsLevel1.get(3).setAnswer("desertification");
  hQuestionsLevel1.get(4).setAnswer("capitalism — Wealth of Nations");
  
  hQuestionsLevel2.get(0).setAnswer("Iron Curtain");
  hQuestionsLevel2.get(1).setAnswer("Harsh Winter");
  hQuestionsLevel2.get(2).setAnswer("absolute rulers");
  hQuestionsLevel2.get(3).setAnswer("divine right rule to people’s participation in government");
  hQuestionsLevel2.get(4).setAnswer("the policy of mercantilism");
  }
}
