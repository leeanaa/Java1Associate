public class Animal{
    public Animal(){
        
    }
    
    public void seHraneste(){
        System.out.println("Animalul se hraneste");
    }
    
    public void seHraneste(String hrana){
        System.out.println("Animalul se hraneste cu" + hrana);
    }
    
    public void seHraneste(String hrana,boolean ziua){
        System.out.println("Animalul se hraneste cu " + hrana + (ziua?" ziua ":" noaptea "));
    }
    
    public static void main(String [] args){
        Animal a = new Animal();
        a.seHraneste();
        a.seHraneste("carne");
        a.seHraneste("carne",false);
    }
}