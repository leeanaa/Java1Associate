public class Exemplul1{
    public static void main (String [] args){
        int anotimp = 3;
        
        if (anotimp==1){
            int a = 2;
            System.out.println("Primavara");
        }else if(anotimp==2){
            System.out.println("Vara");
        }else if(anotimp==3){
            System.out.println("Toamna");
        }else{
            System.out.println("Iarna");
        }
        
        //System.out.println(a);
        
        switch(anotimp){
            case 1 : System.out.println("Primavara");
                     break;
            default: System.out.println("Nu exista anotimp");
                     break;
            case 2 : System.out.println("Vara");
                     break;
            case 3 : System.out.println("Toamna");
                     break;
            case 4 : System.out.println("Iarna");
                     break;
            
        }
    }
}