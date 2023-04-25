/**
 * StringStuff.java  12/1/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
public class StringStuff
{
   private String s1;
   private String s2;
	
   public StringStuff()
   {
      //** finish default constructor with words of your choice
      s1 = "Meredith";
      s2 = "Libby";
   }
	
   public StringStuff(String x, String y)
   {
      //** finish initialization constructor
      s1 = x;
      s2 = y;
   }
	
	//**add accessors and mutators
   public String getS1()
   {
      return s1;
   }
   public String getS2()
   {
      return s2;
   }
   public void setS1(String w)
   {
      s1 = w;
   }
   public void setS2(String w)
   {
      s2 = w;
   }

	
	/**  Returns the reverse of the letters in both words
    *   Postcondition: s1 and s2 are unchanged
    */
   public String reverse()
   {
      String answer = "";
      for (int i = s2.length()-1; i >= 0; i--)
      {
         answer += s2.substring(i,i+1);
      }
      for (int i = s1.length()-1; i >= 0; i--)
      {
         answer += s1.substring(i,i+1);
      }
      return answer;
   }
   
   /** Returns the two words concatenated with the reverse of the words
    *  Postcondition: s1 and s2 are unchanged
    */
   public String mirror()
   {
      String answer = "";
      answer += s1 + s2 + " | ";
      for (int i = s2.length()-1; i >= 0; i--)
      {
         answer += s2.substring(i,i+1);
      }
      for (int i = s1.length()-1; i >= 0; i--)
      {
         answer += s1.substring(i,i+1);
      }
      return answer;
   }
	
   /** Returns 's1 comes before s2' or 's1 comes after s2'
    *  Postcondition: s1 and s2 are unchanged
    */
   public String beforeOrAfter()
   {
      String answer = "";
      int boa = s1.compareTo(s2);
      if (boa < 0)
      {
         answer = s1 + " comes before " + s2;
      }
      else if (boa > 0)
      {
         answer = s1 + " comes after " + s2;
      }
      
      return answer;
   }
	
   /** Returns a string with 'ch' between each letter of both words
    *  There will be no 'ch' at the end
    *  Postcondition: s1 and s2 are unchanged
    */
   public String addChar(String ch)
   {
      String answer = "";
      for (int i = 0; i <= s1.length()-1; i++)
      {
         answer += s1.substring(i,i+1);
         answer += ch;
      }
      for (int i = 0; i <= s2.length()-1; i++)
      {
         answer += s2.substring(i,i+1);
         answer += ch;
      }
      return answer;
   }
	
   /** Returns the two words concatenated on alternating lines
     * Postcondition: s1 and s2 are unchanged
    */ 
	//this method is return a string that is alternating lines of letters
   public String upDownUpDown()
   {
      String answer = "";
      for (int i = 1; i <= s1.length()-1; i+=2)
      {
         answer += " ";
         answer += s1.substring(i,i+1);
      }
      for (int i = 0; i <= s2.length()-1; i+=2)
      {
         answer += " ";
         answer += s2.substring(i,i+1);
      }
      answer += "\n";
      for (int i = 0; i <= s1.length()-1; i+=2)
      {
         answer += s1.substring(i,i+1);
         answer += " ";
      }
      for (int i = 1; i <= s2.length()-1; i+=2)
      {
         answer += s2.substring(i,i+1);
         answer += " ";
      }
      return answer;
   }
   
   /** Returns the count of 's' in both words
       Postcondition: s1 and s2 are unchanged
    */
   public String countOccurrences(String s)
   {
      int num = 0;
      for (int i = 0; i < s1.length(); i++)
      {
         if (s.equals(s1.substring(i,i+1)))
         {
            num++;
         }
         
      }
      for (int i = 0; i < s2.length(); i++)
      {
         if (s.equals(s2.substring(i,i+1)))
         {
            num++;
         }
      }
      return s + ": " + num;
   }

   
	//** this method will return the output string by calling all the methods
   public String toString()
   {
      String output = "\n*********************************";
   	output += "\ns1: " + s1;
      output += "\ns2: " + s2;
      
      output += "\n" + reverse();
      output += "\n" + mirror();
      output += "\n" + beforeOrAfter();
      output += "\n" + addChar("*");
      output += "\n" + upDownUpDown();
      output += "\n" + countOccurrences("n");
      //** finish here
      return output;
   }
}