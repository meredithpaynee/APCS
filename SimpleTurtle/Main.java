/**
 * Lab01E.java  08/27/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * Honorbound: I received help from n/a
 *   and I commented on the line where I received external help
 *
 */
 
import java.awt.*;

public class Main 
{
   public static void main(String[] args) 
   {  
      World world = new World(400,400);
      Turtle yertle = new Turtle(world);
      // Add your own code in here 
      Color prettyColor = new Color (238,59,59);
      yertle.setColor(prettyColor);
      //design
      yertle.forward();
      yertle.turnRight();
      yertle.forward();
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnLeft();
      yertle.forward(170);
      yertle.turnLeft();
      yertle.forward(30);
      yertle.turnLeft();
      yertle.forward(30);
      yertle.turnLeft();
      yertle.forward(30);
      yertle.turnRight();
      yertle.penUp();
      yertle.turnRight();
      yertle.forward(180);
      yertle.penDown();
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnRight();
      yertle.forward(30);
      yertle.turnLeft();
      yertle.forward(170);
      yertle.turnLeft();
      yertle.forward(30);
      yertle.turnLeft();
      yertle.forward(30);
      yertle.turnLeft();
      yertle.forward(30);
      yertle.turnRight();
      yertle.forward(70);
      yertle.turnRight();
      yertle.forward(90);
      yertle.turnLeft();
      //first initial
      yertle.penUp();
      yertle.forward(70);
      yertle.turnLeft();
      yertle.forward(20);
      yertle.turnLeft();
      yertle.turnLeft();
      yertle.penDown();
      yertle.forward(40);
      yertle.turnRight();
      yertle.forward(10);
      yertle.turnRight();
      yertle.forward(20);
      yertle.turnLeft();
      yertle.turnLeft();
      yertle.forward(20);
      yertle.turnRight();
      yertle.forward(10);
      yertle.turnRight();
      yertle.forward(40);
      //second initial
      yertle.penUp();
      yertle.turnLeft();
      yertle.forward(100);
      yertle.penDown();
      yertle.turnLeft();
      yertle.forward(40);
      yertle.turnRight();
      yertle.forward(20);
      yertle.turnRight();
      yertle.forward(20);
      yertle.turnRight();
      yertle.forward(20);
      //turtle to center
      yertle.penUp();
      yertle.forward(50);
      yertle.turnRight();
      
      world.setVisible(true);
      
   }
}
