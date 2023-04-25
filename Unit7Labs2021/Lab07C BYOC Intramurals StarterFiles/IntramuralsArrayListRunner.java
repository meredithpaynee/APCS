//Student Version
// finished 

import java.util.*;

public class IntramuralsArrayListRunner
{
public static void main (String [] args)
{
   ArrayList<Intramurals> iList = new ArrayList<Intramurals>();
   Intramurals i1 = new Intramurals();
   Intramurals i2 = new Intramurals(200, "Frogs", 11);
   Intramurals i3 = new Intramurals(5000, "Unicorns", 12);
   Intramurals i4 = new Intramurals(1000, "Veggies", 10);
 
   iList.add(i1);
   iList.add(i2);
   iList.add(i3);
   iList.add(i4);
  
   IntramuralsArrayList a1 = new IntramuralsArrayList(iList);
   
   System.out.println (a1.getList());
   System.out.println (a1.getTotalCost());
   System.out.println (Arrays.toString(a1.getThemes())); 
   System.out.println (a1.getCoolIntras());
   System.out.println (a1.getMostVotes());
   
   int[] actualCost = new int[iList.size()];
   actualCost[0] = 800;
   actualCost[1] = 250;
   actualCost[2] = 4999;
   actualCost[3] = 299;
   
   double[] remainingBudget = new double[iList.size()];
   remainingBudget = intramurals.remainingBudget(actualCost);
   System.out.println (Arrays.toString(remainingBudget));
}
}