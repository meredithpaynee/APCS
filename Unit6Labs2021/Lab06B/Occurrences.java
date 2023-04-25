/**
 * Occurences.java  12/15/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
public class Occurrences
{
	private int[] list;		

	public Occurrences(int [] inNums)
	{
		// **instantiate 'list' to have 10 integers containing all zeros
      list = new int [10];
		// **read the incoming numbers and increment list where needed	
      for (int i = 0; i < inNums.length; i++)
      {
         list[inNums[i]]++;
      }     	
	}

	public void setList(int [] inNums)
	{	
		//**this method will be exactly as the constructor above	
      // **instantiate 'list' to have 10 integers containing all zeros
      list = new int [10];
		// **read the incoming numbers and increment list where needed	
      for (int i = 0; i < inNums.length; i++)
      {
         list[inNums[i]]++;
      } 
	}
   
   
//**you will need a for-loop in the toString()
	public String toString()
	{
		String output = "";
      output += "Number\tOccurences";
      for (int i = 0; i < 10; i++)
      {
         output += "\n" + i + "\t\t-\t\t" + list[i];
         for (int j = 0; j < list[i]; j++)
         {
            output += "*";
         }
         
      }
      // output += "Number\tOccurences";
//       output += "\n0\t\t-\t";
//       output += "\n1\t\t-\t";
//       output += "\n2\t\t-\t";
//       output += "\n3\t\t-\t";
//       output += "\n4\t\t-\t";
//       output += "\n5\t\t-\t";
//       output += "\n6\t\t-\t";
//       output += "\n7\t\t-\t";
//       output += "\n8\t\t-\t";
//       output += "\n9\t\t-\t";
//       output += "\n";
		return output;
	}
}





