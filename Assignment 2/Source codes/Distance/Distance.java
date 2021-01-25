import java.util.Scanner;
class Distance
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);//Takes user input for X1,Y1,X2,Y2
      float X1=sc.nextFloat();
      float Y1=sc.nextFloat();
      float X2=sc.nextFloat();
      float Y2=sc.nextFloat();
      double Distance=Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));//Calculates the distance between two points
      
      System.out.println("Entered X1:"+X1);
      System.out.println("Entered Y1:"+Y1);
      System.out.println("Entered X2:"+X2);
      System.out.println("Entered Y2:"+Y2);
      System.out.println("Distance:"+Distance);
      
    }
    
}
      