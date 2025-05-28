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
     * Gets the correct answer
     * 
     * @return the correct answer
     */
    public char getCorrectAnswer(){
        return correctAnswer;
    }
    
    /**
     * Checks if the answer is correct
     * 
     * @param selected the selected answer
     * @param correctAnswer the correct answer
     * @return set them equal to each other
     */
    public static boolean isCorrect(char selected, char correctAnswer){
        return Character.toLowerCase(selected) == Character.toLowerCase(correctAnswer);
    }
    
    /**
     * Checks if given character is correct
     * 
     * @param selected the answer choice
     * @return true if the choice matches the correct answer; false otherwise
     */
    public boolean isCorrect(String selected){
        if(selected == null || selected.isEmpty()){
            return false;
        }
        return selected.charAt(0) == correctAnswer;  
    }
}
