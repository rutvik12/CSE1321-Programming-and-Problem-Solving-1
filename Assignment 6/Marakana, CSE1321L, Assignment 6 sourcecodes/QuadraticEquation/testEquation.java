import java.util.Scanner;
class testEquation{

   public static void main(String args[]){
      
      
      Scanner sc=new Scanner(System.in);//Takes the user input for varaibles a,b,c
      System.out.print("Enter the first coefficient of the quadratic equation: ");//Asks the user to enter first coefficient
      int a=sc.nextInt();//Stores the first coefficient in varaible a
      System.out.print("Enter the second coefficient of the quadratic equation: ");//Asks the user to enter second coefficient
      int b=sc.nextInt();//Stores the second coefficient in variable b
      System.out.print("Enter the third coefficient of the quadratic equation: ");//Asks the user to enter third coefficient
      int c=sc.nextInt();//Stores the third coefficient in variable c
     

      QuadraticEquation D = new QuadraticEquation(a,b,c);//Creates and object D of class QuadraticEquation
     
      System.out.println("a = " + D.getA());
      System.out.println("b = " + D.getB());
      System.out.println("c = " + D.getC());

      if(D.getDiscriminant() > 0)
      {
         System.out.println("Root 1 = " + D.getRoot1());
         System.out.println("Root 2 = " + D.getRoot2());
      }
      
      else 
      {
          System.out.println("Root 1 = undefined");
         System.out.println("Root 2 = undefined");
      }
   }
}