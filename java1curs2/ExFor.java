public class ExFor {
    public static void main (String [] args){
        for(int a = 0,b=1;a<=10&&b<=5;a++,b++){
           System.out.println(a); 
        }
        int b = 0;
        for(;;){
           System.out.println(b); 
           b++;
           if (b==11) {break;}
        }
    }
}