/*
  Henry Rojas
  Co Sci 290
  
*/

public class TestStrings{
  
  //main method
  import java.util.Scanner;
  public class TestStrings{
    
  
  public static void main(String[] args){
    
    //instantiate the scanner object
      Scanner input = new Scanner(System.in);
      
  System.out.println("Are you rich? Yes or No");
  
  String answer = input.next();
  
  if(answer.equalsIgnoreCase("No")){
    System.out.println("That Sucks!");
  }
 else{
   System.out.println("Cool.");
 
 }  
  }
                        
}