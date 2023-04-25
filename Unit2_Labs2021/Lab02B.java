/**
 * Lab02B.java  09/21/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.util.Scanner;

public class Lab02B
{
   public static void main (String [] args)
   {  
      //String s1 = "Blue Eyes,Fiji-24.6286 N:82.8733 W";
      //String s1 = "Bonnie Brae,Portugal-38.7000 N:9.1833 W";
      String s1 = "shooting Star Angel,Islamorada-17.0009 E:28.8733 S";
      
      //finish code here using 's1' from above -- no need for Scanner,
      //  but code should work for any string in this format
      System.out.println(s1.substring(0,s1.indexOf(",")) + " is hiding at " + s1.substring(s1.indexOf(",")+1,s1.indexOf("-")));
      System.out.println("\t Latitude: " + s1.substring(s1.indexOf("-")+1,s1.indexOf(":")));
      System.out.println("\t Longitude: " + s1.substring(s1.indexOf(":")+1));
   }   
}