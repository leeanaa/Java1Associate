public class TestException {
    public void m1() throws NoMoneyException{
    
    }
    public void m2() throws PinIncorectException{
        throw new PinIncorectException();
    
    }
    
    public static void main (String [] args){
        TestException te = new TestException();
        try {
            te.m1();
        }catch(NoMoneyException n){
        
        }
        te.m2();
    }
}