/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dnll5
 */
public class ethicsQuestion extends Question{
    
    /**
     * 
     * @param questionText
     * @param options
     * @param correctAnswer
     * @param explanation 
     */
    public ethicsQuestion(String questionText, java.util.List<String> options, char correctAnswer, String explanation){
        super(questionText, options, correctAnswer, explanation);
    }
    
    /**
     * Overrides the getExplanation method
     * @return the information
     */
    @Override
    public String getExplanation(){
        return "Information: " + super.getExplanation();
    }
}
