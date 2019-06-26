public class TestAnimal{
    public static void main(String [] args){
        Animal a = new Animal(){
            
            @Override
            public void mananca(){
                System.out.println("Animalul mananca");
            }
            
            public void beaApa(){
            
            }
        };
        a.mananca();
    }
}