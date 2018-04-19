/*
henry Rojas

Lecture
  Introduction to methods
  
Lab:
  Finish up the demo on custom methods by implementing the methods for multiplication and division
*/

public class Lab13{ 
public static void main(String[] args){
  //declare variables
  int a = 1;
  int b = 3;
  int c = 0;
  int d = -5;
  
  System.out.println("Operations on a and b: ");
  System.out.println("addition - " + add(a, b));
  System.out.println("subtraction - " + subtract(a, b));
  System.out.println("multiplication - " + multiply(c, d));
  System.out.println("division - " + divide(c,d));
  

  }
// this custom method addds two integers
  public static int add(int num1, int num2){
    
    //declare variables
    int sum = 0;
    
    //add num1 and num2
    sum = num1 + num2;
    
    //return sum
    return sum; 
    
  }

  //this custom method subtacts two numbers
  public static int subtract(int num1, int num2){
    
  int difference = 0;
  
  difference = num1 - num2;
  
  return difference;
   
  }
  
  // this custom method multiplies two numbers
  
  public static int multiply(int num3, int num4){
  
  int product = 0;
  
  product = num3 * num4;
  
  return product;
    
  }
  
  // this custom method divides two numbers
  
  public static int divide(int num3, int num4){
  
  int quotient = 0;
  
  quotient = num3 / num4;
  
  return quotient;
    
  }


}

