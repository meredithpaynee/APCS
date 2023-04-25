//Student starter code 
//Thurs 01/06/2022
// finished
import java.util.*;
public class UnicornArrayRunner
{
   public static void main (String args[])
   {
      
      Unicorn u0 = new Unicorn();
      Unicorn u1 = new Unicorn("M",15, 34.5); 
      Unicorn u2 = new Unicorn("Sparkles", 150, 40.2);
    
      //create empty array for 3 unicorns
      Unicorn[] unicorns = new Unicorn[3];
      
      //assign all unicorns to array
      unicorns[0] = u0;
      unicorns[1] = u1;
      unicorns[2] = u2;
       
      //instantiate new UnicornArray
      UnicornArray ua = new UnicornArray(unicorns);
      
        
      //print UnicornArray print all unicorns with for-each loop
      System.out.println (ua); 
      //print random unicorn print a random unicorn
     System.out.println (ua.getRandomUnicorn());
    
      //print total coins for all unis
      System.out.println (ua.getTotalCoins());
      //print average age of all unicorns
      System.out.println (ua.getAverageAge());
            
      //print the age of the oldest unicorn
      System.out.println (ua.getOldestAge());

     
      //create & print an array of all the colors
      System.out.println (Arrays.toString(ua.getAllNames()));
      
      //count magical unicorns
      System.out.println (ua.countIsMagical());
      
      

      //ask the user how many coins will be added to each unicorn
      Scanner input = new Scanner(System.in);
      System.out.print ("How much should I increase number of coins?");
      int num = input.nextInt();
      
      //increase the coins for each unicorn by 'num'
      ua.increaseCoins(num);
      //print all unicorns
      System.out.println (ua);
     
      //print the unicorn with the longest name
      System.out.println (ua.getUniLongestName());
    
   }
     
}