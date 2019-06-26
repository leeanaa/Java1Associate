public class Produs {
    private final double pret;
    private final Ambalaj ambalaj;
    
    public Produs(double pret,Ambalaj ambalaj){
        this.pret=pret;
        this.ambalaj=new Ambalaj();
        this.ambalaj.material = ambalaj.material;
    }
    
    public double getPret(){
        return this.pret;
    }
    
    public Ambalaj getAmbalaj(){
        return this.ambalaj;
    }
}