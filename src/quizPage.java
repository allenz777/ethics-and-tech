/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dnll5
 */
public class quizPage extends javax.swing.JFrame{
    
    protected static int currentIndex = 0;
    
    /**
     * Resets the quiz index of 10
     */
    public static void resetQuiz(){
        currentIndex = 0;
    }
    
    /**
     * Gets the current index
     * @return the current index
     */
    public static int getCurrentIndex(){
        return currentIndex;
    }
    
    /**
     * Adds the index to move on to the next question
     */
    public static void addIndex(){
        currentIndex++;
    }
    
}
