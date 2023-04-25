/**
 * PlayerArrayListRunner.java     Thu Jan 27 14:26:56 CST 2022
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.util.*;

public class PlayerArrayListRunner
{
public static void main (String [] args)
{
   ArrayList<Player> players = new ArrayList<Player>();
   Player p0 = new Player();
	Player p1 = new Player(1,4.2,"Bears","Amanda",true,false);
	Player p2 = new Player(5,3.5,"Lions","Erin",false,true);
	Player p3 = new Player(9,63.7,"Tigers","Libby",false,false);
   Player p4 = new Player(10,12.4,"Hippopotami","Renee:",true,true);
   
   players.add(p0);
   players.add(p1);
   players.add(p2);
   players.add(p3);
   players.add(p4);
   
   PlayerArrayList first = new PlayerArrayList(players);

   System.out.println (first.getList());
   System.out.println ("Total Games: " + first.getTotalNumGames());
   System.out.println ("Starters: " + first.playersStarted());
   System.out.println ("Longest Team Name: " + first.getLongestName());
   
    int[] pointsScored = new int[players.size()];
    pointsScored[0] = 5;
    pointsScored[1] = 9;
    pointsScored[2] = 13;
    pointsScored[3] = 0;
    
    double[] newPointsScored = new double[players.size()];
    newPointsScored = first.newPointsScored(pointsScored);
    System.out.println ("New Points: " + Arrays.toString(newPointsScored));

}
}
