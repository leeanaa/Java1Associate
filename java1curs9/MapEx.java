import java.util.*;

public class MapEx
{
    public static void main (String [] args){
    Map<Integer, String> map =new HashMap<>();
    
    //Map<Integer, HashMap(Integer, String>> map =new HashMap<>();
    map.put(1, "p1");
    map.put(2, "p2");
    map.put(1, "p3");
    
    
    Set<Integer> sets = map.keySet();
    for (Integer i: sets){
        System.out.println(i + " " +map.get(i));
    }
    
    map.forEach((k,v)-> System.out.println(k + " "+map.get(k) +  " " +v));
    
    //intoarce pereche cheie valoare
    
    
    }
    
}
