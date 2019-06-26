public class ExWhile {
    public static void main (String [] args){
        int a =1;
        while (a<=10) {
            System.out.println(a++);
        }
        int b = 0;
        while (b<=10){
            if (b%2 == 0) {
                System.out.println(b);
            }
            b++;
        }
    }
}