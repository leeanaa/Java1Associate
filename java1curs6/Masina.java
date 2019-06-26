public class Masina{
    String marca;
    String model;
    Masina(String marca,String model){
        this.marca=marca;
        this.model=model;
    }
    @Override
        public String toString(){
            return (" "+this.marca + this.model);
        } 
}