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
    
    // Constructor 1
    public Scenarios(){
        questions = new ArrayList<>();
        loadFromFile("scenarioQ.txt");
    }
    
    /**
     * Loads each question from filename and adds them onto the list
     * 
     * @param filename the name of the file being read from
     */
    public void loadFromFile(String filename){
        try {
            Scanner fileInput = new Scanner(new File(filename));
            while(fileInput.hasNext()){ // While the txt file has next
                String output = fileInput.nextLine(); 
                String [] info = output.split(","); // Split the commas
                // Trim all of the words
                String question = info[0].trim(); 
                String a = info[1].trim();
                String b = info[2].trim();
                String c = info[3].trim();
                String d = info[4].trim();
                char answer = info[5].trim().toLowerCase().charAt(0);
                String explanation = info[6].trim();
                
                // Create a new ArrayList and add all the options into the list
                List<String> optionList = new ArrayList<>();
                optionList.add(a);
                optionList.add(b);
                optionList.add(c);
                optionList.add(d);
                
                // Create new question object
                Question q = new Question(question, optionList, answer, explanation);
                // Add questions to the list of questions
                questions.add(q);
            }
        } catch(IOException e){
            System.err.println("Error reading file: " + filename);
        }
            
    }
    
    /**
     * Returns list of questions
     * 
     * @return a list of question objects
     */
    public List<Question> getQuestions(){
        return questions;
    }
}

