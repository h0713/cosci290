/*
  Henry Rojas
  Co Sci 290
  
  Lab 3
  1. Using if - else if - else, create a scenario that
    sets up your character/user with random objects/situations
    
  2. Use random number generator
  
  3. Use at least one compound/complex condtional with a logical 
    operator, e.g. randomNum <= 80 && randomNum >= 70
*/

public class TestScenario{

  //entry point of appilcation
  public static void main(String[] args){
    
    //setting up random generator
    int minimum = 1;
    int maximum = 5;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    //using if - else if - else to give user a random weapon
    if(randomNum >= 4){
      System.out.println("Health pack retrieved... Health level 100 !");
    }
    else if(randomNum <= 2 && randomNum >= 3){
      System.out.println("Surprise trap door... u fell till death");
    }
    else{
      System.out.println("U were bit by a giant spider... -50 points.");
    }
    
  }
}