/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 342393436
 */
public class menuOptions {
    private List<String> options; 
    
    public menuOptions(List<String> options){
        this.options = options; 
    }
    public void displayOptions(){
        System.out.println("Choose an answer");
        for(int i = 0; i<options.size(); i++){
            System.out.println((i+1)+"");
        }
    }
    public int getUserChoice(){
    
    }
    public void handleUserChoice(int choice){
    
        }
}
