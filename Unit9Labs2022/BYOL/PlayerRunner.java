import java.util.*;
public class PlayerRunner
{
   public static void main (String args[])
   {
      Player p1 = new Player();
      Player p2 = new Player(5, 18.3, "BL Friars", "Rachel", false, false);
      OlympicPlayer p3 = new OlympicPlayer();
      OlympicPlayer p4 = new OlympicPlayer(7, 12.5, "Tigers", "Samuel", true, false, 1972, "Benin", false);
      
      //print objects
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p3);
      System.out.println(p4);
      
      //polymorphic with Players
      System.out.println(p1.isTired());
      System.out.println(p2.isTired());
      //polymorphic with Olympic Players
      System.out.println(p3.isTired());
      System.out.println(p4.isTired());
      
      //subclass method
      System.out.println(p3.goodSportsmanship());
      System.out.println(p4.goodSportsmanship());
      
      
      ArrayList<Player> list = new ArrayList<Player>();
      list.add(p1);
      list.add(p2);
      list.add(p3);
      list.add(p4);
      
      for (Player person : list)
      {
         System.out.println(person);
      }
      
      for (Player person : list)
      {
         System.out.println(person.isTired());
      }
      
   }
}