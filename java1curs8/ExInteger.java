public class ExInteger {
    public static void main (String [] args){
        Integer i = new Integer(5);
        Integer i2 = 5; // boxing
        int i3 = i; //unboxing
        
        int i4 = i.intValue();
        int i5 = Integer.parseInt("123");
        System.out.println(i5);
        
        int i6;
        
        try {
            i6 = Integer.parseInt("123a");
        }catch (NumberFormatException nfe){
            i6=0;
        }
        System.out.println(i6);//trebuie initializat si in try si in catch 
        Integer i7 = Integer.valueOf(7);
        m1(i3);
        m1(i);
        //in metoda statica pot apela doar metode statice
        //altfel trebuia sa fac un obiect 
    }
    
    public static void m1(int i ){
         System.out.println("m1() i"+i);
    }
    public static void m1(Integer i ){
         System.out.println("m2() i"+i);
    }
}
    
