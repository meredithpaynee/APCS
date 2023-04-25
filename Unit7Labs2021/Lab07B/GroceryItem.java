// Student version - finished
public class GroceryItem
{
   private String name;
   private double cost;
   private boolean taxable;
   
   public GroceryItem(String n, double c, boolean t)
   {
      name = n;
      cost = c;
      taxable = t;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getCost()
   {
      return cost;
   }
   
   public boolean getTaxable()
   {
      return taxable;
   }
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setCost(double c)
   {
      cost = c;
   }
   
   public void setTaxable(boolean t)
   {
      taxable = t;
   }
   
   public String toString()
   {
      String output = "";
      String buffer = "";
      for (int i=name.length(); i < 20; i++)
         buffer += " ";
      output += name + " "+ buffer +cost + "\t\t" + taxable;
      return output;
   }
 }