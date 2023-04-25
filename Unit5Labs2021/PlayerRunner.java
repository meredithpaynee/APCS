public class PlayerRunner
{
   public static void main (String args[])
   {
      Player p1 = new Player();
      Player p2 = new Player(5, 18.3, "BL Friars", "Rachel", false, false);
      
      System.out.println(p1);
      System.out.println(p2);
      
      System.out.println(p1.getAveragePoints());
      System.out.println(p2.getDidStart());
      
      p2.setNumGames(7);
      p1.setPlayerName("Amanda");
      
      System.out.println(p1.havingFun());
      System.out.println(p2.isStarPlayer());
      System.out.println(p1.isTired());
      
   }
}