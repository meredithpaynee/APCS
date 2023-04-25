/**
 * Lab02C.java  09/21/2012
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
import java.util.*;
public class Lab02C
{
   public static void main (String [] args)
   {
      
      GregorianCalendar gc  = new GregorianCalendar(); //gets the current date
      String today = gc.getTime().toString();          //converts current date to a String
      System.out.println ("Today is: " + today);
      int numUnicorns=0;
      
      //create 3 separate unicorns (1 default, 2 non-default)
         //see page 2 of packet
      Unicorn u1 = new Unicorn();
      numUnicorns++;
      Unicorn u2 = new Unicorn("Rainbow", 16, 23.4);
      numUnicorns++;
      Unicorn u3 = new Unicorn("Daisy", 29, 100.2);
      numUnicorns++;
      
        
      //increment numUnicorns after instantiating each object (add 1 to numUnicorns)
   
      //print each unicorn on a new line
      System.out.println(u1);
      System.out.println(u2);
      System.out.println(u3);
      System.out.println("***********");
      
      Scanner input = new Scanner(System.in);
      System.out.print ("What is " + u1.getName() + "'s new name? ");
      String newName = input.nextLine();
      System.out.println(u1.getName() + "'s new name is now " + newName);
      u1.setName(newName);
      System.out.println();
      System.out.println("***********");
      System.out.println("Is " + u1.getName() + " Magical? "+ u1.isMagical());
      System.out.println("***********");
   
      //calculate and show the average unicorn age
      int age1 = u1.getAge();
      int age2 = u2.getAge(); 
      int age3 = u3.getAge();
      double sumAge = age1 + age2 + age3;
      double averageAge = (sumAge/numUnicorns);
      System.out.println();
      System.out.println("Unicorn average age is: " + averageAge);
   
      
      //use substring to get current year from 'today'
      String year = today.substring(today.length()-4);
      
      int iYear = Integer.parseInt(year); // convert year to integer UNCOMMENT when ready
      //calculate birth year of any unicorn by subtracting age from current year
      int birthYear = iYear - (u1.getAge());
      
      //display results 
      System.out.println(u1.getName() + " is " + u1.getAge() + " years old(born in " + birthYear + ")");
      
      //generate coordinates of unicorn -- all random #s between 0-100
      int c1 = (int)(Math.random()*100)+1;
      int c2 = (int)(Math.random()*100)+1;
      int c3 = (int)(Math.random()*100)+1;
      int c4 = (int)(Math.random()*100)+1;
      
      //display results
      System.out.println();
      System.out.println("Unicorn 1 coordinates: (" + c1 + "," + c2 + ")");
      System.out.println("Unicorn 2 coordinates: (" + c3 + "," + c4 + ")");
      System.out.println();
      //calculate distance between 2 unicorns - use regular math distance formula
      double distance = Math.sqrt(Math.pow((c3-c1),2) + Math.pow((c4-c2),2));
      //display results unrounded and rounded
      System.out.println("Distance between Unicorns is: " + distance);
      System.out.println("Distance rounded to whole number is: " + (int)(distance));
   
      //calculate value of total unicorn coins.  1 unicorn coin = 1 bitcoin
      double totalUCoins = u1.getNumCoins() + u2.getNumCoins() + u3.getNumCoins();
      //display results
      Scanner input2 = new Scanner(System.in);
      //look up Bitcoin value today on Internet
      System.out.print ("What is the value of bitcoin today? ");
      double value = input.nextDouble();
      
      double valueBit = value * totalUCoins;
      
      System.out.println();
      System.out.println("Total Unicorn value in Bitcoins is: " + valueBit);
      
      //add personal message at end of results!
      System.out.println("Have a great day!");
   }
}