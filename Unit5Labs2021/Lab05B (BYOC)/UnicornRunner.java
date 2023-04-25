gpublic class UnicornRunner
{
   public static void main (String args[])
   {
      Unicorn u1 = new Unicorn("Magic",12,5.6);
      Unicorn u2 = new Unicorn("Uni", 64,55.12);
      Unicorn u3 = new Unicorn();
      System.out.println (u1);
      System.out.println (u2);
      System.out.println (u3);
      
      
      
      u1.setName("Rainbow");
      u1.setNumCoins(500);
      System.out.println (u1);
     
      System.out.println ("\nIs " + u2.getName() + " magical?" + u2.isMagical());
   }
}