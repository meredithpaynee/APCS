/**
 * Grades.java  12/15/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
 
import java.util.*;

public class Grades
{
	private double[] grades;

	//**finish this initialization constructor
	public Grades(double[] nums)//the good numbers from runner (Lab06A.java)
	{		
      //**create new array called grades
      grades = new double[nums.length];
     
      //**copy all elements from nums to grades
      for (int i = 0; i < nums.length; i++)
      {
         grades [i] = nums [i];
      }

	}

	//**finish this mutator (will be identical to constructor)
	public void setGrades(double[] nums)
	{	
      //**create new array called grades
      grades = new double[nums.length];
      //**copy all elements from nums to grades
      for (int i = 0; i < nums.length; i++)
      {
         grades [i] = nums [i];
      }

	}

	
	//**this method will return the total of all the elements
	//  in the array	
	public double getTotal()
	{
		double total = 0.0;
      for (int i = 0; i < grades.length; i++)
      {
         total += grades [i];
      }	
		return total;
	}
	
   //**this method will return the maximum of all the elements
	//  in the array	
	public double getHighest()
	{
		double max = 0.0; //change this line if needed
      for (int i = 0; i < grades.length; i++)
      {
         if (grades [i] > max)
         {
            max = grades [i];
         }
      }		
		return max;
	}
	
	//**this method will return the minimum of all the elements
	//  in the array	
	public double getLowest()
	{
		double min = Integer.MAX_VALUE;//change this line if needed
		for (int i = 0; i < grades.length; i++)
      {
         if (grades [i] < min)
         {
            min = grades [i];
         }
      }			
		return min;
	}


   
	//**this method will return the average of all the elements
	//  in the array
   // no loops allowed
	public double getAverage()
	{
		double average = 0.0;
      average += getTotal();
      average /= grades.length;

		return average;
	}
	
	//**this method will return the average with the lowest grade dropped
   // no loops allowed
	public double getAverageDropLowest()
	{
      double lowAverage = 0.0;
      lowAverage += getTotal()-getLowest();
      lowAverage /= grades.length - 1;
		return lowAverage;
	}
	
	//optional
	public double roundTwo(double x)
	{
		return 0;
	}
	
	public String toString()
	{
		String output = "";
      for (int i = 0; i < grades.length; i++)
      {
         output += "Grade: ";
         output += i;
         output += " :: ";
         output += grades [i];
         output += "\n";
      }
      output += "\ntotal: " + getTotal();
      output += "\naverage: " + (int)((getAverage()+0.005)*100)/100.0;
      output += "\nhighest: " + getHighest();
      output += "\nlowest: " + getLowest();
      output += "\naverage with dropped lowest: " + getAverageDropLowest();
      output += "\nWOW! Your average went up " + (int)(((getAverageDropLowest()-getAverage())+0.005)*100)/100.0 + " points!";
      output += "\n*************************************\n";
		return output;
    
	}
}

