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
public class Scenarios {
    private String title;
    private List<Question> questionList;
    public Scenarios(String title, List<Question> questionList  ){
    this.title = title;
    this.questionList = questionList;
    }
    public void getTitle(){
        return title;
    }
    public Question getNextQuestion(){
        return questionList;
    }
    public boolean isFinished(){
    
    }   
}
