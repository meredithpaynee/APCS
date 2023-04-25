/**Student
 * NumberStuff.java  12/2/2021
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */

public class NumberStuff
{
	private int number;

	public NumberStuff(int n)
   {
      number = n;
   }

   //mutator
	//** write one mutator
   public void setNum(int n)
   {
      number = n;
   }

	//**return true if the number is prime, false otherwise
	public boolean isPrime()
	{
      for (int i = 2; i < number-1; i++)
      {
         if (number % i == 0)
         {
            return false;
         }
      }
      return true;
	}

	//** return true if the number is perfect, false otherwise
	public boolean isPerfect()
	{
      int answer = 0;
      for (int i = 1; i < number; i++)
      {
         if (number % i == 0)
         {
            answer += i;
         }
      }
      
      if (answer == number)
      {
         return true;
      }
      else
      {          
         return false;
      }
	}
   
   //** return sum of digits (requires while-loop)
   //** do not use string methods
   //** hint 345 % 10 = 5
   public int getSum()
   {
      int n = 0;
      int rem = 0;
      while (number != 0)
      {
         rem = number % 10;
         number = number / 10;
         n += rem;
      }
      return n;
   }


	public String toString()
	{
      String output = "";
      output += number;
      output += "\n isPrime(): " + isPrime();
      output += "\n isPerfect(): " + isPerfect();
      output += "\n sum of digits: " + getSum();     
		return output;
	}
}