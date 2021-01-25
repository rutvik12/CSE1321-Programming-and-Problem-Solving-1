import java.util.Scanner;
class Circles
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);//Takes user input for the coordinates of center and radius of two circles
      System.out.print("Enter the X-coordinate of the center of circle 1: ");//Asks the user to enter the X-coordiante of center of circle 1
      int X1=sc.nextInt();//Stores the value of X-coordinate of center of circle 1 in variable X1
      System.out.print("Enter the Y-coordinate of the center of circle 1: ");//Asks the user to enter the Y-coordiante of center of circle 1
      int Y1=sc.nextInt();//Stores the value of Y-coordinate of center of circle 1 in variable Y1
      System.out.print("Enter the X-coordinate of the center of circle 2: ");//Asks the user to enter the X-coordiante of center of circle 2
      int X2=sc.nextInt();//Stores the value of X-coordinate of center of circle 2 in variable X2
      System.out.println("Enter the Y-coordinate of the center of circle 2");//Asks the user to enter the Y-coordiante of center of circle 2
      int Y2=sc.nextInt();//Stores the value of Y-coordinate of center of circle 2 in variable Y2
      System.out.print("Enter the radius of circle 1: ");//Asks the user to enter the radius of circle 1
      int R1=sc.nextInt();//Stores the value of radius of circle 1 in variable R1
      System.out.print("Enter the radius of circle 2: ");//Asks the user to enter the radius of circle 2
      int R2=sc.nextInt();//Stores the value of radius of circle 2 in variable R2
      System.out.println("Circle 1 center is: ("+X1+","+Y1+")");
      System.out.println("Circle 1 radius is: "+R1);
      System.out.println("Circle 2 center is: ("+X2+","+Y2+")");
      System.out.println("Circle 2 radius is: "+R2);
      
      int sum_radius=R1 + R2;
      double distance_center=(Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1)));

         
              if (distance_center<=(R2-R1)){
                    System.out.println("Judgment: Circle 1 is completely inside Circle 2");
              }
         
              else if(distance_center<=(R1-R2)){
                    System.out.println("Judgment: Circle 2 is completely inside Circle 1");
               }
         
              else if (distance_center>sum_radius){
                   System.out.println("Judgment: Circle 2 is completely outside Circle 1");
               }
              else{
               System.out.println("Judgment: Circle 2 overlaps Circle 1");
               }
         
    }
}

      
      