public class Masina{
    public String marca = "vw";
    public int putere = 140;
    
    
    {
        System.out.println("Valoarea marcii inainte de blocul de init:" + marca);
        marca="BMW";
    }
    
    public Masina(){
    
    }
    
    public Masina(String m, int p){
        System.out.println("Valoarea marcii inainte de blocul de constructor:" + marca);
        marca=m;
        System.out.println("Valoarea puterii inainte de blocul de constructor:" + putere);
        putere=p;
    }
    
    {
        System.out.println("Putere"+putere);
        putere=50;
    }
    
    public void franeaza() {
        System.out.println("Masina franeaza");
    }
    
    public void accelereaza(){
        System.out.println("Masina cu marca "+marca+" a accelerat");
    }
    
    public static void main (String [] args){
        /*Masina m1 = new Masina();
        
        m1.marca = "Audi";
        m1.putere = 82;
        m1.franeaza();
        m1.accelereaza();*/
        
        Masina m2 = new Masina ("Skoda",100);
        m2.franeaza();
        m2.accelereaza();
        
        
    }
}