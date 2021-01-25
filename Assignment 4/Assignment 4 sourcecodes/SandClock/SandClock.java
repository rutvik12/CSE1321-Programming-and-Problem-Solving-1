class SandClock
{
   public static void main(String [] args)
   {  
   
      for(int i=5;i>=1;i--)
      {
        for(int j=i;j<9;j++)
        {
           System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++)
        {
           System.out.print("*");
        }
        System.out.println();
      }
      
      for(int i=2;i<=5;i++)
      {
         for(int j=i;j<9;j++)
         { 
           System.out.print(" ");
         }
         for(int k=1;k<=i*2-1;k++)
         {
           System.out.print("*");
         }
         System.out.println();
      }
   }
}
      