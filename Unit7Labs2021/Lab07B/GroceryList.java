/**STUDENT VERSION
 * GroceryList.java  1/25/2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */


import java.util.*;
public class GroceryList
{
   private ArrayList<GroceryItem> list;
  
   public GroceryList(ArrayList<GroceryItem> gItems)
   {
      //instantiate list
      list = new ArrayList<GroceryItem>();
 
      //copy all items to new list
      for (GroceryItem item : gItems)
      {
         list.add(item);
      }

   }
  
  // return true if list is empty, false otherwise
   public boolean finishedShopping()
   {
      if (list.size() == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
  
  // return total cost of all items
   public double totalCost()
   {
      double total = 0;
      for (GroceryItem item : list)
      {
         total += item.getCost();
      }
      return total;
   }
  
  // return the name of the item with highest price
   public String getNameHighestPrice()
   {
      double highest = 0.0;
      String highName = "";
      for (GroceryItem item : list)
      {
         if (item.getCost() > highest)
         {
            highest = item.getCost();
            highName = item.getName();
         }
      }
      return highName;
   }
  
  // return ArrayList of items that begin with 's' -- not literal 's', but value of 's'!
   public ArrayList<String> getItems (String s)
   {
      ArrayList<String> sItems = new ArrayList<String>();
      for (GroceryItem item : list)
      {
         if (item.getName().substring(0,1).equals(s))
         {
            sItems.add(item.getName());
         }
      }
      return sItems;
   }
  
  // remove items that are over 'c' and return ArrayList of removed items
   public ArrayList<GroceryItem> removeItemOverCost(double c)
   {
      ArrayList<GroceryItem> removedItems = new ArrayList<GroceryItem>();
      for (int i = list.size()-1; i >= 0; i--)
      {
         if (list.get(i).getCost() > c)
         {
            removedItems.add(list.get(i));
            list.remove(list.get(i));
         }
      }
      return removedItems;
   }
  
   public String toString() //FINISHED
   {
      String output = "\n**SHOPPING LIST**";
      int i=1;
      for (GroceryItem item : list)
      {
         if (i<=9)
            output += "\n"+i+".  "+item;
         else
            output += "\n"+i+". "+item;
         i++;
      }
      output += "\n==============================\n TOTAL:\t\t\t\t\t\t "+totalCost();
      if (finishedShopping())
         output += "   NO MORE SHOPPING!";
      else
         output += "   KEEP SHOPPING!";
      return output;
   }
}