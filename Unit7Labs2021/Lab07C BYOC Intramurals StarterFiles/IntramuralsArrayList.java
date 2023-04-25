//Student version
import java.util.*;
public class IntramuralsArrayList
{
   private ArrayList<Intramurals> list;
  
   public IntramuralsArrayList()
   {
      // skip
   }
  
   public IntramuralsArrayList(ArrayList<Intramurals> intra)
   {
    //instantiate new list
    list = new ArrayList<Intramurals>();
      
    //add all from intra to list
    for (Intramurals item : intra)
    {
      list.add(item);
    } 
   }
   
   public ArrayList <Intramurals> getList()
   { 
     return list;
   }
   
   public double getTotalCost()
   {
      double total = 0.0;
      for (Intramurals item : list)
      {
         double c = item.getCost();
         total += c;
      }
      return total;
   }
   
   // return array of themes
   public String[] getThemes()
   {
      String[] themes = new String[list.size()];
      for (int i = 0; i < themes.length; i++)
      {
         themes[i] = list.get(i).getTheme();
      }      
      return themes;
   }
   
   //return ArrayList of cool intramurals only
   public ArrayList<Intramurals> getCoolIntras()
   {
      ArrayList<Intramurals> coolOnes = new ArrayList<Intramurals>();
      for (Intramurals item : list)
      {
         if (item.isCool())
         {
            coolOnes.add(item);
         }
      }
      return coolOnes;  
   }
   
   // return grade with most votes
   public int getMostVotes()
   {
      int votes = 0;
      int grade = 0;
      for (Intramurals item : list)
      {
         if (item.numVotes() > votes)
         {
            votes = item.numVotes();
            grade = item.getGrade();
         }
      }
      return grade;
   }
   
   //return array with remaining budget
   public double[] remainingBudget(int[] moneySpent)
   {
      double[] leftovers = new double[list.size()];
      for (int i = 0; i < list.size(); i++)
      {
         double c = list.get(i).getCost();
         double r = c - moneySpent[i];
         leftovers[i] = r;
      }


      return leftovers;
   }
}
  
