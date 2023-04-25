/**
 * Lab02A.java  09/15/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from N/A
 *
 */
import java.util.Scanner;

public class Lab02A
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.print ("Hello, Unicorn, what is the name of your ship (must have 2 words)?");
      String ship = input.nextLine();
      
      int numLetters = ship.length();
      char first = ship.charAt(0);
      char last = ship.charAt(numLetters - 1);
      
      //number of letters
      System.out.println("Wow! That ship has " + numLetters + " letters!");
      //first and last characters
      System.out.println("\tFirst character is: " + first);
      System.out.println("\tLast character is: " + last);
      
      //name reversed
      String reverse1 = ship.substring(ship.indexOf(" "));
      String reverse2 = ship.substring(0,ship.indexOf(" "));
      System.out.println("Your ship name reversed is:" + reverse1 + " " + reverse2);
      
      //first 0 and 10
      Scanner input2 = new Scanner (System.in);
      System.out.print("Enter a number between 0 and " + (ship.length()-1) + ": ");
      int firNum = input.nextInt();
      System.out.println();
      
      //second 0 and 10
      Scanner input3 = new Scanner (System.in);
      System.out.print("Enter another number between " + firNum + " and " + (ship.length()-1) + ": ");
      int secNum = input.nextInt();
      System.out.println();
      
      //chosen string
      String chosen = ship.substring(firNum,secNum);
      System.out.println("Chosen string is: \"" + chosen + "\"");
      
      //secret code       
      char secondWord = ship.charAt(ship.indexOf(" ")+1);
      int secretNumber = (numLetters * 7);
      System.out.println("Unicorn secret code is: " + secondWord + secretNumber + first); 
   }
}
