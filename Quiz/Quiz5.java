/* 
Henry Rojas
CoSci 290
*/


import java.util.Scanner;
public class Quiz5{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

  System.out.print("Please enter your name: ");
  String name = input.next();
  int vowelcount = 0;  
    
    for (int i=0; i < name.length(); i++) {
      char vowel = name.charAt(i);
      if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
          vowelcount = vowelcount + 1;
    }
  System.out.println( "There is " + vowelcount + " vowel(s) in the name " + name );



  }
}