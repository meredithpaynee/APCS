/**
 * BYOL.java  10/18/2021
 *
 * @author - Meredith Payne  
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
import java.util.Scanner;
public class BYOL
{
   public static double spendAmount(double totalMoney)
   {
   
      //first item
      Scanner input = new Scanner (System.in);
      System.out.print("What would you like to spend it on (1/3)? ");
      String first = input.nextLine();
      
      System.out.print("How much? ");
      double amount = input.nextDouble();
         
      System.out.println("You spent $" + amount + "0.");
      double leftover = totalMoney - amount;
      System.out.println("You have $" + leftover + "0 leftover.");
         
      double totalSpent = 0.0;
      
      //if statement
      //second item  
      if (leftover != 0.0)
      {
         System.out.print ("What else would you like to spend it on (2/3)?  ");
         String second = input.nextLine();
         input.nextLine();
         
         System.out.print ("How much? ");
         double amount2 = input.nextDouble();
         
         System.out.println("You spent $" + amount2 + "0.");
         double leftover2 = totalMoney - amount2 - amount;
         System.out.println("You have $" + leftover2 + "0 leftover.");
         
         //third item
         if (leftover2 != 0.0)
         {
            System.out.print("What else would you like to spend it on (3 of 3)?  ");
            String third = input.nextLine();
            input.nextLine();
         
            System.out.print("How much? ");
            double amount3 = input.nextDouble();
         
            System.out.println("You spent $" + amount3 + "0.");
            double leftover3 = totalMoney - amount - amount2 - amount3;
            System.out.println("You have $" + leftover3 + "0 leftover.");
               
            totalSpent = amount + amount2 + amount3;
         }
         else
         {
            System.out.println("You are out of money!");
            totalSpent = amount + amount2;
         }
      }
      else
      {
         System.out.println("You are out of money!");
         totalSpent = amount;           
      }
   
      //end product
      return totalSpent;
   }
      
   public static void main(String [] args)
   {
   
      //prompt questions
      
      //month
      Scanner input = new Scanner (System.in);
      System.out.print ("What month are you budgeting for?: ");
      String month = input.nextLine();
      
      //tense
      System.out.print ("Is this month past or future?:  ");
      String tense = input.nextLine();
      
      //amount
      System.out.print ("How much money do you have?: ");
      double totalMoney = input.nextDouble();    
      
      
      double totalSpent = spendAmount(totalMoney);  
   
      //tense fix
      String tenseFin = "past";
      String tenseFin2 = "";
      if (tense.equals(tenseFin))
      {
         tenseFin = " spent $";
         tenseFin2 = " saved $";
      }
      else
      {
         tenseFin = " will spend $";
         tenseFin2 = " will save $";
      }
   
      double diff= totalMoney - totalSpent;
      double percent = (diff * 100)/totalMoney;
      int percentRounded = (int)(percent + .5);
   
      //end result
      System.out.println();
      System.out.println("***********");
      System.out.println("For the month of " + month + ", you" + tenseFin + totalSpent + "0.");
      System.out.println("You" + tenseFin2 + diff + "0, which is about " + percentRounded + "% of your total.");
      System.out.println("***********");
   }
}