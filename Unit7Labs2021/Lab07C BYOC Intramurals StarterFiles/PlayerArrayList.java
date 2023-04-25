/**
 * PlayerArrayList.java     Thu Jan 27 14:25:11 CST 2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
import java.util.*;

public class PlayerArrayList
{
   private ArrayList<Player> list;
  
   public PlayerArrayList()
   {
   }
  
   public PlayerArrayList(ArrayList<Player> play)
   {
    list = new ArrayList<Player>();
    
    for (Player item : play)
    {
      list.add(item);
    } 
   }
   
   //returns the ArrayList getList()
   public ArrayList <Player> getList()
   { 
     return list;
   }
   
   //return total number of games
   public int getTotalNumGames()
   {
      int total = 0;
      for (Player item : list)
      {
         int n = item.getNumGames();
         total += n;
      }
      return total;
   }

   //ArrayList of the players that started
   public ArrayList<Player> playersStarted()
   {
      ArrayList<Player> starters = new ArrayList<Player>();
      for (Player item : list)
      {
         if (item.getDidStart() == true)
         {
            starters.add(item);
         }
      }
      return starters;  
   }
   
   //return name of team that has the most letters
   public String getLongestName()
   {
      String name = "";
      for (Player item : list)
      {
         if (item.getTeamName().length() > name.length())
         {
            name = item.getTeamName();
         } 
      }
      return name;
   }
   
   //return array with new points after game
    public double[] newPointsScored(int[] points)
    {
       double[] newPoints = new double[list.size()];
       for (int i = 0; i < list.size(); i++)
       {
          double c = list.get(i).getAveragePoints();
          double r = (double)(c) + points[i];
          newPoints[i] = r;
       }
       return newPoints;
   }
}
