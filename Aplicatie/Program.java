import java.util.*;
public class Program {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String comanda = scanner.nextLine();
            String [] cuv = comanda.split(" ");
            switch (cuv[0]){
                case "ab":
                    Bicicleta b = new Bicicleta (cuv[1],cuv[2]);
                    ListSingleton.getInstance().adaugareLista(b);
                    break;
                case "am":
                    Masina m = new Masina (cuv[1],cuv[2],Integer.parseInt(cuv[3]));
                    ListSingleton.getInstance().adaugareLista(m);
                    break;
                case "afisare":
                    ListSingleton.getInstance().afisareLista();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "nr":
                    System.out.println(ListSingleton.getInstance().getList().size());
                    break;
                case "nrb":
                    System.out.println(ListSingleton.getInstance().getNumarBiciclete());
                    break;
                case "nrm":
                    System.out.println(ListSingleton.getInstance().getNumarMasini());
                    break;
            }
        }
    
    }


}