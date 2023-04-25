/**
 * Graphics1.java  mm/dd/yyyy
 *
 * @author - Jane Doe
 * @author - Period 4
 * @author - Id 21nnnn Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.*;
import java.util.*;

public class Graphics1 extends Canvas
{
   public Graphics1()
   {
   	//sets background of graphics window
      setBackground(Color.green);							
   }
	
   public void paint(Graphics window)
   {
      window.setColor(Color.blue);
      window.drawRect(10, 10, 100, 50);
      window.drawString("Graphics 1", 30, 30);
   
   	//**continue with remaining shapes
      
    
   }
}

