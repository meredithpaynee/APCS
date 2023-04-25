/**
 * PlayerArray.java     Thu Jan 06 08:51:37 CST 2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
public class PlayerArray
{
   private Player[] plays;
   
   //constructor to accept array
   public PlayerArray (Player[] p)
   {
      plays = new Player[p.length];
      for (int i = 0; i < p.length; i++)
      {
         plays[i] = p[i];
      }
   }
   
   //getRandomPlayer
   public Player getRandomPlayer()
   {
      Player random = new Player();
      int randomNum = (int)(Math.random() * plays.length);
      random = plays[randomNum];
      
      return random;
   }
   
   //getTotalAveragePoints
   public double getTotalAveragePoints()
   {
      double total = 0;
      for (Player play : plays)
      {
         double points = play.getAveragePoints();
         total += points;
      }
      
      return total;
   }
   
   //getAverageNumGames
   public double getAverageNumGames()
   {
      double total = 0;
      for (Player play : plays)
      {
         total += play.getNumGames();
      }
      
      return (double)(total/plays.length);
   }
   
   //getMostNumGames
   public int getMostNumGames()
   {
      int max = 0;
      for (Player play : plays)
      {
         if (play.getNumGames() > max)
         {
            max = play.getNumGames();
         }
      }
      return max;
   }
   
   //getTeamName
   public String[] getTeamNames()
   {
      String [] teamNames = new String[plays.length];
      
      for (int i = 0; i < plays.length; i++)
      {
         teamNames[i] = plays[i].getTeamName();
      }
      
      return teamNames;
   }
   
   //countDidStart
   public int countDidStart()
   {
      int count = 0;
      for (Player play : plays)
      {
         if(play.getDidStart())
         {
            count++;
         }
      }
      return count;
   }
   
   //increaseAveragePoints(c)
   public void increaseAveragePoints(double c)
   {
      for (int i = 0; i < plays.length; i++)
      {
         double value = plays[i].getAveragePoints();
         value += c;
         plays[i].setAveragePoints(value);
      }
   }
   
   //getLongestTeamName
   public Player getLongestTeamName()
   {
      Player p = new Player();
      
      int longest = 0;
      for (Player play : plays)
      {
         int length = play.getTeamName().length();
         if (length > longest)
         {
            longest = length;
            p = play;
         }
      }
      return p;
   }
   
   //toString
   public String toString()
   {
      String output = "";
      for (Player play : plays)
      {
         output += play + "\n";
      }
      return output;
   }
}
