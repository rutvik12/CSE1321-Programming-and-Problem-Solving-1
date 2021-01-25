// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

class Radio
{
    private int station=1;
    private int volume=1;
    private boolean on=false;
    
    public Radio()//Default non-parametrized constructor
    {
       this.station=1;
       this.volume=1;
       this.on=false;
    }
    
    public int getStation()//Get method for Station
    {
      return this.station;
    }
    public int getVolume()//Get method for Volume
    {
      return this.volume;
    }
    public boolean turnOn()//Method that turns On the radio
    {
       this.on=true;
       return this.on;
    }
    public boolean turnOff()//Method that turns Off the radio
    {
       this.on=false;
       return this.on;
    }
    public void stationUp()//Method that increases the station number by 1 if the radio is on
    {
        if(turnOn()==true)
        {
           this.station=this.station+1;
        }
    }
    public void stationDown()//Method that decreases the station number by 2 if the radio is on
    {
       if(this.on==true)
       {
          this.station=this.station-1;
       }
    }
    public void volumeUp()//Method that increases the volume by 1 if the radio is on
    {
       if(this.on==true)
       {
          this.volume=this.volume+1;
       }
    }
    public void volumeDown()//Method that decreases the volume by 1 if the radio is on
    {
       if(this.on==true)
       {
          this.volume=this.volume-1;
       }
    }
    public String toString()//Method the returns a string
    {  
       String radio;
       if(this.on==true)
       {
       radio="The radio station is "+this.station+" and the volume level is "+this.volume;
       }
       else
       {
          radio="The radio is off";
       }
       return radio;
    }
    
}


    
      
   