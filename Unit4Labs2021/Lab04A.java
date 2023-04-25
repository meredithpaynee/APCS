/**
 * Lab04A.java  10/29/21
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
import java.util.*;
public class Lab04A
{
	public static void main(String [] args)
   {
			Scanner input = new Scanner(System.in);
         
         int number = 0;
         int count = 0;
         int highest = Integer.MIN_VALUE;
         int lowest = Integer.MAX_VALUE;
         int total = 0;
         double average = 0;
         int even = 0;
         int odd = 0;
         
         System.out.print("enter a number: ");
         number = input.nextInt();
         
         while (number != 999)
         {
            count++;
            total += number;
            average = ((total*1.0)/(count*1.0));          
            
            if (number % 2 == 0)
               even++;
            else
               odd++;
            
            if (number > highest)
               highest = number;
            if (number < lowest)
               lowest = number;
               
            System.out.print ("enter another number: ");
            number = input.nextInt();
         }
         double roundedAverage = (int)((average+.005)*100)/100.0;
         
         System.out.println("\t\t\t\tMy Number Statistic Program");
         System.out.println("\t\t\t\t\tBy: Meredith Payne");
         System.out.println("Count     High     Low     Total     Average     # of Evens     # of Odds");
         System.out.println("=====     ====     ===     =====     =======     ==========     =========");
         System.out.print(count +"         "+ highest + "        " + lowest + "        ");
         System.out.print(total + "         " + roundedAverage + "        " );
         System.out.print(even +  "             " +odd);        
         
	}
}