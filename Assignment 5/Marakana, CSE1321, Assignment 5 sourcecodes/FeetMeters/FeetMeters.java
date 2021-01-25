class FeetMeters
{
    public static void main(String [] args)
    {  System.out.println("Feet     Meter         Meter     Feet");
      
       double k=1.0;
       while(k<=20.0)
       {
          System.out.println(k+"      "+feetToMeter(k)+"          "+k+"      "+meterToFeet(k));
          k++;
       }
    }
    public static double feetToMeter(double j)
    {
       double meter=0.305*j;
       return meter;
     }
    public static double meterToFeet(double j)
    { 
       double feet=3.279*j;
       return feet;
    }
 }
        
         