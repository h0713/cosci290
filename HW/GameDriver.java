/*
  Henry Rojas
  CoSci 290
  
      
*/


import java.util.Scanner;
 
public class GameDriver{

  public static void main(String[] args){
    
    
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    String Playername = "";
    String YesorNo = "";
    String LeftRight = "";
    int randomNum = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 10; //set max for range for random numbers
      
    System.out.println(" .---.-.--|  |.--.--.-----.-----.|  |_.--.--.----.-----. \n"
                      +" |  _  |  _  ||  |  |  -__|     ||   _|  |  |   _|  -__| \n"
                      +" |___._|_____| \\___/|_____|__|__||____|_____|__| |_____| "); 
    System.out.println(" (       )(  ___  )/ ___   )(  ____ \\ \n"
                      +" | () () || (   ) |\\/   )  || (    \\/ \n"
                      +" | || || || (___) |    /   )| (__    \n"
                      +" | |(_)| ||  ___  |   /   / |  __)   \n"
                      +" | |   | || (   ) |  /   /  | (      \n"
                      +" | )   ( || )   ( | /   (_/\\| (____/\\ \n"
                      +" |/     \\||/     \\|(_______/(_______/ ");
                                                                 
   System.out.println("Rain, rain, and more rain keep falling in the deep jungle... \n"
                      +" as you keep running through the jungle... you notice something \n"
                     +" ...and it turns out ur not alone \n"
                     +" .... its a man dressed just like Indiana Jones... as you aproach him... he signals you to come over \n"
                     +" and he stares at u and says...");
   System.out.println("What is your name? \n");
    Playername = input.next();
   
    System.out.println("\nAh...WELCOME Dr." + Playername );
    System.out.println("\nSo sorry, didn't recognize you there... \n");
    System.out.println("You must hurry... You must get through this MAZE \n");
    System.out.println("You do know which way you are going? Right? \n ");
    YesorNo = input.next();                
    System.out.println("\nGreat... lets get going! \n");
    System.out.println("\n Shall we enter.. Which way Dr." + Playername + "...left or right? ");
    LeftRight = input.next();
    
      
    randomNum = minimum + (int)(Math.random() * maximum);
    
    
    if(randomNum > 3){
      System.out.println("\nOh no... theres a trap door! NOOOOOOOO!");
      
    }
    else{
      System.out.println("\nSeems like the right path to take...quick we must hurry");
      
    }
    
    
   
    System.out.println();
    System.out.println("   _______  _______  _______  _______    _______           _______  _______      \n"
                      +"  (  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )  \n"
                      +"  | (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|  \n"
                      +"  | |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|  \n"
                      +"  | | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)  \n"
                      +"  | | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (     \n"
                      +"  | (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__  \n"
                      +"  (_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/ ");
    
    
  
  }
} 
