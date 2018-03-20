/*
  Henry Rojas
  CoSci 290
  
      
*/

import java.util.Scanner;
 
public class Lab10{

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
   
    System.out.println("Please enter three numbers: ");
  
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();
    
   
    
     
    
    if (num1<=num2) {
        if (num2<num3)
          System.out.println("The order is: "+num1+" "+num2+" "+num3);
        else
          System.out.println("The order is: "+num1+" "+num3+" "+num2);
    }
    
    else if (num1<=num3){
        System.out.println("The order is: "+num2+" "+num1+" "+num3);
      
    }
    
    else {
      if (num2<num3)
        System.out.println("The order is: "+num2+" "+num3+" "+num1);
      else
        System.out.println("The order is: "+num3+" "+num2+" "+num1);
    }
    
          
                        
                                                  
        }               
    }