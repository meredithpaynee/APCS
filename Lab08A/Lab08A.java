/**
 * Lab08A.java  2/10/2022
 *
 * @author - McGurgan -- finished
 * @author - 
 * @author - Id nnnnnn Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Lab08A
{
	public static void main(String []args) throws IOException
	{
		Scanner file = new Scanner(new File("Lab08A.dat"));
      
      //get data count
      int count = file.nextInt();
      file.nextLine();
      
      for (int i = 0; i < count; i++)
		{
         //Get line of data - XO line
			String line = file.nextLine();
      
         //instantiate TicTacToe
		   TicTacToe t = new TicTacToe(line);
         System.out.println(t);
	   }

	}
}