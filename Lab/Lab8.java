/*
  Henry Rojas
  CoSci 290
  
      
*/
import java.util.Scanner;  
public class Lab8{

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a degree in Celsius: ");// asks for input
  double celsius = input.nextDouble();// assigns input to a variable
  
  double fahrenheit = ((celsius * 1.8) + 32); //computes answer ans assigns it to a variable
  System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");// prints out answer
  // problem 2.1
  
  System.out.print("Enter radius of Cylinder: "); //asks for input
  double radius = input.nextDouble();// asssigns input to variable
  System.out.print("Enter height of Cylinder: "); // asks for input
  double height = input.nextDouble();// assigns input to variable 
  double area = radius * radius * 3.14159;// computes answer and assigns it to variable "area"
  double pvolume = area * height;// computes answer and assigns it to variable "pvolume"
  System.out.println("Area of cylinder is " + area + " Volume of cylinder is " + pvolume );// prints out answer  
   // problem 2.2
  
  
  
  
    




  }
}