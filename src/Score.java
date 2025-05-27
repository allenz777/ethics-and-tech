/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342348646
 */
public class Score {
    private int score;
    private static final int TOTAL_QUESTIONS = 10;
   
    /**
     * Adds the score in 1's
     */
    public void addScore(){
        if (score < TOTAL_QUESTIONS){
            score++;
        }
    }
    
    /**
     * Gets final score
     * @return the total score
     */
    public int getFinal(){
        return score;
    }
     
    @Override
    public String toString(){
        return "Your final score is: " + score + "/10";
    }
}
