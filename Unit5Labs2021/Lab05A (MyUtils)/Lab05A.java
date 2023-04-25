/**
 * Lab05A.java  mm/dd/yyyy
 * 
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 21nnnn|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
public class Lab05A
{
	public static void main(String [] args)
   {
		MyUtils m = new MyUtils();  //gives you access to myUtils methods
		
		
		m.sopl("This is Lab05A");  //example to call a method
	   //#1  prinyu9t "hello world"
      m.sop("hello world");
		//#2  println ("I love CompSci")
      m.sopl("I love CompSci");
      
      //************************************
      //  TEST CASES -- try these with any more that you think of!
      //************************************
      //#1  println whether 444 is odd or not
      System.out.println(m.isOdd(444));
		//#2  println whether 444 is even or not
      System.out.println(m.isEven(444));
		//#3  println a random number between 1 and 100
      System.out.println(m.randNum(1,100));
		//#4  println a random number between 500 and 400
      System.out.println(m.randNum(500,400));
		//#5  println a wedge with 6 lines
      System.out.println(m.wedge(6,"*"));
		//#6  println a wedge with 2 lines
      System.out.println(m.wedge(2,"$"));
		//#7  println a wedge with 0 lines
      System.out.println(m.wedge(0,"%"));
		//#8  println the first four characters of your first name
      System.out.println(m.firstChars("Meredith", 4));
		//#9  println the last three characters of your last name
      System.out.println(m.lastChars("Payne", 3));
		//#10 println the middle character of "peppermint"
      System.out.println(m.middleChar("peppermint"));
      //#11 println the number of vowels in "peppermint" 
      System.out.println(m.countVowels("peppermint"));
      //#12 println the number of vowels in "Today is Monday"
      System.out.println(m.countVowels("Today is Monday"));
      //#12 println the word with most vowels:  elephant or hippopotamus
      System.out.println(m.mostVowels("elephant", "hippopotamus"));
		
		
		
		//does lastChars and firstChars work with negative numbers?
      System.out.println(m.firstChars("Meredith", -4));
      System.out.println(m.lastChars("Payne", -3));
      
		//does lastChars and firstChars work if the number is > the length of the word?
      System.out.println(m.firstChars("Meredith", 10));
      System.out.println(m.lastChars("Payne", 10));
         
		//isEven should return true for 0
      System.out.println(m.isEven(0));
      
		//isOdd should return false for 0
      System.out.println(m.isOdd(0));
      
		//check your own methods
      System.out.println(m.seasonChristmas("Fall"));
      System.out.println(m.monthChristmas("July"));
      
      
	}
}