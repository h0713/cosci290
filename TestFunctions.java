/*
Henry Rojas
Co Sci 290

Topics:
Functions/methods - what all the diffrent parts are
-access modifier
-return type
-function name
*/

public class TestFunctions{
  
  public static void main(String[] args){
   /*
   access modifiers
   public - anything can see/access
   private - only functions within a calss can access
   default - same thing as no written/declared modifier
   
   return types
   -int
   -double
   -String
   -char
   -boolean
   -void - doesnt return anything
   -also can return diff object types
   
   function names
   -follow the same rules as any identifer
   -use the name of the function to call it 
   
   fucntion parameters
   -input that the function uses inside somewhere
   
   
   */
    System.out.println("The sum of 2 and 3 is:" + findSum(2, 3));
    printHello("Henry");  
  
  }
  public static int findSum(int num1, int num2){
    int sum = num1 + num2;
    return sum;
  }
  public static void printHello(String name){
    System.out.println("Hello "+ name);  
  
}
  
}