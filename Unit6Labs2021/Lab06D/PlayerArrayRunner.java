/**
 * PlayerArrayRunner.java     Thu Jan 06 08:52:27 CST 2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.util.*;
public class PlayerArrayRunner
{
   public static void main (String args[])
   {
      Player p0 = new Player();
      Player p1 = new Player(1,4.2,"Bears","Amanda",true,false);
      Player p2 = new Player(5,3.5,"Lions","Erin",false,true);
      Player p3 = new Player(9,63.7,"Tigers","Libby",false,false);
      Player p4 = new Player(10,12.4,"Hippopotami","Renee:",true,true);
      
      //array
      Player[] players = new Player[5];
      
      players[0] = p0;
      players[1] = p1;
      players[2] = p2;
      players[3] = p3;
      players[4] = p4;
      
      PlayerArray pa = new PlayerArray(players);
      
      System.out.println(pa);
      
      System.out.println(pa.getRandomPlayer());
      
      System.out.println(pa.getTotalAveragePoints());
      
      System.out.println(pa.getAverageNumGames());
      
      System.out.println(pa.getMostNumGames());
      
      System.out.println(Arrays.toString(pa.getTeamNames()));
      
      System.out.println(pa.countDidStart());
      
      Scanner input = new Scanner(System.in);
      System.out.print("How much should I increase the average points? ");
      int num = input.nextInt();
      
      pa.increaseAveragePoints(num);
      
      System.out.println(pa);
      
      System.out.println(pa.getLongestTeamName());
      
   }

}
