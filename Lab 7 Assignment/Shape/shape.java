// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class shape
{
   public static void main(String [] args)
   {
      for(int i=1;i<=8;i++)
      {
         for(int j=8;j>i;j--)
         {
            System.out.print(" ");//Prints blank space
         }
         for(int k=1;k<=2*i-1;k++)
         {
            System.out.print("*");//Prints *
         }
         System.out.println();
      }
   }
}