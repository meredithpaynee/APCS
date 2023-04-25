public class DuckRunner
{
   public static void main(String [] args)
   {
      Duck d1 = new Duck();
      System.out.println(d1);
      
      Duck d2 = new Duck("blue", 19, true);
      System.out.println(d2);
      
      System.out.println(d1.isYummy());
      System.out.println(d2.isYummy());
      
      d2.setIsOrganic(false);
      System.out.println (d2);
      
      System.out.println(d1.getCost());
      System.out.println(d2.getCost());
      //average cost
      System.out.println((d1.getCost()+d2.getCost())/2);
   }
}