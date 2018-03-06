/*
  Henry Rojas
  Co Sci 290
  
  Testing datatypes and input from the user
  
  */
  
import java.util.Scanner;
  public class TestInput{
  
    //main method - starting point of application
    public static void main(String[] args){
     /* //datatype variableName = expression
      //1. Indentifiers can only start with a letter, _, or $
      //2. Identifiers with multiple words are camelCased
      //e.g. - numOfStudents, name, interestRate,
      
      //datatypes
      //int - integer - whole number => 3, 2147483647, 102, -11
      //double - decimal number => 3.33, 0.2, 0.33333, -33.3
      //char - single character inside quotations => '3', "!", ''
      //boolean - true or false => true, false
      
      //object/ 
      */ 
      
        
      final double PI_VALUE = 3.1415;
      int numberOfStudents = 29;
      double avgGPA = 3.78;
      String name = "";
      boolean gameOver = false; //or true 
      int age = 0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Hi, give me your name: ");
      
      
      name = input.next();
      
      
      System.out.println("Hi " + name);
      System.out.println("How old are you?");
      age = input.nextInt();
      System.out.println(" you are " + age + " years old!");
      
      /*
       Arithmetic operators
       + addition
       - subtraction
       * multiplication
       / division
       = assignment operator, equals
      
       programming Math operations follow the same order of operations
      ()
      
      */
      
      int month = age * 12;
      int days = age * 365;
      int hours = days * 24;
      
      System.out.println( " You are  " + month + " months old OR " + days + " days old OR " + hours + " hours old! ");
      
      
      
      
      
      
      
      
      
    }
  }