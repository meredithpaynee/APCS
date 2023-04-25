/**
 * Lab04B.java  11/2/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
import java.util.*;
public class Lab04B
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
     
      System.out.print ("Enter a sports team: ");
      String team = input.nextLine();
      
      //print vertically
      for (int i = 0; i < team.length(); i++)
      {
         System.out.println(team.substring(i,i+1));
      }
      
      //length of team
      String oddEven = "";
      if (team.length() % 2 == 0)
      {
         oddEven = "even";
      }
      else 
      {
         oddEven = "odd";
      }
      System.out.println("Length: \t\t\t\t\t\t\t\t\t\t" + team.length() + " characters is " + oddEven);
      
      //random letter
      int num = (int)(Math.random()*(team.length()-1))+1;
      System.out.println("Random letter: \t\t\t\t\t\t\tcharacter #" + num + " is a \"" + team.charAt(num) + "\"");
      
      //last four characters
      System.out.println("The first 4 characters are: \t\t\t" + team.substring(0,4));
      
      //first four characters
      System.out.println("The last 4 characters are: \t\t\t" + team.substring(team.length()-4));
      
      //middle three characters
      char letter = team.charAt(1);
      char letter2 = team.charAt(1);
      char letter3 = team.charAt(1); 
      if (team.length() % 2 == 0)
      {
         letter = team.charAt((team.length()/2)-2);
         letter2 = team.charAt((team.length()/2)-1);
         letter3 = team.charAt((team.length()/2));
      }
      else
      {
         letter = team.charAt((team.length()/2)-1);
         letter2 = team.charAt((team.length()/2));
         letter3 = team.charAt((team.length()/2)+1);
      }
      System.out.println("Middle 3 characters are: \t\t\t\t" + letter + letter2 + letter3);
      
      //every other letter 1st
      System.out.print("Ever other letter from the first letter: ");
      for (int i = 0; i < team.length(); i+=2)
      {
         System.out.print(team.substring(i,i+1));
      }
      System.out.println();
      
      //every other letter 2nd
      System.out.print("Ever other letter from the first letter: ");
      for (int i = 1; i < team.length(); i+=2)
      {
         System.out.print(team.substring(i,i+1));
      }
      System.out.println();
      
      //reversed name
      System.out.print("Reversed name: \t\t\t\t\t\t\t\t\t");
      for (int i = team.length()-1; i >= 0; i--)
      {
         System.out.print(team.substring(i,i+1));
      }
      System.out.println();
      
      //enter letter
      System.out.print("Enter a letter: ");
      String letter4 = input.nextLine();
      int num2 = 0;
      for (int i = 0; i < team.length(); i++)
      {
         if (letter4.equals(team.substring(i,i+1)))
         {
            num2++;
         }
      }
      if (num2 == 1)
      {
         System.out.println("The letter " + letter4 +  " occurs " + num2 + " time.");
      }
      else
      {
         System.out.println("The letter " + letter4 +  " occurs " + num2 + " times.");
      }
      
            
      //box
      System.out.println(team);
      for (int i = 1;  i < team.length()-1; i++)
      {
         System.out.print(team.substring(i,i+1));
         for (int i2 = 0; i2 < team.length()-2; i2++)
         {
            System.out.print(" ");
         }
         System.out.println(team.substring(team.length()- (i+1), team.length()-(i)));
      }
      
      for (int i = team.length()-1; i >= 0; i--)
      {
         System.out.print(team.substring(i,i+1));
      }
      
   }
}