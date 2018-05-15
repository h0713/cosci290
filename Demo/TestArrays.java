/*
Henry Rojas
CoSci 290

*/
public class TestArrays{
  
  public static void main(String[] args){
    
    int[] numbers = new int[5];
    numbers[0] = 100;
    numbers[1] = 33;
    numbers[2] = -1;
    numbers[3] = 3;
    numbers[4] = -8;
    
    
    numbers[0] = 3;
    numbers = new int[6];
    numbers[5] = -12;
    
    for(int i = 0; i < 6; i++){
      numbers[i] = (int)(Math.random() * 100) + 1;
    }
    
    for(int i =0 ; i < 6; i++){
      System.out.println(numbers[i] + " ");
    }
    System.out.println(numbers[4]);
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
}
