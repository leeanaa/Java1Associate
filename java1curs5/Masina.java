public class Masina {
    String marca;
    String culoare;
    
    public Masina(String marca,String culoare){
        this.marca=marca;
        this.culoare=culoare;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getCuloare(){
        return this.culoare;
    }
}