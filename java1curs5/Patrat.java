public class Patrat extends FiguraGeometrica{
    int l;
    
    public Patrat(int l ){
        this.l=l;
        
    }
    //public int calculeazaPerimetruPatrat(){
        //return 4*l;
    //}
    @Override
    public int calculeazaPerimetru(){
        return 4*l; 
    }
}