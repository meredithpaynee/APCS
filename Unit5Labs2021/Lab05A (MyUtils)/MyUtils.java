/** 
 * MyUtils.java  11/17/2021
 *
 * @author - Meredith
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
public class MyUtils
{
   //***************************************************************************
	//Method: sopl()
   // This method will println the string s 
	// (I finished this one)
	public void sopl(String s)
	{
		System.out.println(s);
	}

   //***************************************************************************
	//Method: sop()
   // This method will print the string s 
	public void sop(String s)
	{
      System.out.print(s);
	}
		
   
   //***************************************************************************
	//Method: isOdd()
   // This method will return true if the number is odd, false otherwise
	public boolean isOdd(int a)
	{	
      boolean odd = true;
      if (a % 2 != 0)
          odd = true;
      else
          odd = false;
      return odd;
	}
	
   //***************************************************************************
	//Method: isEven()
   // This method will return true if the number is even, false otherwise
	public boolean isEven(int a)
	{	
      boolean even = true;
      if (a % 2 == 0)
          even = true;
		else
          even = false;
      return even;
	}

      
   //***************************************************************************
	//Method: randNum()
   // This method will return a random number between a & b
	// if a is less than b, then random # is a < rando < b
	// if b is less than a, then random # is b < rando < a
   // int n = (int)(Math.random() * (max-min+1) + min);
	public int randNum(int a, int b)
	{
      int n = 0;
      if (a < b)
      {
         n = (int)(Math.random() * (b-a+1) + a);
      }
      if (b < a)
      {
         n = (int)(Math.random() * (a-b+1) + b);
      }
	   return n;			
	}
	
	
   //***************************************************************************
	//Method: wedge(n, c)
   // This method will return a wedge of characters
   // for example,  wedge(5,"*") would return:
   //    *
   //    **
   //    ***
   //    ****
   //    *****

	public String wedge(int n, String c)
	{
      String answer = "";
      for (int i = 0; i < n; i++)
      {
         for (int j = 0; j <= i; j++)
         {
            answer += c;
           
         }
         answer += "\n";
      }
      return answer;
	}
	

   //***************************************************************************
	//Method: firstChars()
   // This method will return the first 'n' characters of a string
	// if the string length is less than 'n', return the entire string
	// if 'n' is negative, return an empty string
	public String firstChars(String s, int n)
	{
         if (s.length() < n)
         {
            s = s;
         }
         else if (n < 0)
         {
            s = "";   
         }
         else
         {
            s = s.substring(0, n);
         }
         return s;
	}
		
   //***************************************************************************
	//Method: lastChars()
   // This method will return the last 'n' characters of a string
	// if the string length is less than 'n', return the entire string
	// if 'n' is negative, return an empty string
	public String lastChars(String s, int n)
	{
      if (s.length() < n)
      {
         s = s;
      }
		else if (n < 0)
      {
         s = "";
      }
      else 
      {
         s = s.substring(s.length()-3);
      }
		return s;
	}
	
   //***************************************************************************
	//Method: middleChar()
   // This method will return the middle character of a string
	// if the length of the string is even, 
   //     return the first middle char "optimism" => 'i'
	// if the length of the string is odd, 
   //     return the middle char
	public String middleChar(String s)	
	{
      if (s.length() % 2 == 0)
      {
         return s.substring((s.length()/2)-1, (s.length()/2));
      }
      else
      {
         return s.substring((s.length()/2), (s.length()/2)+1);
      }
	}
	
   //***************************************************************************
	//Method: countVowels()
   //return the count of vowels (a,e,i,o,u)
   public int countVowels (String s)
   {
      int num = 0;
      for (int i = 0; i < s.length(); i++)
      {
         if ((s.substring(i,i+1).equals("a")) || (s.substring(i,i+1).equals("e")) || (s.substring(i,i+1).equals("i")) || (s.substring(i,i+1).equals("o")) || (s.substring(i,i+1).equals("u")))
         {
            num++;
         }
      }

      return num;
   }
   
   //***************************************************************************
	//Method: mostVowels()
   //return the word with the most vowels
   //call the method above -- no loops allowed
   //return "same vowels" if words are the same
   public String mostVowels (String s1, String s2)
   {
      countVowels(s1);
      countVowels(s2);
      
      if (countVowels(s1) < countVowels(s2))
         return s2;
      else if (countVowels(s2) < countVowels(s1))
         return s1;
      else
         return "same vowels";
   }	
   //***************************************************************************
   // Add two more utility methods of your own.....
   
   //***************************************************************************
	//Method:
   // This method will look at the season and tell you how many seasons Christmas is away
   public String seasonChristmas (String season)
   {
      int seasonNum = 0;
      if (season.equals("fall") || season.equals("Fall"))
      {
         seasonNum = 1;
         return "Christmas is " + seasonNum + " season away!";
      }
      else if (season.equals("spring") || season.equals("Spring"))
      {
         seasonNum = 3;
         return "Christmas is " + seasonNum + " seasons away!";
      }
      else if (season.equals("summer") || season.equals("Summer"))
      {
         seasonNum = 2;
         return "Christmas is " + seasonNum + " seasons away!";
      }
      else
      {
         seasonNum = 0;
         return "Christmas is almost here!";
      }
   }
   
   //***************************************************************************
	//Method:
   // This method will look at the month and tell you how many seasons Christmas is away
   public String monthChristmas (String month)
   {
      int monthNum = 0;
      
      if (month.equals("January"))
      {
         monthNum = 11;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("February"))
      {
         monthNum = 10;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("March"))
      {
         monthNum = 9;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("April"))
      {
         monthNum = 8;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("May"))
      {
         monthNum = 7;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("June"))
      {
         monthNum = 6;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("July"))
      {
         monthNum = 5;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("August"))
      {
         monthNum = 4;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("September"))
      {
         monthNum = 3;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("October"))
      {
         monthNum = 2;
         return "Christmas is " + monthNum + " months away!";
      }
      else if (month.equals("November"))
      {
         monthNum = 1;
         return "Christmas is " + monthNum + " month away!";
      }
      else
      {
         monthNum = 0;
         return "Christmas is this month!";
      }
   }
}