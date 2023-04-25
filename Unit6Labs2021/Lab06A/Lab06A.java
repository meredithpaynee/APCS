/**
 * Lab06A.java  12/15/2021
 *
 * @author - Meredith
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */

import java.util.*;


//this runner is finished
public class Lab06A
{
	public static void main(String []args)
	{
		Grades test = new Grades(new double[]{100, 90, 85, 72.5, 95.6});
		System.out.println(test);

		test.setGrades(new double[]{50.0, 100.0, 80.0});
		System.out.println(test);

		test.setGrades(new double[]{93.4, -90.0, 90.0});
		System.out.println(test);

		test.setGrades(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		System.out.println(test);
	   System.out.println("\n\nProgram completed by:  Meredith Payne");
   }
}