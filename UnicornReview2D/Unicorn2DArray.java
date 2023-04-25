//STUDENT STARTER CODE

import java.util.*;
public class Unicorn2DArray
{
   Unicorn[][] unis2D;
   
   //constructor is finished
   public Unicorn2DArray(Unicorn[] unis, int rows, int cols)
   {
      unis2D = new Unicorn[rows][cols];
      
      int row=0;
      int col=0;
      int tracker=0;
      for (Unicorn uni : unis)
      {
         unis2D[row][col]=unis[tracker];
         col++;
         if (col>=cols)
         {
            col=0;
            row++;
         }
         tracker++;
      }
   }
   
   //constraints:
   //  n < all Unicorn names.length()
   public ArrayList<String> getFirstLetters(int n)
   {
      
      
      
      
      return null; //needs to be replaced
   }
   // return the count of Unicorns who are at least 5 years old
   public int countOver5()
   {
         

      return 0;         
   }
   
   //all names need to be 8 characters!
   //  chop longer names
   //  concatenate "u" to shorter names
   public void addNewLets()
   {

   }
     //return an array indicating which Unicorns are magical
   public boolean[] collectIsMagical()
   {

      return null;      
   }  
   
   //return an array of an entire row if it exists,
   //  otherwise, return null
   public Unicorn[] getNthUnicornRow(int n)
   {
      
      return null;
   }  


   
   public String namesOnly()
   {
      String output="\n********  Names Only *********\n";
      
      for (int row=0; row< unis2D.length; row++)
      {
         for (int col=0; col<unis2D[0].length; col++)
         {
            if (unis2D[row][col]!=null)
               output += unis2D[row][col].getName()+" ";
            else
               output += "null";
         }
         output += "\n";
      }
      
      
      
      return output;
   }
}