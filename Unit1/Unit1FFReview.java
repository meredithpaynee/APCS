


import java.util.Scanner;

public class Unit1FFReview
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("What is your name? ");
      String name = input.nextLine();
      
      System.out.print("Enter your average for semester 2: ");
      int sem2 = input.nextInt();
      System.out.print("Enter your semester exam grade: ");
      int exam = input.nextInt();
      System.out.println();
      
      //calculations
      double finalGrade = ((sem2 * .8) + (exam * .2));
      //int roundedGrade = finalGrade;
      
      System.out.println(name + "'s semester average is: " + sem2);
      System.out.println(name + "'s semester exam grade is: " + exam);
      System.out.println(name + "'s semester final grade is: " + finalGrade);
      System.out.println(name + "'s semester rounded grade is: " + (int)finalGrade);
   }
}
