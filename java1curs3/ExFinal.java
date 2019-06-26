public class ExFinal {
    final int a; // = 5;
    static final int b; //=3;
    static final double PI = 3.14;
    
    {
        //a=6;
        //b=5;nu merge aici tre sa primeasca val inainte-in bloc static anonim sau sus
    }
    
    static{
        b=5;
    }
    
    public ExFinal(){
        a=10;
        //b=5;nu merge aici tre sa primeasca val inainte de constructor
    }
    
    public void init(){
        //a=3;
    }
    
}