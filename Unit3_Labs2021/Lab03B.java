/**
 * Lab03B.java  10/5/2021
 *
 * @author - Meredith Payne  
 * @author - Period 4
 * @author - Id 222132 Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from n/a
 *
 */
import java.util.Scanner;
public class Lab03B
{
   //this method will return the Pig Latin result of 'word'
   public static String getPigLatin(String word)
   {
      String result = "";
      word = word.toLowerCase();
         // **create result to be the Pig latin translation
      if (word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' || word.charAt(0)=='o' || word.charAt(0)=='u')
      {
         result = word + "way";
      }
      else
      {
         result = (word.substring(1) + word.charAt(0) + "ay");
      }
      return result;
   }

  
   public static void main(String [] args)
   {
      Scanner input = new Scanner (System.in);
      System.out.print ("Enter a sentence: " );
      String sent = input.nextLine();
      String [] words = sent.split(" ");
   		
   		//**Display title here
      System.out.println("\t\t\t\tMy Pig Latin Translator");
      System.out.println("\t\t\t\t\tBy: Meredith Payne");         		
      System.out.println ("your original sentence is: " + sent);
      System.out.print ("your pig latin is: ");
      for (String word  : words)
      {
         System.out.print (getPigLatin(word)+ " ");
      }
   }
}
