/* 
Henry Rojas
CoSci 290
*/
import java.util.Scanner;
public class Lab21{
  
  public static void main(String[] args){
 Scanner input = new Scanner(System.in);
  int i;
  int x;
  int[] counts = new int[10];
  for(i=0; i < 10; i++) {
    counts[i] = 0;
  }
  for(i = 0; i < 100; i++){
    x = (int)(Math.random() * 10);
    counts[x]++;
 System.out.println("number " + counts[i] + " appears " + counts[x] + " times. ");
  
  }
  
  int[] numbers = new int[10];
    for(int i =0; i < numbers.lenght; i++)
      numbers[i] = input.nextInt();
    reverse(numbers);
    for (int x: numbers){
      System.out.print(x + " ");
    }
  System.out.println();
  }
  public static void reverse(int[] list){
    int temp;
    for( int i = 0, j = list.lenght -1; i < list.lenght / 2; i++, j--){
      temp = list[i];
      list[i] = list [j];
      list [j] = temp;
    }
  }
  
  }
  
