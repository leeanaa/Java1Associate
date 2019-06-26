public class MasinaF1 extends Masina{
    String marca;//placute de franare
    String pilot;
    public MasinaF1
        (String marca, String culoare, String marcaPlacute,String pilot){
            super(marca,culoare);
            this.marca=marcaPlacute;
            this.pilot=pilot;
    }
    
    public String getPilot(){
        return this.pilot;
    }
    
    public String getMarcaPlacute(){
        return this.marca;
    }
    
    public String getMarcaMasina(){
        return super.marca;
    }
}