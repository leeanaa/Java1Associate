

public class NrPareThread extends Thread
{
    @Override
   public void run() {
       
       for (int i=0; i<1000; i+=2)
       System.out.println(i);
    }
}
