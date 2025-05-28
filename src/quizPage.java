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
    
    public static void resetQuiz(){
        currentIndex = 0;
    }
    
    public static int getCurrentIndex(){
        return currentIndex;
    }
    public static void addIndex(){
        currentIndex++;
    }
    
}
