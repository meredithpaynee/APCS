/**
 * Lab06C.java  1/4/2022
 *
 * @author - Meredith Payn
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from Mrs. McGurgan.
 *
 */
import java.util.*;
import java.io.*;


//This Runner is finished
public class Lab06C
{
	public static void main(String[] args) throws IOException
	{
      int index = 0;
      
		Scanner file = new Scanner(new File("Lab06C.dat"));
  
      //get data count
      int count = file.nextInt();
      file.nextLine();
      
      //instantiate arrays
      String[] names = new String[count];
		int[] grades = new int[count];
      
		//fill arrays
      for (int i = 0; i < count; i++)
		{
         //Get line of data - Student,Grade
			String line = file.nextLine();
			Scanner chopper = new Scanner(line);
			chopper.useDelimiter(",");
         
         //Get name
			String name = chopper.next();
         
         //Get grade
			int grade = chopper.nextInt();
         
         //Add to array
			grades[i] = grade;
			names[i] = name;	
		}
      
      //instantiate gradebook
		GradeBook g = new GradeBook(grades, names);
      System.out.println(g);
	}
}