//Student version
import java.util.*;
public class Lab07B
{
   public static void main (String [] args)
   {
      ArrayList<GroceryItem> grocerylist = new ArrayList<GroceryItem>();
      
      grocerylist.add(new GroceryItem("corn", 1.2, false));
      grocerylist.add(new GroceryItem("beans", 2.3, false));
      grocerylist.add(new GroceryItem("kale", 3.43, false));
      grocerylist.add(new GroceryItem("popcorn", 6.5, false));
      grocerylist.add(new GroceryItem("detergent", 2.3, true));
      grocerylist.add(new GroceryItem("light bulb", 4.3, true));
      grocerylist.add(new GroceryItem("apples", 3.3, false));
      grocerylist.add(new GroceryItem("bread", 2.99, false));
      grocerylist.add(new GroceryItem("soup", 0.3, false));
      grocerylist.add(new GroceryItem("berries", 4.2, false));
      grocerylist.add(new GroceryItem("orange juice", 4.3, false));

      GroceryList myList = new GroceryList(grocerylist);
      System.out.println (myList);
      
      System.out.println ("\nHighest price: "  + myList.getNameHighestPrice());
     
      String letter = "b";
      System.out.println ("\nItems that begin with  "+ letter + ": " + myList.getItems(letter));
      
      double priceLimit=3;
      ArrayList<GroceryItem> removeList =myList.removeItemOverCost(priceLimit);
      System.out.println ("\nItems removed: ");
      for (GroceryItem item : removeList)
         System.out.println ("   "+item);
      
      System.out.println (myList);
      
      priceLimit=0;
      removeList =myList.removeItemOverCost(priceLimit);
      //System.out.println ("\nItems removed: ");
      //for (GroceryItem item : removeList)
         //System.out.println ("   "+item);
      
      System.out.println (myList);

   }
   
}