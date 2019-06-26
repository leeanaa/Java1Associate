public class Exemplul2 {
    public static void main (String [] args){
        boolean isValid=true;
        //System.out.println(isValid);
        if(isValid){
            System.out.println("Este valid");
        }else {
            System.out.println("Nu este valid");
        }
        //operatorul ternar
        System.out.println( isValid ? "Este valid":"Nu este valid");
        int b = isValid ? 1:0;
    }
}