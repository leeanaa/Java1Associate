public interface Animal{
    public static final int VARSTA=20;//pot avea doar constante
    //public static final se subaintelege
    public abstract void mananca();
    // public abstract
    public void seDeplaseaza();
    /*public void doarme(){
    
    }*/
    
    default public void doarme(){
   
    }
    
    //public void beaApa;
}