public class Intramurals
{
   private int grade;
   private String theme;
   private double cost;
   
   //default constructor
   public Intramurals ()
   {
      grade = 9;
      theme = "Ninja Turtles";
      cost = 1500;
   }
   
   //initialization constructor
   public Intramurals(double c, String t, int g)
   {
      grade = g;
      theme = t;
      cost = c;
   }
   
   //mutator (setter)
   public void setTheme(String s)
   {
        theme = s;  //reassign new theme
   }
   
   public void setCost(double c)
   {
      cost = c;
   }
   
   public void setGrade(int g)
   {
      grade = g;
   }
   
   //accessors (getters)
   public String getTheme()
   {
      return theme;
   }
   
   public double getCost()
   {
      return cost;
   }
   
   public int getGrade()
   {
      return grade;
   }
   
   public boolean isCool()
   {
      if (grade==11 && cost <1000 && theme.length()<10)
        return true;
      else
        return false;
   }
   
   public int numVotes()
   {
      int n = 100;
      if (isCool())
        n+=100;
      if (cost <10000)
        n+=100;
      return n;
   }
   
   public String toString()
   {
       String output = "\n**";
       output += "\tGrade = "+ grade;
       output += "\tTheme = " + theme;
       output += "\tCost = " + cost;
       
       return output;
   }
}