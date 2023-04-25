import java.awt.*;
public class TurtleTestDistance
{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);
      
      double distance1 = 0; //will be used later to calc yertle distance from (0,0)        
      double distance2 = 0; //will be used later to calc yertle distance from a new turtle

      // Can you find yertle's distance from the point (0,0)?
      distance1 = yertle.getDistance(0,0);

      // Can you find the distance between 2 turtles?

      System.out.println ("The Distance between yertle and (0,0) is: " + distance1);
      System.out.println ("The Distance between two turtle is: "  + distance2);
      world.show(true);
  }
}
