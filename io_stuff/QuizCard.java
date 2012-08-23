import java.io.*;

public class QuizCard implements Serializable {
    private String question; 
    private String answer;

    public QuizCard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public void setQuestion(String question){
        this.question = question;
    }



}
