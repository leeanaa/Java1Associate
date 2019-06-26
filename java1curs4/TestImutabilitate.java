public class TestImutabilitate{
    public static void main (String [] args){
        Ambalaj a = new Ambalaj();
        a.material="sticla";
        Produs p = new Produs(2.5,a);
        
        //p.pret=3.5;
        //p.setPret(2,3);
        
        //p.ambalaj = new Ambalaj();
        
        p.getAmbalaj().material = "plastic";
        
        //p.pret=2.5;
        //p.ambalaj = new Ambalaj();
        //p.ambalaj.material = "plastic";
        //System.out.println(p.ambalaj.material);
    }
}