import java.util.*;
public class LinkedListEx
{
    public static void main (String [] args)
    { LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.removeFirst();
        list.removeLast();
        
        //list.addLast(3);
        System.out.println(list);
        
        
    }
    
    
}
