import java.util.*;

public class ListSingleton {//constructor privat
    //tinem minte intro variabila de tip static ..list(
    List<Vehicul> list = new ArrayList<>();
    private static ListSingleton mySingletonInstance = new ListSingleton ();
    private ListSingleton(){
    }
    
    public static ListSingleton getInstance(){//sa o faci static sa ajungi la ea 
        return mySingletonInstance;
    }
    
    public List<Vehicul> getList(){
        return list;
    }
    
    public int getNrMasini(){
        int contor=0;
        for(Vehicul v: list) {
            if (v instanceof Masina)
            contor++;
            
        }
        return contor;
    }
        
    public int getNrBiciclete(){
        int contor=0;
        for(Vehicul v: list) {
            if (v instanceof Bicicleta)
            contor++;
            
        }
        return contor;
       
    }

}

