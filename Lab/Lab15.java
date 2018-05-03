/*
  Henry Rojas
  CoSci 290
  
      
*/

import java.util.Scanner;
 
public class Lab15{
  
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
     
    System.out.println("Please enter a number\n");
    
    int n = input.nextInt();
    
    System.out.println("Sum of digits is: " +sumofDigits);
  
}
  public static int sumofDigits(int n){
   
    int sum = 0;
    
    sum = sum + n % 10;
    
    n = n / 10;
    
    return sum;
    
  }
  
}