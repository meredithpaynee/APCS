/**
 * GraphicsRunner.java  mm/dd/yyyy
 *
 * @author - Mrs. McGurgan
 * @author - Period n
 * @author - Id 212345 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from Pixar.
 *
 */

//Instructions:  this Runner is finished.  You will just need switch
//   comments on lines 30&31 when you complete Graphics2.java

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Circles");					//prints title in title bar of window
		
		setSize(WIDTH, HEIGHT);				//sets size of graphics window

		//you can add only ONE of the ContentPanes below:
		
		getContentPane().add(new Graphics1());
		//getContentPane().add(new Graphics2());

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String []args)
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}