
import java.util.*;
public class ArrayDequeEx
{ public static void main (String [] args)
    { ArrayDeque<Integer> list=new ArrayDeque<>();
       list.push(2); //add first
       list.push(3); //add first
       
       
       list.offer(4); //add last
       
       
       System.out.println(list);
       System.out.println(list.peek());//il intoarce pe primul element , nu il sterge
       
       System.out.println(list);
       
       System.out.println(list.poll());
       System.out.println(list.poll());
       System.out.println(list);
       System.out.println(list.poll());
       System.out.println(list.pop());
       
       
       
    }
}
