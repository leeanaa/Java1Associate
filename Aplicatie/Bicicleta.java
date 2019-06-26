public class Bicicleta extends Vehicul {
    public Bicicleta(String marca, String culoare){
        super (marca,culoare);
    }
    @Override
    public String toString(){
        return "marca "+this.marca+" culoare "+this.culoare;
    }
}