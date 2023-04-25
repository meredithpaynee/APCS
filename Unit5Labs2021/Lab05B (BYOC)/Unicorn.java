public class Unicorn
{
   private String name;
   private int age;
   private double numCoins;
   
   public Unicorn()
   {
      name = "Calypso";
      age = 16;
      numCoins = 17.6;
   }
   
   public Unicorn(String n, int a, double c)
   {
      name = n;
      age = a;
      numCoins = c;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public double getNumCoins()
   {
      return numCoins;
   }
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public void setNumCoins(int c)
   {
      numCoins = c;
   }
   
   public boolean isMature()
   {
      if (age>10 && numCoins>20)
         return true;
      else
         return false;
   }
   
   public boolean isMagical()
   {
      if (name.substring(0,1).equals("M") && age>10 && age<20)
         return true;
      else
         return false;
   }
   
   public String toString()
   {  
      String output = "****************";
      output += "\nName: " + name;
      output += "\n   Age: " + age;
      output += "     NumCoins: " + numCoins;
      return output;
   }
}