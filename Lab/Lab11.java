/*
  Henry Rojas
  CoSci 290
  
      
*/

import java.util.Scanner;
 
public class Lab11{

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

 //naming variables
 int reverse=0;
 int palindrome;
 int remainder;
 int num=0;
    
 System.out.println("Please enter a FIVE-digit integer: "); //asking for input
 palindrome = input.nextInt(); //input is assigned to "palindrome" ex. 10001
 remainder = palindrome % 10; //obtains remainder by dividing "palindrome by 10" ex. 1
 reverse = reverse * 100 + remainder; // computes reverse by 0 * 100 + remainder ex. 1
 num = palindrome / 10000;//computes "palindrome" / 10000 ex. 10001 /10000 = 1
 
      
         
      

      if (num == reverse) { // num must equal reverse in order to be a palindrome
      
         System.out.println(palindrome + "  is a palindrome.");
  }
      else { // if not then print "not a palindrome"
      
         System.out.println(palindrome + "  is not a palindrome.");   
      } 
  
  
  
    } 
  }  