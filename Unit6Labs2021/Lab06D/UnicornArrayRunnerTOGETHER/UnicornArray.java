//Student starter code

//Name:  your Name here


public class UnicornArray
{
   private Unicorn[] unis;
   
   //write one constructor to accept an array of unicorns
   //  and copy all unicorns to instance variable
   public UnicornArray(Unicorn[] u)
   {
      unis = new Unicorn[u.length];
      for (int i = 0; i < u.length; i++)
      {
         unis[i] = u[i];
      }
   }

   // write method (getRandomUnicorn()) to return a random unicorn from the array
   public Unicorn getRandomUnicorn()
   {
      Unicorn rando = new Unicorn();
      int randoNum = (int)(Math.random() * unis.length);
      rando = unis[randoNum];
      
      return rando;
   }

   // write method (getTotalCoins()) to return the total of all unicorn coins
   public double getTotalCoins()
   {
      double total = 0;
      for (Unicorn uni : unis)
      {
         double coins = uni.getNumCoins();
         total += coins;
      }
      
      return total;
   }
   
   // write method (getAverageAge()) to return the average age of all unicorns
   public double getAverageAge()
   {
      double total = 0;
      for (Unicorn uni : unis)
      {
         total += uni.getAge();
      }
      return (double)total/unis.length;
   }
   
   // write method (getOldestAge()) to retrun the age of the oldest unicorn   
   public int getOldestAge()
   {
      int max = 0;
      for (Unicorn uni : unis)
      {
         if (uni.getAge() > max)
         {
            max = uni.getAge();
         }
      }
      return max;
   }

   // write method (getAllNames()) to return a String[] array of all unicorn names
   public String[] getAllNames()
   {
      String [] names = new String[unis.length];
      
      for (int i = 0; i < unis.length; i++)
      {
         names[i] = unis[i].getName();
      }
      return names;
   }
   
   // write method (countIsMagical()) to return the number of magical unicorns
   public int countIsMagical()
   {
      int count = 0;
      
      for (Unicorn uni : unis)
      {
         if (uni.isMagical() == true)
         {
            count++;
         }
      }
      
      return count;
   }
  
   // write method (increaseCoins(double c)) to add 'c' to all the unicorn coins
   public void increaseCoins(double c)
   {
      for (int i = 0; i < unis.length; i++)
      {
         double value = unis[i].getNumCoins();
         value += c;
         unis[i].setNumCoins(value);
      }
   }
     
   // write method (getUniLongestName()) to return the Unicorn with the longest name
   public Unicorn getUniLongestName()
   {
      Unicorn u = new Unicorn();
      
      int longest = 0;
      for (Unicorn uni : unis)
      {
         int len = uni.getName().length();
         if (len > longest)
         {
            longest = len;
            u = uni;
         }
      }
      
      return u;
   }
   
      
   public String toString()
   {
      String output = "";
      for (Unicorn u : unis)
        output += u + "\n";
      return output;
   }
}
