

public class ThreadEx
{
    public static void main(String [] args){
    NrPareThread np= new NrPareThread();
    //np.run();//e secvential
    
    np.start(); //pornerste thread, si continua cu urmatoarea linie
    System.out.println("S-a creat un fir de executie");
    
    Runnable r = new Runnable() {//runnable e o interfata , tre sa dai un corp cu metoda run
     @Override
     public void run(){
         for(int i=1;i<1000;i+=2){
             System.out.println(i);
            }
    }
};

Thread t= new Thread(r);
t.start();

try{
np.join();
t.join();
Thread.sleep(2000); //opriti o perioada de timp

}catch (InterruptedException e) {
    e.printStackTrace();
}//tratare o exceptie

System.out.println("S-a terminat executia");

}}

