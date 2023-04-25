import java.util.*;
public class OlympicPlayer extends Player
{
   private int yearQualified;
   private String homeCountry;
   private boolean isTalkative;
   
   public OlympicPlayer()
   {
      yearQualified = 2018;
      homeCountry = "Canada";
      isTalkative = true; 
   }
   
   public OlympicPlayer(int n, double a, String t, String p, boolean d, boolean l, int y, String h, boolean i)
   {
      super (n,a,t,p,d,l);
      yearQualified = y;
      homeCountry = h;
      isTalkative = i;      
   }
   
   public int getYearQualified()
   {
      return yearQualified;
   }
   
   public String getHomeCountry()
   {
      return homeCountry;
   }
   
   public boolean getIsTalkative()
   {
      return isTalkative;
   }
   
   public void setYearQualified(int y)
   {
      yearQualified = y;
   }
   
   public void setHomeCountry(String h)
   {
      homeCountry = h;
   }
   
   public void setIsTalkative(boolean i)
   {
      isTalkative = i;
   }
   
   public boolean isTired()
   {
      if (super.isTired() && (homeCountry.substring(0,1).equals("B") || homeCountry.substring(0,1).equals("C")))
      {
         return true;
      }
      return false;
   }
   
   public boolean goodSportsmanship()
   {
      return isTalkative && havingFun();
   }
   
   public String toString()
   {
      String output = "";
      output += super.toString();
      output += "\nYear Qualified: " + yearQualified;
      output += "\nHome Country: " + homeCountry;
      output += "\nIs Talkative: " + isTalkative;
      return output;      
   }
}