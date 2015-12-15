package javaapplication1;


import java.io.InputStream;
import static java.lang.Character.isDigit;
import static java.lang.System.exit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmednazligul
 */
public class TestMyNumbers {
    
    private static Scanner scanner;
    
    
   public static int getValue(String message){
       int i = 0;
       System.out.print(message + ": ");
       Scanner input=new Scanner(System.in);
            i=input.nextInt();
          if(i<0) { 
            System.out.println("Value Should be number with no sign");
              return -1;
          }
       
        return i;
       
  }
    
    public static void main(String [ ] args){
        
        MyNumbers ahmed=new MyNumbers(20);
        
        int choice = 0;
        
        while(choice!=6){
         ahmed.display();
           choice=getValue("Choice");
        switch(choice){

            case 1: System.out.println("1. Add a number"); ahmed.addNumber();
                break;   
            case 2: System.out.println("2. Remove a number"); ahmed.removeNumber();
                break;
            case 3: System.out.println("3. Addition"); ahmed.addition();
                break;
            case 4: System.out.println("4. Subtraction"); ahmed.subtraction();
                break;
            case 5: System.out.println("5. Multiplication"); ahmed.multiplication();
                break;
           
            default: System.out.println("There are no index which you entered");
                break;
        }
        
       
        
    }
        
    }

   

   
    }
    
    


