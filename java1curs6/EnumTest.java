public class EnumTest{
    public static void main (String [] args){
        Season anotimp = Season.VARA;
        
        if(anotimp==Season.VARA){
            System.out.println("Este vara");
        }
        
        /*switch(anotimp){
            case PRIMAVARA : System.out.println("Este primavara");
            break;
            case VARA : System.out.println("Este vara");
            break;
            case TOAMNA : System.out.println("Este toamna");
            break;
            case IARNA : System.out.println("Este iarna");
            break;
        }*/
        for(Season season : Season.values()){
            System.out.println(season.name());
            System.out.println(season.ordinal());
            System.out.println("Valoare temp medie"+ season.getValMin());
            season.setValMin(season.getValMin()+5);
        }
        
         System.out.println("+++++++++++");
         
        for(Season season : Season.values()){
            System.out.println(season.name());
            System.out.println(season.ordinal());
            System.out.println("Valoare temp medie"+ season.getValMin());
            
        }
    }
}