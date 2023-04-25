public class Player
{
   private int numGames;
   private double averagePoints;
   private String teamName;
   private String playerName;
   private boolean didStart;
   private boolean likeTeam;
   private int waterBottle;
   
   public static int numWaterBottles = 5;
   
   public Player()
   {
      numGames = 2;
      averagePoints = 6.8;
      teamName = "Ursuline Bears";
      playerName = "Meredith";
      didStart = false;
      likeTeam = true;
      waterBottle = numWaterBottles;
      numWaterBottles++;
   }
   
   public Player(int n, double a, String t, String p, boolean d, boolean l)
   {
      numGames = n;
      averagePoints = a;
      teamName = t;
      playerName = p;
      didStart = d;
      likeTeam = l;
      waterBottle = numWaterBottles;
      numWaterBottles++;
   }
   
   public int getNumGames()
   {
      return numGames;
   }
   
   public double getAveragePoints()
   {
      return averagePoints;
   }
   
   public String getTeamName()
   {
      return teamName;
   }
   
   public String getPlayerName()
   {
      return playerName;
   }
   
   public boolean getDidStart()
   {
      return didStart;
   }
   
   public boolean getLikeTeam()
   {
      return likeTeam;
   }
   
   public void setNumGames(int n)
   {
      numGames = n;
   }
   
   public void setAveragePoints(double a)
   {
      averagePoints = a;
   }
   
   public void setTeamName(String t)
   {
      teamName = t;
   }
   
   public void setPlayerName(String p)
   {
      playerName = p;
   }
   
   public void setDidStart(boolean d)
   {
      didStart = d;
   }
   
   public void setLikeTeam(boolean l)
   {
      likeTeam = l;
   }
   
   public boolean havingFun()
   {
      if (likeTeam || didStart)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   
   public boolean isStarPlayer()
   {
      if (didStart && averagePoints >= 15)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   
   public boolean isTired()
   {
      if (isStarPlayer() && numGames >= 10)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public String toString()
   {
      String output = "$$$$$$$$$$$$$$$$";
      output += "\nPlayer Name: " + playerName;
      output += "\nTeam Name: " + teamName;
      output += "\nGames Played: " + numGames;
      output += "\nAverage Points: " + averagePoints;
      output += "\nStarting: " + didStart;
      output += "\nLikes the Team: " + likeTeam;
      output += "\nNumber of Waterbottles: " + waterBottle;
      output += "\n$$$$$$$$$$$$$$$$";
      return output;
   }
}