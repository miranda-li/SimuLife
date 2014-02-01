
public class Question {

    String[] question;

    public Question() {
      question = new String[6];
    }
    public void setQuestion(String questions) {
      question[0] = questions;
    }
    public void setAnswer1(String answer1) {
      question[1] = answer1;
    }
    public void setAnswer2(String answer2) {
      question[2] = answer2;
    }
    public void setAnswer3(String answer3) {
      question[3] = answer3;
    }
    public void setAnswer4(String answer4) {
      question[4] = answer4;
    }
    public void setAnswer(String answer) {
      question[5] = answer;
    }
    
}
