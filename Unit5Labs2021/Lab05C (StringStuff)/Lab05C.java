/**
 * Lab05C.java  12/1/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */

public class Lab05C
{
	/* Method: main
	   This method is the runner to instantiates and test objects.
 	 */
	public static void main(String[] args)
	{
		//Instantiate Objects	
      StringStuff ss = new StringStuff("abe", "ape"); //instantiate StringStuff object
		
      //Run tests
      System.out.println(ss);  //print object (from toString())
		
		ss.setS1("giraffe");    //set object String 1 to new word
		ss.setS2("gorilla");    //set object String 2 to new word
		System.out.println(ss); //print object (from toString())
		
		ss.setS1("one");       //set object String 1 to new word
		ss.setS2("two");       //set object String 2 to new word
		System.out.println(ss);//print object (from toString())
		
	//**finish test cases
      ss.setS1("19");
      ss.setS2("123");
      System.out.println(ss);	
      
      ss.setS1("goofy");
      ss.setS2("goof");
      System.out.println(ss);
   
      ss.setS1("fun");
      ss.setS2("funny);
      System.out.println(ss);
   
	} // end main
} // end class