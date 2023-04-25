/**
 * Lab05D.java  12/2/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - calls NumberStuff.
 *
 */

import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import java.lang.System.*;

//this program is finished.  Please study and understand what's happening....
public class Lab05D
{
	public static void main(String []args) throws IOException
	{
		//open dat file
      Scanner file = new Scanner(new File("numbers.dat"));
      					
		//process grades
      while (file.hasNextInt())								
      {
			//instantiate new Average object with the line of grades
         NumberStuff ns = new NumberStuff(file.nextInt());
         					
         //print the results
         System.out.println(ns);										
      }
	}
}