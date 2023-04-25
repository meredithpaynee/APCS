import java.util.*;
import java.io.*;
public class LabStarter
{

   public static void main(String[] args)throws IOException
   {
      Scanner input = new Scanner(System.in);
      GregorianCalendar gc  = new GregorianCalendar(); //gets the current date
      String today = gc.getTime().toString();

      System.out.print ("What is the name for this new Lab?");
      String labName = input.nextLine();
     
      
      String output = "/**\n";
      output += " * " + labName+ ".java     " + today;
      output += "\n *";
      output += "\n * @author - Meredith Payne";
      output += "\n * @author - Period 4";
      output += "\n * @author - Id 222132 Ursuline Academy of Dallas";
      output += "\n *";
      output += "\n * @author - Honorbound: I received help from ...";
      output += "\n *";
      output += "\n */";
      
      output += "\npublic class " + labName;
      output += "\n{";
      output += "\n\n\n}";
      
      String newFile = labName + ".java";
		PrintWriter fileOut = new PrintWriter(new FileWriter(newFile));
     	fileOut.println(output);
 		fileOut.close(); 

   }
}

/**
 * Grades.java  mm/dd//yyyy
 *
 * @author - Jane Doe
 * @author - Period 4
 * @author - Id 21nnnn Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */