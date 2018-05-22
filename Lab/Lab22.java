/* 
Henry Rojas
CoSci 290
*/


public class Lab22{
  
  public static void main(String[] args){
    int[] integers = createArray();
    System.out.println("The numbers are:");
    displayArray(integers);
    int[] counts = countnumbers(integers);
    System.out.println();
    System.out.println("The occurrences of each number are:");
    displayCounts(counts);
  }
  
  public static int[] createArray() {
 
 int[] integers = new int[200];

 
 for (int i = 0; i < integers.length; i++)
 integers[i] = Math.random();

 
 return integers;
 }
   public static void displayArray(int[] integers) {
 
 for (int i = 0; i < integers.length; i++) {
 if ((i + 1) % 20 == 0)
 System.out.println(integers[i]);
 else
 System.out.print(integers[i] + " ");
   
 }
 } 
    public static int[] countnumbers(int[] integers) {
 
    int[] counts = new int[15];

 
    for (int i = 0; i < integers.length; i++)
    counts[integers[i]]++;

    return counts;
 } 
    public static void displayCounts(int[] counts) {
    for (int i = 0; i < counts.length; i++) {
    if ((i + 1) % 10 == 0)
    System.out.println(counts[i] + " " + (integers[i]);
    else
    System.out.print(counts[i] + " " + (integers[i]) + " ");
 }
 }
    
    
    
    
  } 
  }