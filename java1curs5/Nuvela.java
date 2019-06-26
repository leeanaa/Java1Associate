public class Nuvela extends Carte{
    int nrPagini;
    public Nuvela(String titlu,String autor,int nrPagini){
        super(titlu,autor);
        this.nrPagini=nrPagini;
    }
    
    public int getNrPagini(){
        return this.nrPagini;
    }
}