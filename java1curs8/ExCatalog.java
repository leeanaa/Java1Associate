public class ExCatalog {
    public static void main (String [] args){
        Catalog catalog = new Catalog ();
        catalog.setNota(1);
        catalog.setNota("FB");
        //a luat automat object
        
        Catalog<Integer> catalog2 = new Catalog<>();
        //catalog2.setNota("FB");
        catalog.setNota(1);
        Catalog<String> catalog3 = new Catalog<String>();
        catalog.setNota("FB");
        Catalog<?> catalog4 = new Catalog<Integer>();
        Catalog<? extends Number> catalog5 = new Catalog<Integer>();
        Catalog<? super Integer> catalog6 = new Catalog<Number>();
    }
}