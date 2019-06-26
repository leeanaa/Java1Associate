import java.util.Scanner;
public class ExScanner {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String s1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s1);
        System.out.println(sb.reverse());
    }
}
