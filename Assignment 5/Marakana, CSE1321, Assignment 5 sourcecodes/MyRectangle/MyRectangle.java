import java.util.Scanner;
class MyRectangle
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Takes user input for width and height of the rectangle
       System.out.print("Enter the width of the rectangle: ");//Asks the user to enter the width of the rectangle
       int width=sc.nextInt();//Stores the width of the rectangle in variable width
       System.out.print("Enter the height of the rectangle: ");//Asks the user to enter the height of the rectangle
       int height=sc.nextInt();//Stores the height of the rectangle in variable height
       
       isValid(width,height);
       int Area=Area(width,height);//Stores the return value of method area in variable Area 
       int Perimeter=Perimeter(width,height);//Stores the return value of method perimeter in variable Perimeter
       
       System.out.println("Entered width: "+width);
       System.out.println("Entered height: "+height);
       
       if(isValid(width,height)==true)
       {
          System.out.println("Area: "+Area);
          System.out.println("Perimeter: "+Perimeter);
       }
       else
       {
         System.out.println("This is invalid Rectangle.Try again");
       }
    }
    public static boolean isValid(int w,int h)
    {
        if((w+h)>30)
        {
           return true;
        }
        else
        {
           return false;
        }
    }
    public static int Area(int w,int h)
    {   
        int area=0;
        if(isValid(w,h)==true)
        {
            area=w*h;
        }
        return area;
    }
    public static int Perimeter(int w,int h)
    {  
       int perimeter=0;
       if(isValid(w,h)==true)
       {
          perimeter=2*(w+h);
       }
       return perimeter;
    }
 } 
        