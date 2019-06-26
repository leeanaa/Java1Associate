public class TestSingleton{
    public static void main(String [] args){
        ConnectionBD a = ConnectionBD.getMyInstance();
        System.out.println(a);
        ConnectionBD b = ConnectionBD.getMyInstance();
        System.out.println(b);
    }
}