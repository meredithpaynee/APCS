/**
 * TurtleFun.java  09/23/2021
 *
 * @author - Meredith Payne
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * Honorbound: I received help from ... 
 *   and I commented on the line where I received external help
 *
 */
import java.awt.*;

public class TurtleFun {
   public static void main(String[] args) {  
      World world = new World(400,400);
      Turtle t1 = new Turtle(world);
      Turtle t2 = new Turtle(world);
      //Checkpoint#1 Print the two turtle on separate lines
      System.out.println(t1);
      System.out.println(t2);
    
      // Write the line to move t1 forward 50 pixels
      t1.forward(50);
   
      // Write the line to move t2 backward 100 pixels
      t2.backward(100);
   
      // Checkpoint#2 Write the lines to print t1 and t2
      System.out.println(t1);
      System.out.println(t2);
      
      // Write the lines to change t1's name to "Angela" and t2 to "Ursula"
      t1.setName("Angela");
      t2.setName("Ursula");
      
      // Checkpoint #3 Write the lines to print t1 and t2 and verify turtle names
      System.out.println(t1);
      System.out.println(t2);
     
      // Write the line(s) to print the average of Angela and Ursula's y values
      double averageY = (t1.getYPos()+t2.getYPos())/2;
      System.out.println(averageY);
   
      
      // Checkpoint #4 Write the lines to print Angela and Ursula's shell colors
      System.out.println(t1.getShellColor());
      System.out.println(t2.getShellColor());
     
      // Write the line to change Angela's shell color to red; then print her shell color
      t1.setShellColor(Color.red);
      System.out.println(t1.getShellColor());
   
      
      // Write the line to change Angela's body color to black; then print her body color
      t1.setBodyColor(Color.black);
      System.out.println(t1.getBodyColor());
      
      // Checkpoint #5Write lines to change Ursula's body and shell color to your choice; print her colors
      t2.setShellColor(Color.blue);
      System.out.println(t2.getShellColor());
      t2.setBodyColor(Color.green);
      System.out.println(t2.getBodyColor());
     
      // Write the lines to assign Angela's height and width to new variables (ints)
      // Print the variables
      int t1Height = t1.getHeight();
      int t1Width = t1.getWidth();
      System.out.println(t1Height);
      System.out.println(t1Width);   
   
      
      //Checkpoint#6 Write the lines to add 100 to Angela's current width and height; print the new numbers
      int t1NewHeight = t1Height + 100;
      int t1NewWidth = t1Width + 100;
      System.out.println(t1.getName() + " height: " + t1NewHeight);
      System.out.println(t1.getName() + " width: " + t1NewWidth);
   
     
      // Write the lines to move Angela to the lower right corner
      //    rotate her to face the corner
      //    do not show the pen line
      //Checkpoint#7  Print Angela's information
      t1.penUp();
      t1.moveTo(390,390);
      t1.turn(135);
      System.out.println(t1);
    
      // Write the lines to print the total length of angela and ursula's names (using methods)
      System.out.println(t1.getName().length() + t2.getName().length());
      
      //Checkpoint#8 Write the lines to print a random letter from angela's name
      System.out.println(t1.getName().charAt((int)(Math.random())* t1.getName().length()));
    
      // Write the lines to print the distance from angela to ursula
      //   use your Distance formula from math (with decimals)
      double distance = Math.sqrt(Math.pow((t2.getXPos()-t1.getXPos()),2) + Math.pow((t2.getYPos()-t1.getYPos()),2));
      System.out.println(distance);
      
      //The Turtle class has a method called getDistance(x,y) 
      //  which will return the turtle’s distance from a point (x,y).
      //Use this method to find the distance between angela and ursula.
      //compare the results to your previous distance
      //  (they should be the same)
      System.out.println(t1.getDistance(t2.getXPos(),t2.getYPos()));
      
    
      //keep this line as the last line
      world.setVisible(true);
   }
}
