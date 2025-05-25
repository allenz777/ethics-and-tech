/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author 342393436
 */
public class Scenarios {
    private List<Question> questions;
    
    public Scenarios(){
        questions = new ArrayList<>();
        loadFromFile("scenarioQ.txt");
    }
    
    public void loadFromFile(String filename){
        try {
            Scanner fileInput = new Scanner(new File(filename));
            while(fileInput.hasNext()){
                String output = fileInput.nextLine();
                String [] info = output.split(",");
                String question = info[0].trim();
                String a = info[1].trim();
                String b = info[2].trim();
                String c = info[3].trim();
                String d = info[4].trim();
                char answer = info[5].trim().toLowerCase().charAt(0);
                String explanation = info[6].trim();
            }
        } catch(IOException e){
            
        }
            
    }
    public List<Question> getQuestions(){
        return questions;
    }
}

