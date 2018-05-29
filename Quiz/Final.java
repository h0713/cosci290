/* 
Henry Rojas
CoSci 290
*/


public class Final{
  

	public static void main(String[] args) {
	int[] counts = new int[15]; 

	
	for (int i = 1; i <= 300; i++) {
	counts[(int)(Math.random() * 15)]++;
}

  
  System.out.println("Count for each number between 0 and 14:");
  for (int i = 0; i < counts.length; i++) {
	System.out.println(i + "s: " + counts[i]);
	}
	}
}
  
  
