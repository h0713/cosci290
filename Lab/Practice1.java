/*
  Henry Rojas
  Co sci 290
  
  Lab - comment evry single line
  
  output:
  */
import java.util.Scanner;  
public class Practice1{
  
  //entry point of app
  public static void main(String[]args){
    //in order to get input from user
    Scanner input = new Scanner(System.in);
    //datatypes- int - integer - whole number 
    //Operands are the objects that are controlled by the operators 
    int operand1;
    int operand2;
   //print message to output destination
    System.out.println("Please enter in a whole number...");
   //asking user for input
    operand1 = input.nextInt();
    //print another message to output destination
    System.out.println("please enter in another whole number...");
    // asking for more input
    operand2 = input.nextInt();
    //printing message and the numbers the user used
    System.out.println("Let's do some basic math! \n "
                       + "Here are the numbers you choose.");
    System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2);
    //this is an operator... +,*,/,-
    //the 2 numbers the user inputted... is being added, multiplied, divided,and subtracted  
    System.out.println(operand1 + operand2);
    System.out.println(operand1 * operand2);
    System.out.println(operand1 / operand2);
    System.out.println(operand1 - operand2);
    
    
    } 
  }