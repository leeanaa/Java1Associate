

public class ExBreackContinue{
    public static void main (String [] args){
    int a=1;
    while (a<=10){
        if (a%5==0){
            a++;
            continue;
        }
        System.out.println(a);
        a++;
    }
        
        
    for(int i=1;i<=10;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
        
    }
}
