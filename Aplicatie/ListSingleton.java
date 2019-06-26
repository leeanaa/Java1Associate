import java.util.*;

public class ListSingleton{
    
    private static ListSingleton SINGLETON;
    private ListSingleton(){
    }
    public static final ListSingleton getInstance(){
        if(SINGLETON==null){
            SINGLETON=new ListSingleton();
        }
        return SINGLETON;
    }
    
    private List<Vehicul> list = new ArrayList<>();
    
    public List<Vehicul> getList(){
        return list;
    }
    
    public int getNumarBiciclete() {
        int i = 0;
        for (Vehicul v : list){
            if (v instanceof Bicicleta){
                i++;
            }
        }
        return i;
    }
    
    public int getNumarMasini(){
        int i = 0;
        for(Vehicul v :list){
            if(v instanceof Masina){
                i++;
            }
        }
        return i;
    }
    
    public void afisareLista() {
        list.forEach(System.out::println);
    }
    
    public void adaugareLista(Vehicul v){
        if (list.size()<100){
            list.add(v);
        }
    
    }
}