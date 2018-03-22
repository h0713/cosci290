/*
  Henry Rojas
  CoSci 290
  
      
*/

import java.util.Scanner;
 
public class Lab11{

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  
 int reverse=0;
 int palindrome;
 int remainder;
 int num=0;
    
 System.out.println("Please enter a number: "); 
 palindrome = input.nextInt(); 
 remainder = palindrome % 10; 
 reverse = reverse * 10 + remainder; 
 num = palindrome / 100;
 
      
         
      

      if (num == reverse) {
      
         System.out.println(palindrome + "  is a palindrome.");
  }
      else {
      
         System.out.println(palindrome + "  is not a palindrome.");   
      } 
  
  
  
    } 
  }  