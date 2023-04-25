/**
 * Lab07A.java  mm/dd/yyyy
 *
 * @author - McGurgan (finished)
 *
 * @author - Honorbound: I received help from ...
 *
 */
 
 //finished
public class Lab07A
{
   public static void main(String [] args)
   {
      NumberAnalyzer nums = 
         new NumberAnalyzer(new int [] {78, 98, 66, 100, 87, 28});
      System.out.println(nums);
      
      nums = 
         new NumberAnalyzer(new int [] {5, 12, 3, 7, 28, 496, 81, 65, 33, 11});
      System.out.println(nums);
      
      nums = 
         new NumberAnalyzer(new int [] {-5, -12, -9, -6, -1, -4, -8, -6, -20});
      System.out.println(nums);
   }
}