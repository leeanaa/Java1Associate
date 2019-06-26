public class Carte{
    String titlu;
    String autor;
    
    public Carte(String titlu,String autor){
        this.titlu=titlu;
        this.autor=autor;
    }
    public String getTitlu(){
        return this.titlu;
    }
    public String getAutor(){
        return this.autor;
    }
}