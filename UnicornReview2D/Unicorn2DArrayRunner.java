//STUDENT STARTER CODE

import java.util.*;
import java.io.*;
public class Unicorn2DArrayRunner
{
   public static void main (String []args) throws IOException
   {
      // get names from file
      Scanner file = new Scanner (new File("seniorNames2022.dat")); 
      int numSeniors= file.nextInt();
      file.nextLine();
      String [] names = new String[numSeniors];
      int i=0;
      while (file.hasNextLine())
      {
         names[i]=file.nextLine();
         i++;
      }
      
      //make up dummy unicorns
      Unicorn u1 = new Unicorn();
      Unicorn u2 = new Unicorn ("noname", 2, 13.4);
      Unicorn u3 = new Unicorn ("noname", 8, 18.9);
      Unicorn u4 = new Unicorn ("noname", 6, 18.9);
      Unicorn u5 = new Unicorn ("noname", 10, 1.9);
      Unicorn u6 = new Unicorn ("noname", 88, 37.9);
      Unicorn u7 = new Unicorn ("noname", 12, 118.9);
      Unicorn u8 = new Unicorn ("noname", 24, 54.3);
      Unicorn u9 = new Unicorn ("noname", 15, 72.19);
      Unicorn u10 = new Unicorn ("noname", 11, 128.9);
      Unicorn u11 = new Unicorn ("noname", 17, 58.9);     
      
      //instantiate array of unicorns
      Unicorn [] unis = new Unicorn[12];
      unis[0] = u1;
      unis[1] = u2;
      unis[2] = u3;
      unis[3] = u4;
      unis[4] = u5;
      unis[5] = u6;
      unis[6] = u7;
      unis[7] = u8;
      unis[8] = u9;
      unis[9] = u10;
      unis[10] = u11;
      
      //change names of all Unicorns to senior names
      for (i=0; i < unis.length-1; i++)
      {
         unis[i].setName(names[i]);
      }
      
      //needed 12th Unicorn to make 2D complete (no nulls)
      unis[11] = new Unicorn();
      
      //print all Unicorns
      for (Unicorn uni : unis)
         System.out.println (uni);
      
      Unicorn2DArray u2d= new Unicorn2DArray(unis,3,4);  //create 2D with 3 rows/4 cols
      System.out.println (u2d.namesOnly());  
      System.out.println ("First 3 letters: " + u2d.getFirstLetters(3));
      System.out.println ("First 4 letters: " + u2d.getFirstLetters(4));
      System.out.println ("Count age 5 and over: " + u2d.countOver5());
      u2d.addNewLets();
      System.out.println ("\nAll names must have 7 letters!");
      System.out.println (u2d.namesOnly());
      System.out.println ("Who is magical?" + Arrays.toString(u2d.collectIsMagical()));
      System.out.println ("Row 0 = "+ Arrays.toString(u2d.getNthUnicornRow(0)));
      System.out.println ("Row 2 = "+Arrays.toString(u2d.getNthUnicornRow(2)));
      System.out.println ("Row 15 = " + Arrays.toString(u2d.getNthUnicornRow(15)));
      
   }
   

}