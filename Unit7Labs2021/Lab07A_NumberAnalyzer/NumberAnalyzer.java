/**
 * NumberAnalyzer.java  1/21/2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
//NO System.out.println in this entire program//
import java.util.ArrayList;
import java.util.Collections;

public class NumberAnalyzer
{
   private ArrayList<Integer> numbers;

	
   public NumberAnalyzer(int[] numberList)
   {
   	//instantiate a new numbers variable
      numbers = new ArrayList<Integer>();
   
   	//add all elements from numberList to numbers
      for (int i = 0; i < numberList.length; i++)
      {
         numbers.add(numberList[i]);
      }
   }

   // This method will return the highest value in the list
   public int getHighest()
   {
      int highest = Integer.MIN_VALUE;
      for (Integer num : numbers)
      {
         if (num > highest)
         {
            highest = num;
         }
      }
      return highest;
   }
   
   // This method will return the lowest value in the list
   public int getLowest()
   {
      int lowest = Integer.MAX_VALUE;
      for (Integer num : numbers)
      {
         if (num < lowest)
         {
            lowest = num;
         }
      }
      return lowest;
   }

   
	// This method will return the total of all the elements
   public int getTotal()
   {
      int total = 0;
      for (Integer num : numbers)
      {
         total += num;
      }
      return total;
   }
   
	// This method will return the average of all the elements
   //  (no loops allowed)
   public double getAverage()
   {
      return ((double)(getTotal())/((double)(numbers.size())));
   }
   
   //This method will return the average with the highest and lowest
   //  values dropped
   //  (no loops allowed)
   public double getNewAverage()
   {
      int newTotal = getTotal() - (getHighest() + getLowest());
      return (((double)(newTotal))/((double)(numbers.size() - 2)));
   }

	// This method will return the median value of the elements
   //   You can use Collections.sort to sort the values
   public double getMedian()
   {
      double med = 0.0;
      Collections.sort(numbers);
      if (numbers.size() % 2 != 0)
      {
         med = (numbers.get(numbers.size()/2));
         return med;
      }	 
      else
      {  
         med = (numbers.get(numbers.size()/2) + numbers.get(numbers.size()/2-1))/2;
         return med;
      }     
   }
   
   // This method will return the number of even values
   public int numEvens()
   {
      int total = 0;
      for (Integer num : numbers)
      {
         if (num % 2 == 0)
         {
            total ++;
         }
      }
      return total;
   }
   
   // This method will return the number of odd values
   public int numOdds()
   {
      int total = 0;
      for (Integer num : numbers)
      {
         if (num % 2 != 0)
         {
            total ++;
         }
      }
      return total;
   }
   
   //This method will return true if the number is perfect,
   //  and false otherwise
   public boolean isPerfect(int num)
   {
      int total = 0;
      for (int i = 1; i < num; i++)
      {
         if (num % i == 0)
         {
            total += i;
         }
      }
      return total == num; 
   }
   
   
   // This method will return the number of perfect values
   public int numPerfects()
   {
      int count = 0;
      for (int i = 0; i < numbers.size(); i++)
      {
         if (isPerfect(numbers.get(i)))
         {
            count ++;
         }
      }
      return count;
   }
   
   // This method will return all perfects in the correct format with () and commas
   // If there are no perfects, return empty string
   public String getPerfects()
   {
      String output = "";
      int count = 0;
      for (int i = 0; i < numbers.size(); i++)
      {
         if (isPerfect(numbers.get(i)))
         {
            count++;
            output += numbers.get(i);
            output += ",";
         }
      }
      if (count == 0)
      {
         return "";
      }
      else
      {
         return "(" + output + ")";
      }
   }
   public String toString()
   {
      String output = "\n*************************\n";
      output += "The numbers are: " + numbers;
      output += "\nThe total is: " + getTotal();
      output += "\nThe average is: " + getAverage();
      output += "\nThe new average: " + getNewAverage();
      output += "\nThe highest is: " + getHighest();
      output += "\nThe lowest is: " + getLowest();
      output += "\nThe median is: " + getMedian();
      output += "\nThe numberof perfects is: " + numPerfects() + getPerfects();
      output += "\nThe number of evens is: " + numEvens();
      output += "\nThe number of odds is: " + numOdds();
      
      return output;
   }
}