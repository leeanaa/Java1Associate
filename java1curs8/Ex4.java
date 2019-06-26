import java.util.Scanner;
public class Ex4{
    public static void main (String [] args){
        Scanner scanner  = new Scanner(System.in);
        String nr1 = scanner.nextLine();
        String nr2 = scanner.nextLine();
        
        int a,b;
        
        try {
            a = Integer.parseInt(nr1);
        }catch(Exception e){
            a=0;
        }
        
        try {
            b = Integer.parseInt(nr1);
        }catch(Exception e){
            b=0;
        }
        
        System.out.println(Math.pow(a,b));
    }
}