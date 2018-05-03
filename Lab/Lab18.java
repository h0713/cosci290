/* 
Henry Rojas
CoSci 290
*/





 import java.util.Scanner;
public class Lab18{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
  int counter = 0;
    for ( int i = 100; i<= 1000; i++){
      if( i % 5 ==0 && i % 6==0){
        System.out.print(i +" ");
        counter++;
         }
    if(counter==10) {
      System.out.println();
      counter=0;
       }
    
    }
//problem 5.10
  System.out.print("Enter an integer: ");
  int number = input.nextInt();
  int test = 2;
  
  while (number / test != 1){
    if (number % test ==0) {
      System.out.print(test + ", ");
      number /= test;
    }
 else 
   test++;
  }
  System.out.println(number + ".");
  
  }
}
  //problem 5.16
  