/**
 * Lab03A.java  10-01-2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 *Past:
 * 1974 was on April 14
 *   add 2 more test cases
 * 
 *
 *Future
 *   add 3 more test cases
 *
 */
import java.util.*;
public class Lab03A
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.print ("enter a year: ");
      int year = input.nextInt();
   		       
         // Finish program here
         
         //math for date
      int A = year % 19;
      int B = year % 4;
      int C = year % 7;
      int D = (19*A + 24) % 30;
      int E = (2*B + 4*C + 6*D + 5) % 7;
      int day = 22 + D + E;
         
         //month
      String month = "";
      if (day > 31)
      {
         month = "April ";
         day -= 31;
      }
      else
      {
         month = "March ";
      }
           
         //past or future tense 
      String tense = "";
      if (year <= 2021)
      {
         tense = "was";
      }
      else
      {
         tense = "will be";
      }
         
         //print it out
      System.out.println("\t\t\tMy Easter Calculating Program");
      System.out.println("\t\t\t\tBy: Meredith Payne");
      System.out.println("For the year " + year + ", Easter Sunday " + tense + " on " + month + day + ".");
         
   }  
}