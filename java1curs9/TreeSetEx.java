import java.util.*;

public class TreeSetEx
{ 
    public static void main(String [] args){
    
    TreeSet<Integer> list=new TreeSet<>();
    
    list.add(3);
    list.add(2);
    list.add(1);
    
    System.out.println(list);
    
    Pisica p1= new Pisica(3);
    Pisica p2= new Pisica(1);
    
    TreeSet<Pisica> pisici = new TreeSet();
    pisici.add(p1);
    pisici.add(p2);
    
    System.out.println(pisici);
    
    
}
}
