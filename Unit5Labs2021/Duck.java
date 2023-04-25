public class Duck
{
   //attributes (instance fields / private instance variables)
   
   private int weight;
   private String color;
   private boolean isOrganic;
   
   //default constructor
   public Duck ()
   {
      weight = 8;
      color = "pink";
      isOrganic = true;
   }
   
   //initialization constructor
   public Duck (String c, int w, boolean o)
   {
      weight = w;
      color = c;
      isOrganic = o;
   }
   
   //accessors (getters) (one per attribute)
   public String getColor ()
   {
      return color;
   }
   
   public int getWeight ()
   {
      return weight;
   }
   
   public boolean getIsOrganic ()
   {
      return isOrganic;
   }
   
   //mutators (setters) (one per attribute)
   public void setColor(String c)
   {
      color = c;
   }
   
   public void setWeight(int w)
   {
      weight = w;
   }
   
   public void setIsOrganic(boolean o)
   {
      isOrganic = o;
   }
   
   public boolean isYummy()
   {
      if (!color.equals("blue") && isOrganic)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   
   public double getCost()
   {
      double cost = 0;
      
      cost += weight * 3;
      if (isOrganic)
      {
         cost += 10;
      }
      if (color.equals("pink"));
      {
         cost -= 2.5;
      }
      
      return cost;
   }
   
   //toString method
   public String toString ()
   {
      String output = "";
      
      output += "****************";
      output += "\n" + weight;
      output += "\n" + isOrganic;
      output += "\n" + color;
      output += "\n****************";
      
      return output;
   }
}