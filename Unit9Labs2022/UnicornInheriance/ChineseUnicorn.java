//Student Starter Code
import java.util.*;
public class ChineseUnicorn extends Unicorn
{
   private boolean detectGoodOrEvil;
   private int numHorns;
   private ArrayList<String> symbols;
   private int idNum;
   
   public static int nextIDNum = 300;

   public ChineseUnicorn()
   {
      detectGoodOrEvil= false;
      numHorns = 2;
      symbols = new ArrayList<String>();
      //idNum = (int)(Math.random()*5000);
      idNum = nextIDNum;
      nextIDNum++;
   }
   
   public ChineseUnicorn(String n, int a, double c, boolean d, int h, ArrayList<String> s)
   {
      super (n,a,c);
      //idNum = (int)(Math.random()*5000);
      idNum = nextIDNum;
      nextIDNum++;
      detectGoodOrEvil=d;
      numHorns = h;
      symbols = new ArrayList<String>();
      for (String item : s)
         symbols.add(item);
   }
   
   public boolean getDetectGoodOrEvil()
   {
      return detectGoodOrEvil;
   }
    
   public int getNumHorns()
   {
      return numHorns;
   }
    
   public ArrayList<String> getSymbols()
   {
      return symbols;
   }
   
   
   public void setIDNum(int n)
   {
      idNum = n;
   }
   
   public void setDetectGoodOrEvil(boolean d)
   {
      detectGoodOrEvil = d;
   }
   
   public void setNumHorns (int h)
   {
      numHorns = h;
   }
   
   public void setSymbols(ArrayList<String> s)
   {
      symbols = s;
   }
   
   public static void resetNextIDNum(int value)
   {
      nextIDNum = value; 
   }
   
   
   //isMagical is true if Chinese Unicorn:
   //  name begins with "Z"
   //  age is between 800 and 900
   //  can detect good or evil
   public boolean isMagical() //overloads the isMagical from superclass
   {
      //calling the super isMagical()
      return super.isMagical() && getDetectGoodOrEvil();
   }
   
   //isForeverUnicorn is true if Chinese Unicorn:
   //   over 500 years old
   //   more than 1 horn
   //   symbolizes "prosperity"
   public boolean isForeverUnicorn()
   {
      if(getAge() > 500 && getNumHorns() > 1)
      {
         for (String symbol : symbols)
         {
            if(symbol.equals("prosperity"))
            {
               return true;
            }
         }
      }      
      return false;
   }
   
   public String toString()
   {
      String output = "";
      output += super.toString(); //get everything from super toString and add the rest on
      output += "\nDetect Good vs Evil: " + detectGoodOrEvil;
      output += "\nNumber of Horns: " + numHorns;
      output += "\nSymbolizes: " + symbols;
      output += "\nChinese ID Num: " + idNum;
      
      return output;
   }
}
/*
DetectGoodOrEvil boolean
  numberOfHorns int
  Shape String ox,deer,horse
  Symbol ArrayList<String> luck, prosperity, success, longevity
*/