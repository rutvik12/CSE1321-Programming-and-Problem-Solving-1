class Counter
{
    private int counter=0;
    
    public void increment()//Method that increments the value of counter
    {  
       int a=getValue();
       a++;
       counter=a;
    }
    public int getValue()//Method that returns the current value of counter
    {
       return counter;
    }
}
    
    