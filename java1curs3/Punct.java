public class Punct{
    int x;
    int y;
    static int suma;
    
    public Punct (int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void scadere(){
        int dif = this.x-this.y ;
    }
    
    public void inmulteste(){
        suma = x*y;
    }
    
    public static void aduna(){
        suma=1+3;
    }
    
    public static int adunare(int a, int b){
        int c= a+b;
        return c;
    }
    
    public static void main (String [] args){
        System.out.println(Punct.adunare(2,3));
        Punct.suma = 5;
        //Punct.x = 3;
        System.out.println(Punct.suma);
        
        Punct p1 = new Punct(1,2);
        p1.suma=p1.x+p1.y;
        System.out.println(p1.suma);
        System.out.println(Punct.suma);
        
        p1.inmulteste();
        System.out.println(Punct.suma);
        Punct.aduna();
    }
}