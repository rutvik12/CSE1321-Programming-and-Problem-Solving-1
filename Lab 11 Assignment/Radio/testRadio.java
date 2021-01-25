// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class testRadio
{
   public static void main(String [] args)
   {  
       Radio obj=new Radio();//Object obj of class Radio is created
       
       System.out.println("Turn radio on");
       obj.turnOn();//Object calls the method turnOn() of class Radio
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Turn the volume up by 3:");
       obj.volumeUp();//Object calls the method volumeUp() of class Radio
       obj.volumeUp();//Object calls the method volumeUp() of class Radio
       obj.volumeUp();//Object calls the method volumeUp() of class Radio
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Move station up by 5:");
       obj.stationUp();//Object calls the method stationUp() of class Radio
       obj.stationUp();//Object calls the method stationUp() of class Radio
       obj.stationUp();//Object calls the method stationUp() of class Radio
       obj.stationUp();//Object calls the method stationUp() of class Radio
       obj.stationUp();//Object calls the method stationUp() of class Radio
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Turn volume down by 1:");
       obj.volumeDown();//Object calls the method volumeDown() of class radio
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Move station up by 3:");
       obj.stationUp();//Object calls the method stationUp() of class Radio
       obj.stationUp();//Object calls the method stationUp() of class Radio
       obj.stationUp();//Object calls the method stationUp() of class Radio
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Turn radio off:");
       obj.turnOff();//Object calls the method turnOff() of class Radio
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Turn volume up by 2:");
       obj.volumeUp();//Object calls the method volumeUp() of class Radio
       obj.volumeUp();//Object calls the method volumeDown() of class Radio 
       System.out.println("     "+obj.toString());
       System.out.println();
       
       System.out.println("Turn station down by 2:");
       obj.stationDown();//Object calls the method stationDown() of class Radio
       obj.stationDown();//Object calls the method stationDown() of class Radio
       System.out.println("     "+obj.toString());
     }
}
       
       
       
       