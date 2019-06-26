public class Articol{
    private String denumire;
    private double pret;
    private boolean disponibilitate;
    
    public Articol (String denumire, double pret, boolean disponibilitate ){
        this.denumire = denumire;
        this.pret = pret;
        this.disponibilitate=disponibilitate;
    }
    
    public void setDenumire (String denumire){
        this.denumire=denumire;
    }
    
    public String getDenumire(){
        return this.denumire;
    }
}