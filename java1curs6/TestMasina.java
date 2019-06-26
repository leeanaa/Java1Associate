public class TestMasina {
    
    public static void main (String [] args){
        Masina m = new Masina ("BMW","320");
        System.out.println(m.getClass());
        System.out.println(m.hashCode());
        System.out.println(m);
        //afiseaza numele clasei @ val hash code-uli in hexa
        //apeleaza ToString-ul implicit
        
    }
}