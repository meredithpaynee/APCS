//Student Starter Code
import java.util.*;
public class UnicornRunner
{
   public static void main (String [] args)
   {
      Unicorn u1 = new Unicorn();
      Unicorn u2 = new Unicorn ("Emerald", 12,34.4);
      ArrayList<String> syms = new ArrayList<String>();
      syms.add ("prosperity");
      syms.add ("luck");
      ChineseUnicorn u3 = new ChineseUnicorn("Zippie", 834, 54.4, true, 2, syms);
      
      ChineseUnicorn u4 = new ChineseUnicorn();
      System.out.println (u1);
      System.out.println (u2);
      System.out.println (u3);
      System.out.println (u4);
      
      System.out.println (u3.isForeverUnicorn());  //true
      System.out.println (u3.isMagical());  //true
      System.out.println (u1.isMagical());  //false

//demonstrate static method

      System.out.println ("Next ID Num: " + ChineseUnicorn.nextIDNum);//302
           
      ChineseUnicorn.resetNextIDNum(5000); 
      ChineseUnicorn u5 = new ChineseUnicorn();
      System.out.println (u5);
      
      
      System.out.println ("Next ID Num: " + ChineseUnicorn.nextIDNum); //5001
      
      
      ArrayList<Unicorn> list = new ArrayList<Unicorn>();
      System.out.println(list);
      
      list.add(u1);
      list.add(u2);
      System.out.println(list);
      list.add(u3);
      list.add(u4);
      
      for (Unicorn unis : list)
      {
         System.out.println(unis.isGoodOrEvil());
      }
      
      
   }
   
}