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
    public void addScore(){
        if (score < TOTAL_QUESTIONS){
            score++;
        }
    }
    public int getFinal(){
        return score;
    }
    public double getPercentage(){
        double percent = (score / TOTAL_QUESTIONS) * 100;
        return percent;
        
    } 
}
