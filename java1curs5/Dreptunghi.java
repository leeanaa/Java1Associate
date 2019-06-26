public class Dreptunghi extends FiguraGeometrica{
    int l;
    int L;
    public Dreptunghi(int l ,int L){
        this.l=l;
        this.L=L;
    }
    //public int calculeazaPerimetruDreptunghi(){
        //return 2*l+2*L;
    //}
    
    @Override
    public int calculeazaPerimetru(){
        return 2*l+2*L; 
    }
}