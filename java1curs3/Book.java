public class Book{
    String autor = "Eminescu";
    String titlu = "Luceafarul";
    static int nrPagini=50;
    
    {
        System.out.println("Autor inainte de bloc de initializare"+this.autor);
        this.autor="Blaga";
        System.out.println("Titlu inainte de bloc de initializare"+this.titlu);
        this.titlu="Eu nu strivesc";
    }
    
    static{
       System.out.println("Nr pagini inainte de bloc de init static"+nrPagini);
       nrPagini = 100; 
    }
    
    public Book (String autor, String titlu){
        System.out.println("Autor inainte de constructor"+this.autor);
        this.autor=autor;
        System.out.println("Titlu inainte de constructor"+this.titlu);
        this.titlu=titlu;
        System.out.println("Nr pagini inainte de constructor"+nrPagini);
    }
    public static void main (String [] args){
        Book b1 = new Book ("Bacovia","Lacustra");
        Book b2 = new Book ("Creanga","Amintiri din copilarie");
    }
}