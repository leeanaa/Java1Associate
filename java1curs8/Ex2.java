import java.util.Scanner;
public class Ex2{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String nr1 = scanner.nextLine();
        String nr2 = scanner.nextLine();
        int x;
        int y;
        
        try {
            y= Integer.parseInt(nr2);
        }catch(Exception e){
            y=0;
        }
        
        try {
            x= Integer.parseInt(nr1);
        }catch(Exception e){
            x=0;
        }
        System.out.println(x+y);
    }
}