public class TestEnc{
    public static void main(String [] args){
        Articol a = new Articol("Fanta",6.5,true);
        System.out.print(a.getDenumire());
        a.setDenumire("Mirina");
        System.out.print(a.getDenumire());
    }
}