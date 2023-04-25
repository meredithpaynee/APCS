//  Unit 4 Loop Examples
import java.util.Scanner;
public class Unit4LoopExamples

{
   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in);
     
      //#1 write  for-loop to print #s from -100 to 100 
      for (int i = -100; i < 100; i++)
      {
         System.out.println(i);
      }
     
      //#1a convert #1 to a while loop
      int j = -100;
      while (j < 100)
      {
         j++;
         System.out.println(j);
      }
     
      //#2 write a for-loop to print #s from 100 down to -100
      for (int i = 100; i >= -100; i--)
      {
         System.out.println(i);
      }
      
      //#3   
      // ask the user to enter a word
      // ask the user to enter a number
      // write a for-loop to print the word 'number' times
      System.out.print ("Enter a word:" );
      String word = input.nextLine();
      System.out.print ("Enter a number: ");
      int number = input.nextInt();
      
      for (int i = 1; i <= number; i++)
      {
         System.out.println(word);
      }

      
      //#4
      // print the #s from 0-100 that are divisible by 'number'
      

      
      //#5
      //create a new word that is reversed 'word'
      String reverse = "";
      
      for (int i = word.length()-1; i >= 0; i--)
      {
         System.out.print(word.substring(i,i+1));
        
      }

      System.out.println ("original word is: "+  word);
      System.out.println ("reversed word is: "+  reverse);
/*     
      //#7  Show the output
      int n=2;
      int t=0;
      while (n<9)
      {
           n+=3; 
           t+=n;
      }
      System.out.println ("t="+t);
      
      //#8 Show the output
      System.out.println (); //blank line intended
      int n1 = 9;
      if (n1 >= 2)
          System.out.print ("1");
      if (n1 <= 7)
          System.out.print ("2");
      else
          System.out.print ("3");
       
      //#9 Show the output
      System.out.println (); //blank line intended
      int k=0;
      while (k<3)
      {
           System.out.print (k);
           k++;
      }
      System.out.println ("\nk= " + k);
      
      //#10 Show the output
      String yah="ursuline";
      System.out.println ("\nsubstring length: " + yah.substring(0,0).length());
      
*/      
   }
}
