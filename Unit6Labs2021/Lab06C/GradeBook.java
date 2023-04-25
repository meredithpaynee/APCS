/**
 * GradeBook.java  1/4/2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */


import java.util.*;

public class GradeBook
{
	private String[] names;
	private int[] grades;

   //I skipped default constructor.  It's ok.
	
	public GradeBook(int[] g, String[] n)
	{
		//**instantiate both arrays with the appropriate number of objects
      int [] grades = new int [g.length];
      String [] names = new String [n.length];

		//**use a for-loop to assign each name and grade with the incoming values
      for (int i = 0; i < g.length; i++)
      {
         grades[i] = g[i];
         names[i] = n[i];         
      }
	}
	
	//**this method will find the average grade (no rounding)
	public double getAverage()
	{
		double avg = 0.0;
      for(int i = 0; i < grades.length; i++)
      {
         avg += grades[i];
      }
		
		return avg/grades.length;
	}
	
	//**this method will return the student's name with the lowest grade
	public String lowName()
	{
		String name = "";
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] < min)
         {
            min = grades[i];
            name = names[i];
         }
      }
	
		return name;
	}
	
	//**this method will return the student's name with the highest grade
	public String highName()
	{
		String name = "";
     int max = Integer.MIN_VALUE;
     for (int i = 0; i < grades.length; i++)
     {
        if (grades[i] > max)
        {
           max = grades[i];
           name = names[i];
        }
     }
		return name;
	}
   
   public String[] getNamesBelowAverage()
   {
      //hints:
      //    1. get average
      double average = 0.0;
      for(int i = 0; i < grades.length; i++)
      {
         average += grades[i];
      }
      //    2. determine how many students are below average (requires loop)
      int count = 0;
      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] < average)
         {
            count++;
         }
      }
      //    3. create empty array of Strings
      String [] lows = new String[count];
      //    4. fill new array (requires 2nd loop)
      int position = 0;
      for (int i = 0; i < grades.length; i++)
      {
         if (grades[i] < average)
         {
            lows[position] = names[i];
         }
      }
      //    5. return new array   
      return lows;      
   }
	
	public String toString()
	{
		String output = "The Student List is: \n";
      for (int i = 0; i < n.length; i++)
      {
         output += (i+1) + ". " + grades[i] + "\t\t\t" + names[i] + "\n";
      }
      output += "\n Average = " + getAverage();
      output += "\n" + lowName() + " has the lowest grade";
      output += "\n" + highName() + " has the highest grade";
      output += "\n\nSudents below average: " + Arrays.toString(getNamesBelowAverage());
		return output;
	}
}