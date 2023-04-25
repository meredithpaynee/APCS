/**
 * Lab01E.java  08/27/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * Honorbound: I received help from n/a 
 *   and I commented on the line where I received external help
 *
 */
import java.util.Scanner;

public class Lab01E
{
   public static void main (String [] args)
   {
      //declare and assign original total below
      System.out.print("How many seconds? ");
      Scanner scan = new Scanner(System.in);
      int originalTotal = scan.nextInt();
   
      //calculations here (it will be more than one line)
      int hours = originalTotal / 3600;
      int minutes = (originalTotal - hours * 3600) / 60;
      int seconds = (originalTotal - (hours * 3600) - (minutes * 60));
   
      System.out.println ("        My Time Calculating Program -- reverse");
      System.out.println ("                by: Meredith payne");  //replace your name here
      
      //Finish System.out.println here
      System.out.print(originalTotal + " seconds is equal to " + hours + " hours, ");
      System.out.print(minutes + " minutes, and " + seconds + " seconds."); 
   }
}   
