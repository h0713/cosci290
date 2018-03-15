/*
  Henry Rojas
  CoSci 290
  
      
*/

import java.util.Scanner;
 
public class Lab9{

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a number\n");
     
    int num = input.nextInt();
    int sum = 0;
    
    while (num > 0)
    {
      sum = sum + num % 10;
      num = num / 10;
     
    }
    
  System.out.println("Sum of digits is: " +sum);
  
    }
  }