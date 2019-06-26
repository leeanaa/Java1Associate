public class Cangur implements Animal,Mamifer{
    public void seDeplaseaza(){
        System.out.println("Cangurul sare");
    }
    
    public void mananca(){
        System.out.println("Cangurul mananca"+Animal.VARSTA);
    }
    
    public boolean inoata(){
        Animal a = new Cangur();
        return false;
    }
    
    public void alapteaza(){
    }
}