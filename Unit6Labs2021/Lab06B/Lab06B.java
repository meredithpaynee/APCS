/**
 * Lab06B.java  12/15/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
//This runner is finished
 
public class Lab06B
{
	public static void main(String []args)
	{   
		Occurrences oc = new Occurrences(new int[] {1,5,3,4,5,5,5,4,3,2,5,5,5,3,0,4,5});
		System.out.println(oc);

		oc.setList(new int[] {2,3,4,5,6,7,8,9,0,2,3,5,6,8,8,8,9,4,5});
		System.out.println(oc);

		oc.setList(new int[] {2,3,4,5,6,7,8,2,0,2,3,5,6,8,8,8,9,4,5});
		System.out.println(oc);
   }
}