
import java.util.*;

public class VehiculMain{
   public static void main (String [] args){
      
   Scanner scanner = new Scanner(System.in);
   while(true){
    String s1= scanner.nextLine();
    
    String[] val= s1.split(" ");
    
        switch (val[0]){
            case "exit": 
                    System.exit(0);
                    break;
            case "nr" : 
                    System.out.println(ListSingleton.getInstance().getList().size());
                    break;
            case "nrm" :
                    System.out.println(ListSingleton.getInstance().getNrMasini());
                    break;
            case "nrb" :
                    System.out.println(ListSingleton.getInstance().getNrBiciclete());
                    break;
            case "ab" : 
                    Bicicleta b= new Bicicleta(val[1], val[2]);
                    ListSingleton.getInstance().getList().add(b);
                    break;
            case "am" : 
                   // Masina m= new Masina(val[1], val[2], ((int)val[3]));
                   // ListSingleton.getInstance().getList().add(m);
                    break;
        }
    }
    
    }
}
