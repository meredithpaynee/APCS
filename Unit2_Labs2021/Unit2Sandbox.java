import java.util.*;
public class Unit2Sandbox
{
   public static void main (String [] args)
   {
      //ask the user to enter her location (city,state)
      //Scanner input = new Scanner(System.in);
      //System.out.print ("Enter your city and state (separated by comma with no space): ");
      //String location = input.nextLine();
      //Task#1
      //print the index of the comma
      //int index = location.indexOf(",");
      //System.out.println(index);
      
      //print only the city
      //String city = location.substring(0,index);
      //System.out.println(city);
      
      //print only the state
      //String state = location.substring(index+1);
      //System.out.println(state);
      
      //print length of city
      //int cityLength = city.length();
      //System.out.println(cityLength);
      
      //print letters from 3-6 inclusive
      //String letters = location.substring(3,7);
      //System.out.println(letters);
      
      
      Unicorn u1 = new Unicorn();
      System.out.println(u1);
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a new age for "+ u1.getName() + ": ");
      int newAge = input.nextInt();
      u1.setAge(newAge);
      
      System.out.println (u1);
      
  }
}
