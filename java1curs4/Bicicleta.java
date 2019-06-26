public class Bicicleta extends Vehicul{
    String cadru;
    
    public Bicicleta(){
        this("");
        //apeleaza constructorul din parinte chiar daca nu pun
        System.out.println("bicicleta");
    }
    
    public Bicicleta(String a){
        super("");
        //apeleaza constructorul din parinte chiar daca nu pun
        System.out.println("bicicleta");
    }
    
    public void m1(){
        cadru="a";
        roti="b";
        this.culoare="c";
        super.frane="d";
    }
}