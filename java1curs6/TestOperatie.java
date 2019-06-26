public class TestOperatie{
    public static void main (String [] args){
        Operatii o1 = new Operatii(){
            public int aduna(int x, int y){
                return x+y;
            } 
        };
        Operatii o2 = new Operatii(){
            public int aduna(int x, int y){
                return x+y+3;
            } 
        };
        
        Operatii o3 = (int x, int y)->{return x+y+5;};
        Operatii o4 = ( x, y) -> {return x+y+5;};
        Predicat p1=  (int x) ->  {return x%2==0;};
        Predicat p2= new Predicat(){
            public boolean test(int x){
                return x%2==0;
            }
        };
        Predicat p3=   x ->  {return x%2==0;};
        Predicat p4=   x ->   x%2==0;
        Operatii o5 = ( x, y) ->(x+y)*2;
        m1(o1); 
        m1(o2);
        m1(o5);
        int z=2;
        m1(( x, y) ->(x+y)*4+z);
        //z=6;
    }   
        
    public static void m1(Operatii o){
       int x=3;
       int y=5;
          
       int total=o.aduna(x,y);
       System.out.println(total);
            
    }
    
}