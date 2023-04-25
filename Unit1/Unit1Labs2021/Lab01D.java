/**
 * Lab01D.java  08/27/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * Honorbound: I received help from n/a
 *   and I commented on the line where I received external help
 *
 */
public class Lab01D
{
   public static void main (String [] args)
   {
      //declare and assign variables below 
      int hours = 0;
      int minutes = 3;
      int seconds = 22;
      
      //calculate total below (could be one line or could be more than one line)
      System.out.println ("              My Time Calculating Program");
      System.out.println ("                by: Meredith Payne"); //replace with your name here
      int total = ((hours * 3600) + (minutes * 60) + seconds);
            
      //finish System.out.println's here
      System.out.println("hours: " + hours );
      System.out.println("minutes: " + minutes);
      System.out.println("seconds: " + seconds);
      System.out.println("New Time in Seconds: " + total);
   }
}   
