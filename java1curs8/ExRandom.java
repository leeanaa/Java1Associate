import java.util.Random;
public class ExRandom {
    public static void main (String [] args){
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
    }
}