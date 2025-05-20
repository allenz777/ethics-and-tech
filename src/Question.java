/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 342393436
 */
public class Question {
    private String questionText;
    private List<String> options; 
    private char correctAnswer; 
    private String explanation; 
    
    public Question(String questionText, List<String> options, char correctAnswer, String explanation){
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.explanation = explanation; 
    }
    
    public String getQuestionsText(){
        return questionText;
    
    }
   public List<String> getOptions(){
       return options;

    }
    public String getExplanation(){
        return explanation; 
    }
    public boolean isCorrect(char choice){
        return choice == correctAnswer; 
    
    }
}
