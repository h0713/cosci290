/*
  Henry Rojas
  CoSci 290
  
      
*/

import java.util.Scanner;
 
public class HW3{

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter speed: ");
  int num1 = input.nextInt();
  int square = num1 * num1;
  System.out.println("Please enter acceleration: ");  
  double num2 = input.nextDouble();
  double lenght = Math.round((square / (2 * num2))*100.0)/100.0; 
  System.out.println("The minimum runway length for this airplane is: " + lenght );
  //2.12
    
   System.out.println("Please enter monthly saving amount: "); 
   int monthly = input.nextInt(); 
   double savings = (monthly * 6) * (0.02502);
   double amount = (monthly * 6) + savings;
   System.out.println("After the sixth month, the account value is: " + amount );
   // 2.13
    
   System.out.println("Enter weight in pounds:");
   double weight = input.nextDouble();  
   double pounds = weight * 0.45359237;
   System.out.println("Enter height in inches:");
   double height = input.nextDouble();
   double inches = (height * 0.0254) * (height * 0.0254);
   double bmi = pounds / inches;
   System.out.println("BMI is " + bmi);
  //2.14
  
  
  
  
  
  }
  
  
  
  }