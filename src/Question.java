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
    
    // Consructor 1
    public Question(String questionText, List<String> options, char correctAnswer, String explanation){
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.explanation = explanation; 
    }
    
    // Constructor 2
    public Question(String question){
        this.questionText = question;
        this.options = new ArrayList<>();
        options.add("A");
        options.add("B");
        options.add("C");
        options.add("D");
        this.correctAnswer = 'A';
        this.explanation = "N/A";
    }
    
    /**
     * Gets text of question
     * 
     * @return the question text
     */
    public String getQuestionsText(){
        return questionText;
    
    }
    
    /**
     * Gets list of options
     * 
     * @return a list of options
     */
    public List<String> getOptions(){
       return options;
    }
    
    /**
     * Gets the explanation
     * 
     * @return the explanation
     */
    public String getExplanation(){
        return explanation; 
    }
    
    /**
     * Checks if a given character is the correct answer.
     *
     * @param choice the answer choice as a character
     * @return true if the choice matches the correct answer; false otherwise
     */
    
    public boolean isCorrect(char choice){
        return choice == correctAnswer; 
    }
    
    /**
     * Checks if a given character is the correct answer.
     *
     * @param choice the answer choice as a string
     * @return true if the choice matches the correct answer; false otherwise
     */
    public boolean isCorrect(String choice){
        if (choice == null|| choice.isEmpty()){
            return false;
        }
        return choice.charAt(0) == correctAnswer;
    }
}
